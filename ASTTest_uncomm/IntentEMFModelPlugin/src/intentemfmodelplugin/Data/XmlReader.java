package intentemfmodelplugin.Data;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.EList;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import androidintentsdsl.Action;
import androidintentsdsl.AndroidintentsdslFactory;
import androidintentsdsl.Data;
import androidintentsdsl.Exception;
import androidintentsdsl.Extra;
import androidintentsdsl.Intent;
import androidintentsdsl.IntentsCollection;
import androidintentsdsl.Protocol;
import androidintentsdsl.UsesPermission;
import androidintentsdsl.impl.AndroidintentsdslFactoryImpl;
import androidintentsdsl.impl.AndroidintentsdslPackageImpl;

public class XmlReader {

	private AndroidintentsdslFactoryImpl factory;

	public XmlReader() {
		AndroidintentsdslPackageImpl.init();
		factory = (AndroidintentsdslFactoryImpl) AndroidintentsdslFactory.eINSTANCE;
	}

	private void writeXML() {
		Document doc = new Document();
	}
	
	public Intent GetIntentByName(String intentName)
	{
		Intent intent = null;
		
		IntentsCollection list = readXML();
		for(Intent thisIntent : list.getAvailableIntents())
		{
			if(thisIntent.getName().equalsIgnoreCase(intentName))
				intent = thisIntent;
		}
		return intent;
	}
	
	
	public IntentsCollection readXML() {
		SAXBuilder builder = new SAXBuilder();
		IntentsCollection collection = factory.createIntentsCollection();
		Document readDoc = null;
		try {
			readDoc = builder.build(new URL("http://mwsoftware.dk/Intents.xml"));

			// REad all Intents to list
			for (int i = 0; i < readDoc.getRootElement().getChildren().size(); i++) {
				// Element containing one Intent
				Element intent = (Element) readDoc.getRootElement().getChildren().get(i);

				// make new Intent
				// IntentTest n = new IntentTest(intent);
				Intent newIntent = InitIntent(intent);

				// add Intent to list
				collection.getAvailableIntents().add(newIntent);
			}

		} catch (JDOMException | IOException e) {
			String error = e.getMessage();
			System.out.println(error);
		}

		return collection;
	}

	private Intent InitIntent(Element intentElement) {
		// initiate element lists from XML
		List<Element> permissionsFromXml = GetListFromXml(intentElement
				.getChild("Action").getChild("Permisions"), "UsesPermision");
		List<Element> extrasFromXml = GetListFromXml(
				intentElement.getChild("Extras"), "Extra");
		List<Element> exceptionsFromXml = GetListFromXml(
				intentElement.getChild("AndroidExceptions"), "AndroidException");
		List<Element> ProtocolsFromXml = GetListFromXml(
				intentElement.getChild("Action").getChild("Protocols"),
				"Protocol");

		Intent intent = factory.createIntent();

		// set intent name
		intent.setName(intentElement.getAttributeValue("name"));
		intent.setDescription(intentElement.getAttributeValue("description"));
		
		// set action
		Action action = factory.createAction();
		action.setName(intentElement.getChild("Action").getAttributeValue(
				"name"));
		intent.setAction(action);

		// loop protocols
		for (int j = 0; j < ProtocolsFromXml.size(); j++) {
			// set protocol name
			Protocol p = factory.createProtocol();
			p.setName(ProtocolsFromXml.get(j).getName());

			// set protocol value
			p.setValue(ProtocolsFromXml.get(j).getValue());
			intent.getAction().getAvailableProtocols().add(p);
		}

		// Set mimetype, if not null
		if (!intentElement.getChild("Action").getChild("MimeType").getValue()
				.isEmpty()) {
			String mimetype = intentElement.getChild("Action")
					.getChild("MimeType").getValue().toString();

			Data dataObject = factory.createData();
			dataObject.setMimeType(mimetype);

			intent.getAction().setData(dataObject);
		} else { // set empty data object
			Data dataObject = factory.createData();
			intent.getAction().setData(dataObject);
		}

		// set permissions
		for (int i = 0; i < permissionsFromXml.size(); i++) {
			UsesPermission permission = factory.createUsesPermission();
			permission.setName(permissionsFromXml.get(i).getAttributeValue(
					"name"));
			permission.setValue(permissionsFromXml.get(i).getValue());
			intent.getAction().getPermissions().add(permission);
		}

		// set extras
		for (int j = 0; j < extrasFromXml.size(); j++) {
			Extra extra = factory.createExtra();
			extra.setKey(extrasFromXml.get(j).getAttributeValue("name"));
			extra.setValue(extrasFromXml.get(j).getValue().toString());
			extra.setValueType(extrasFromXml.get(j).getAttributeValue("type"));
			intent.getAvailableExtras().add(extra);
		}

		// set exceptions
		for (int k = 0; k < exceptionsFromXml.size(); k++) {
			Exception ex = factory.createException();
			ex.eClass().setName(exceptionsFromXml.get(k).getValue());
			intent.getExceptionsThrown().add(ex);
		}

		return intent;
	}

