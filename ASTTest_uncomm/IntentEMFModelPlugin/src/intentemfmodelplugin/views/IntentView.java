package intentemfmodelplugin.views;


import intentemfmodelplugin.Data.XmlReader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.internal.corext.dom.ASTNodes;
import org.eclipse.jdt.core.dom.NodeFinder;
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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.jdt.ui.JavaUI;

import androidintentsdsl.Extra;
import androidintentsdsl.Intent;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class IntentView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "intentemfmodelplugin.views.IntentView";

	private TableViewer viewer;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			XmlReader xml = new XmlReader();
	
			// Get the list of Intents
			EList<Intent> listOfIntents = xml.readXML().getAvailableIntents();

			// Make a list of the intents names
			String[] intentNames = new String[listOfIntents.size()];
			int i = 0;
			for (Intent intent : listOfIntents) 
			{
				intentNames[i] = intent.getName();
				i++;
			}
			
			return intentNames;
		}
	}
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().
					getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public IntentView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "IntentEMFModelPlugin.viewer");
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
				IntentView.this.fillContextMenu(manager);
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

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				
				XmlReader xml = new XmlReader();
				Intent intent = xml.SetIntentUserInput(xml.GetIntentByName(obj.toString()));
				
				// Generate intent code etc.
				ITextEditor editor = getCurrentEditor();
				ICompilationUnit unit = getCurrentICompilationUnit(editor);
				CompilationUnit cu = parse(unit);
				cu.recordModifications();
				AST ast = cu.getAST();
				if (ast != null)
				{
					// Create statement(s)
					Block code = ast.newBlock();
					String intentName = "intent";
					
					// Intent intent = new Intent();
					Statement st = generateAssignmentCode(ast, "Intent", intentName);
					code.statements().add(st);
					
					// .setAction(xxx);
					Map<String, Class<?>> actionParams = new LinkedHashMap<String, Class<?>>();
					actionParams.put(intent.getAction().getName(), String.class);
					
					// Add protocol
					if (intent.getAction().getData().getProtocol() != null)
					{					
						String uriName = "uri";
						String uriClass = "Uri";
						Assignment a = ast.newAssignment();
						a.setOperator(Assignment.Operator.ASSIGN);

						VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
						vdf.setName(ast.newSimpleName(uriName));
						VariableDeclarationExpression vde = ast
								.newVariableDeclarationExpression(vdf);
						// TODO: Specific type
						vde.setType(ast.newSimpleType(ast.newSimpleName(uriClass)));
						a.setLeftHandSide(vde);

						MethodInvocation methodInvocation = ast.newMethodInvocation();
						methodInvocation.setExpression(ast.newSimpleName(uriName));
						methodInvocation.setName(ast.newSimpleName("parse"));
						StringLiteral strLit = ast.newStringLiteral();
						strLit.setLiteralValue(intent.getAction().getData().getProtocol().getValue() + intent.getAction().getData().getParameter());
						methodInvocation.arguments().add(strLit);
						a.setRightHandSide(methodInvocation);
						code.statements().add(ast.newExpressionStatement(a));
						actionParams.put(uriName, Integer.class);
					}
					Statement actionStatm = generateMethodInvocationCode(ast, intentName, "setAction", actionParams);
					code.statements().add(actionStatm);
					
					// .putExtra(xxx);
					for (int i = xml.RemoveNullsExtra(intent.getSelectedExtras()).size() - 1; i >= 0; i--)
					{
						Map<String, Class<?>> extraParams = new LinkedHashMap<String, Class<?>>();
						extraParams.put(xml.RemoveNullsExtra(intent.getSelectedExtras()).get(i).getKey(), String.class);
						extraParams.put(xml.RemoveNullsExtra(intent.getSelectedExtras()).get(i).getValue().toString(), String.class);
						Statement extraStatm = generateMethodInvocationCode(ast, intentName, "putExtra", extraParams);
						code.statements().add(extraStatm);
					}
					
					//startActivity(intent)
					Map<String, Class<?>> startParams = new LinkedHashMap<String, Class<?>>();
					startParams.put("intent", Integer.class);
					Statement startStatm = generateMethodInvocationCode(ast, null, "startActivity", startParams);
					code.statements().add(startStatm);
					
					// Rewrite AST
					ASTRewrite rewrite = ASTRewrite.create(ast);
					ASTNode node = getSelectedNode(cu, editor);
					insertGeneratedCode(ast, node, code, rewrite);
					
					// Update AST
					updateAST(rewrite, unit);
				}
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Intent View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	public ASTNode getSelectedNode(CompilationUnit cu, ITextEditor editor)
	{
		ITextSelection selection = (ITextSelection)editor.getSelectionProvider().getSelection();
		ASTNode node = NodeFinder.perform(cu, selection.getOffset(), selection.getLength());
		return node;
	}
	
	public ITextEditor getCurrentEditor()
	{
		ITextEditor editor = (ITextEditor) PlatformUI.getWorkbench()
		        .getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		return editor;
	}
	
	public ICompilationUnit getCurrentICompilationUnit(ITextEditor editor)
	{
		IEditorInput editorInput = editor.getEditorInput();
		IJavaElement elem = JavaUI.getEditorInputJavaElement(editorInput);
		if (elem instanceof ICompilationUnit) {
		    ICompilationUnit unit = (ICompilationUnit) elem;
		    return unit;
		}
		else
		{
			return null;
		}
		
	}
	
	public CompilationUnit getCurrentCompilationUnit(ICompilationUnit unit)
	{
	    Document doc;
		try {
			doc = new Document(unit.getSource());
			
			ASTParser parser = ASTParser.newParser(AST.JLS4);
			parser.setSource(doc.get().toCharArray());
			CompilationUnit cu = (CompilationUnit) parser.createAST(null);
			
			return cu;
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
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
			}
			methodInvocation.arguments().add(param);
		}

		ExpressionStatement statement = ast
				.newExpressionStatement(methodInvocation);

		return statement;
	}
	
	public void insertGeneratedCode(AST ast, ASTNode node, Block code, ASTRewrite rewriter){		
		// Find parent method
		@SuppressWarnings("restriction")
		ASTNode parentMethod = ASTNodes.getParent(node, ASTNode.METHOD_DECLARATION);
		Block block = ((MethodDeclaration) parentMethod).getBody();
		
		// Recognizes where in the method to insert the code AND inserts it
		ListRewrite listRewrite = rewriter.getListRewrite(block, Block.STATEMENTS_PROPERTY);
		int curNodeType = -1;
		while (node.getNodeType() != ASTNode.VARIABLE_DECLARATION_STATEMENT) {
			curNodeType = node.getNodeType();
			if (node.getNodeType() == ASTNode.METHOD_DECLARATION) {
				for (int i = code.statements().size() - 1; i >= 0; i--)
				{
					listRewrite.insertFirst((ASTNode) code.statements().get(i), null);
				}
				break;
			}
			node = node.getParent();
		}
		if (node.getNodeType() == ASTNode.VARIABLE_DECLARATION_STATEMENT) {
			for (int i = code.statements().size() - 1; i >= 0; i--)
			{
				listRewrite.insertAfter((ASTNode) code.statements().get(i), node, null);
			}
		}
	}
	
	public void updateAST(ASTRewrite rewrite, ICompilationUnit unit) {
		TextEdit edits;
		try {
			edits = rewrite.rewriteAST();
			Document doc = new Document(unit.getSource());
			edits.apply(doc);
			unit.getBuffer().setContents(doc.get());
		} catch (JavaModelException | IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedTreeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected CompilationUnit parse(ICompilationUnit unit) {
		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(unit); // set source
		parser.setResolveBindings(true); // we need bindings later on
		return (CompilationUnit) parser.createAST(null /* IProgressMonitor */); // parse
	}
}