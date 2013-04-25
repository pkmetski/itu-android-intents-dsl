package asttest.views;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NodeFinder;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.ITextEditor;

import asttest.controller.MainController;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class SampleView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "asttest.views.SampleView";

	private TableViewer viewer;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;
	private MainController mc;
	private String[] fragments;

	// HASSE

	private TreeViewer fViewer;
	private CompilationUnit fRoot;

	// /////

	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			return mc.getItems();
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public SampleView() {
		mc = new MainController();
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem()
				.setHelp(viewer.getControl(), "ASTTest.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				SampleView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}

	// public Statement generateIntentCode(AST ast, Intent intent) {
	//
	// return generateAssignmentCode(ast, intent.getClass().getName(),
	// intent.getName());
	// }

	public Statement generateAssignmentCode(AST ast, String className,
			String instanceName) {

		// Intent intent = new Intent();
		Assignment a = ast.newAssignment();
		a.setOperator(Assignment.Operator.ASSIGN);

		VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
		vdf.setName(ast.newSimpleName(instanceName));
		VariableDeclarationExpression vde = ast
				.newVariableDeclarationExpression(vdf);
		// TODO: Specific type
		vde.setType(ast.newSimpleType(ast.newSimpleName(className)));
		a.setLeftHandSide(vde);

		ClassInstanceCreation newInvocation = ast.newClassInstanceCreation();
		// TODO: Specific type
		newInvocation.setType(ast.newSimpleType(ast.newSimpleName(className)));
		a.setRightHandSide(newInvocation);

		//

		return ast.newExpressionStatement(a);
	}

	@SuppressWarnings("unchecked")
	public Statement generateMethodInvocationCode(AST ast, String instanceName,
			String methodName, Map<String, Class<?>> parameters) {

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		if (instanceName != null) {
			methodInvocation.setExpression(ast.newSimpleName(instanceName));
		}
		methodInvocation.setName(ast.newSimpleName(methodName));

		for (Entry<String, Class<?>> entry : parameters.entrySet()) {
			ASTNode param;
			if (entry.getValue() == String.class) {
				param = ast.newStringLiteral();
				((StringLiteral) param).setLiteralValue(entry.getKey());
			} else {
				param = ast.newSimpleName(entry.getKey());
				// param = ast.newSimpleName("Not_a_string");
			}
			methodInvocation.arguments().add(param);
		}

		ExpressionStatement statement = ast
				.newExpressionStatement(methodInvocation);

		return statement;
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {

			public void run() {
				// ISelection selection = viewer.getSelection();
				// Object obj = ((IStructuredSelection) selection)
				// .getFirstElement();
				// showMessage("Double-click detected on " + obj.toString());

				// HASSE:

				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				ITextEditor editor = (ITextEditor) page.getActiveEditor();
				IJavaElement elem = JavaUI.getEditorInputJavaElement(editor
						.getEditorInput());

				if (elem instanceof ICompilationUnit) {
					ISelection selection = editor.getSelectionProvider()
							.getSelection();

					CompilationUnit astUnit = parse((ICompilationUnit) elem);
					// showMessage(astUnit.toString());

					// MyASTVisitor visitor = new MyASTVisitor();
					// visitor.process(astUnit);

					astUnit.recordModifications(); // NEW

					if (selection instanceof ITextSelection) {

						ASTNode node = NodeFinder.perform(astUnit,
								((ITextSelection) selection).getOffset(),
								((ITextSelection) selection).getLength());

						// TEST
						AST ast = astUnit.getAST();
						ASTRewrite rewriter = ASTRewrite.create(ast);

						TypeDeclaration typeDecl = (TypeDeclaration) astUnit
								.types().get(0);
						MethodDeclaration methodDecl = typeDecl.getMethods()[0];
						Block block = methodDecl.getBody();

						// insert the intent code here
						// Statement newStatement = generateIntentCode(ast,
						// null);
						HashMap<String, Class<?>> hm = new HashMap<String, Class<?>>();
						// TODO: Doesn't accept a numbered value, and the order
						// is wrong.
						hm.put("string1", String.class);
						hm.put("integer1", Integer.class);
						hm.put("integer2", Integer.class);
						hm.put("string2", String.class);
						hm.put("string3", String.class);
						Statement newStatement = generateMethodInvocationCode(
								ast, null, "meth", hm);

						ListRewrite listRewrite = rewriter.getListRewrite(
								block, Block.STATEMENTS_PROPERTY);

						ASTNode curNode = node;
						int curNodeType = -1;
						while (curNode.getNodeType() != ASTNode.VARIABLE_DECLARATION_STATEMENT) {
							curNodeType = curNode.getNodeType();
							if (curNode.getNodeType() == ASTNode.METHOD_DECLARATION) {
								listRewrite.insertFirst(newStatement, null);
								break;
							}
							curNode = curNode.getParent();
						}
						if (curNode.getNodeType() == ASTNode.VARIABLE_DECLARATION_STATEMENT) {
							listRewrite
									.insertAfter(newStatement, curNode, null);
						}

						// if (node.getNodeType() ==
						// ASTNode.VARIABLE_DECLARATION_STATEMENT) {
						// listRewrite.insertAfter(newStatement, node, null);
						// } else if (node.getNodeType() == ASTNode.RECOVERED) {
						// listRewrite.insertFirst(newStatement, null);
						// } else if (node.getNodeType() == ASTNode.SIMPLE_NAME)
						// {
						// listRewrite.insertAfter(newStatement, node
						// .getParent().getParent(), null);
						// } else {
						// showMessage("Ingen af ovenstående: "
						// + node.getNodeType() + "("
						// + node.getParent() + " - "
						// + node.getParent().getParent() + ")");
						// }

						try {
							TextEdit edits = rewriter.rewriteAST();

							Document document = new Document(
									((ICompilationUnit) elem).getSource());

							try {
								edits.apply(document);

								((ICompilationUnit) elem).getBuffer()
										.setContents(document.get());
							} catch (MalformedTreeException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} catch (JavaModelException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						// VariableDeclarationStatement statement =
						// createNewVariableDeclarationStatement(
						// manager, ast); // NEW
						// block.statements().add(firstReferenceIndex,
						// statement);
						// // NEW
						// }

						// String string = "";
						// for (int i = 0; i < fragments.length; i++) {
						// string += fragments[i].toString() + " ";
						// }
						// showMessage("AST: " + string);

						// ENDED: HASSE

						mc.test();
					}
				}
			}
		};
	}

	// HASSE'S FUNCTIONS AND CLASSES:
	protected CompilationUnit parse(ICompilationUnit unit) {
		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(unit); // set source
		parser.setResolveBindings(true); // we need bindings later on
		return (CompilationUnit) parser.createAST(null /* IProgressMonitor */); // parse
	}

	class MyASTVisitor extends ASTVisitor {

		public boolean visit(VariableDeclarationStatement node) {
			int i = 0;
			for (Iterator iter = node.fragments().iterator(); iter.hasNext();) {
				VariableDeclarationFragment fragment = (VariableDeclarationFragment) iter
						.next();
				showMessage("frag: " + fragment.toString());
				fragments[i] = fragment.toString();
				i++;
			}
			return false; // prevent that SimpleName is interpreted as reference
		}

		public void process(CompilationUnit unit) {
			unit.accept(this);
		}

	}

	// ENDED: HASSE'S FUNCTIONS

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"Sample View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	//
	// public String selectedString(IEditorPart editor) {
	// ISelection selection = (ITextSelection) ((ITextEditor) editor)
	// .getSelectionProvider().getSelection();
	// return ((ITextSelection) selection).getOffset();
	// }
}