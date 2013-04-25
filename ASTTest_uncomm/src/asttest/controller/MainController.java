package asttest.controller;

public class MainController {

	/**
	 * @param args
	 */
	public String[] getItems() {
		return new String[] { "One", "Two", "Three", "Four" };
	}

	public void test() {

	}
	// ImportDeclaration id = ast.newImportDeclaration();
	// id.setName(ast.newName(new String[] {"java", "util", "Set"}));
	// ASTRewrite rewriter = ASTRewrite.create(ast);
	// TypeDeclaration td = (TypeDeclaration) cu.types().get(0);
	// ITrackedNodePosition tdLocation = rewriter.track(td);
	// ListRewrite lrw = rewriter.getListRewrite(cu,
	// CompilationUnit.IMPORTS_PROPERTY);
	// lrw.insertLast(id, null);
	// TextEdit edits = rewriter.rewriteAST(document, null);
	// UndoEdit undo = edits.apply(document);
	// assert
	// "import java.util.List;\nimport java.util.Set;\nclass X {}".equals(doc.get().toCharArray());
	// tdLocation.getStartPosition() and tdLocation.getLength()
	// are new source range for "class X {}" in doc.get()

	// IWorkbenchPage page = PlatformUI.getWorkbench()
	// .getActiveWorkbenchWindow().getActivePage();
	// IEditorPart editor = page.getActiveEditor();
	// IEditorInput input = editor.getEditorInput();
	//
	// IFile file = input instanceof FileEditorInput ? ((FileEditorInput) input)
	// .getFile() : null;
	//
	// if (file != null) {
	//
	// ICompilationUnit source = (ICompilationUnit) JavaCore.create(file);

	/*
	 * ASTParser parser = ASTParser.newParser(AST.JLS4);
	 * parser.setSource(source); parser.setResolveBindings(true);
	 * CompilationUnit sourceUnit = (CompilationUnit) parser .createAST(null);
	 */
	// int offset = getCursorOffset(page.getSelection());

	// get cursor position, which element from AST is the active one?
	// type(class) and method in that class
	// inject AST with our code at the cursor position
	// add imports (if necessary)
	// update manifest
	// save AST and refresh editor window
	// }

	/* NEEDS A CHECK FOR WHETHER THE CURSOR IS IN A METHOD BODY */
	// private int getCursorOffset(ISelection selection) {
	// TextSelection te = null;
	// return ((TextSelection) selection).getOffset();
	// }
}