	public Intent SetIntentUserInput(Intent i) {
		List<Extra> extras = RemoveNullsExtra(i.getAvailableExtras());
		List<Protocol> protocols = (List<Protocol>) i.getAction()
				.getAvailableProtocols();
		String inputValue = "";

		// get user input for protocol value (if not empty)
		if (protocols.size() > 0) {
			// set protocol values to an object array
			Object[] allProtocols = new Object[protocols.size()];
			for (int j = 0; j < protocols.size(); j++) {
				allProtocols[j] = protocols.get(j).getValue();
			}

			int result = JOptionPane.showOptionDialog(null,
					"Please select a protocol", "Select a protocol",
					JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null, allProtocols, null);

			if (result > -1) {
				// get protocol
				Protocol p = protocols.get(result);

				// get user input for parameter
				inputValue = JOptionPane
						.showInputDialog("Enter parameter for "
								+ p.getValue());
				if (inputValue != "") {
					// set the selected protocol and the parameter with the user
					// input
					i.getAction().getData().setParameter(inputValue);
					i.getAction().getData().setProtocol(p);
				}
			}
		}

		if (extras.size() > 0) {
			// does user want extras ?
			if (JOptionPane.showConfirmDialog(null, "",
					"Do you want to use extras?", JOptionPane.YES_NO_OPTION) == 0) {
				for (int k = 0; k < extras.size(); k++) {
					String input = JOptionPane
							.showInputDialog(null, "Enter content for "
									+ extras.get(k).getKey() + ":",
									"Enter content for extra",
									JOptionPane.OK_CANCEL_OPTION);
					if (input != null) {
						// set selected extra with user input
						Extra extraInput = extras.get(k);
						extraInput.setValue(input);
						i.getSelectedExtras().add(extraInput);
					}
				}
			}
		}

		return i;
	}
	
	public List<Extra> RemoveNullsExtra(List<Extra> elems)
	{
		List<Extra> elements = new ArrayList<Extra>();
		for (Extra e : elems)
		{
			if (e != null)
			{
				elements.add(e);
			}
		}
		return elements;
	}
	
	public List<Protocol> RemoveNullsProtocol(List<Protocol> elems)
	{
		List<Protocol> elements = new ArrayList<Protocol>();
		for (Protocol p : elems)
		{
			if (p != null)
			{
				elements.add(p);
			}
		}
		return elements;
	}

	public List<Element> GetListFromXml(Element e, String children) {
		List<Element> resultList = new ArrayList<Element>();
		
		int test = e.getChildren(children).size();
		for (int i = 0; i < test; i++) {
			resultList.add((Element) e.getChildren(children).get(i));
		}

		return resultList;
	}
}
