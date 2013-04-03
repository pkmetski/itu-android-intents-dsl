package emfintentmodelling.usingmodel.controller;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

import emfintentmodelling.usingmodel.views.XMLModifier;

import EMFIntentModelling.androidintentsdsl.AndroidintentsdslFactory;
import EMFIntentModelling.androidintentsdsl.Intent;
import EMFIntentModelling.androidintentsdsl.IntentsCollection;
import EMFIntentModelling.androidintentsdsl.impl.AndroidintentsdslPackageImpl;

public class MainController {
	private EList<Intent> availableIntents;

	public MainController() {
		AndroidintentsdslPackageImpl.init();
		AndroidintentsdslFactory factory = AndroidintentsdslFactory.eINSTANCE;
		IntentsCollection col = factory.createIntentsCollection();

		// read xml and fill the intent instances
		availableIntents = col.getAvailableIntents();
	}

	public Object[] getAvailableIntents() {
		return availableIntents.toArray();
	}

	public void intentSelected(Object intent) {

		intent = (Intent) intent;

		// go through the intent object
		// instantiate the java model with the intent data

		// if (intent.toString().equalsIgnoreCase("Call a phone")) {
		// pasteText += "Intent intentToCall = new Intent();";
		// } else if (intent.toString().equalsIgnoreCase("Send a SMS")) {
		// pasteText += "Intent intentToSms = new Intent();";
		// } else if (intent.toString().equalsIgnoreCase("Send an email")) {
		// pasteText += "Intent intentToEmail = new Intent();";
		// } else {
		// pasteText += "Intent intent = new Intent();";
		// }
		// try {
		// IWorkbenchPage page = getSite().getPage();
		// IEditorPart part = page.getActiveEditor();
		//
		// if (!(part instanceof AbstractTextEditor))
		// return;
		// ITextEditor editor = (ITextEditor) part
		// .getAdapter(ITextEditor.class);
		// IDocumentProvider provider = editor.getDocumentProvider();
		// IDocument doc = provider.getDocument(editor.getEditorInput());
		// ITextSelection textSelection = (ITextSelection) editor.getSite()
		// .getSelectionProvider().getSelection();
		// int off = textSelection.getOffset();
		// doc.replace(off, 0, pasteText + "\n");
		//
		// } catch (BadLocationException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// Modify xml
		//XMLModifier xmlModifier = new XMLModifier();
		//xmlModifier.modifyXMLFile();
	}
}
