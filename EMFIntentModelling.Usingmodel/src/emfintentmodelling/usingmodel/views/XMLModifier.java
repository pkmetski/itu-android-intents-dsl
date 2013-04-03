package emfintentmodelling.usingmodel.views;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IFileEditorInput;

public class XMLModifier {
	
	public void modifyXMLFile() {
		 
		  try {
				// PROJECT PATH
				String workingDir = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	
				// PROJECT NAME
				IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				String activeProjectName = "";
				if(editorPart != null)
				{
					IFileEditorInput input = (IFileEditorInput)editorPart.getEditorInput() ;
					IFile file = input.getFile();
					IProject activeProject = file.getProject();
					activeProjectName = activeProject.getName();
				}
				
				// PROJECT FULL PATH
				workingDir += "/" + activeProjectName;
				
				// EDIT MANIFEST
				SAXBuilder builder = new SAXBuilder();
				File xmlFile = new File(workingDir+"/AndroidManifest.xml");
		 
				Document doc = (Document) builder.build(xmlFile);
				Element rootNode = doc.getRootElement();
		 
				// add new permission element
				Element intent = new Element("uses-permission").setAttribute("android---name","android.permission.INTERNET");
				rootNode.addContent(intent);
				
				XMLOutputter xmlOutput = new XMLOutputter();
		 
				// display nice nice
				xmlOutput.setFormat(Format.getPrettyFormat());
				xmlOutput.output(doc, new FileWriter(workingDir+"/AndroidManifest.xml"));
				
				// xmlOutput.output(doc, System.out);
				
				StringBuilder sb = new StringBuilder();
				BufferedReader br = new BufferedReader(new FileReader(xmlFile));
				String line = null;
				while((line = br.readLine())!= null){
				    if(line.indexOf("abc") != -1)
				        line = line.replaceAll("---",":");
	                sb.append(line);
				}
				br.close();
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(xmlFile));

				bw.write(sb.toString());
				bw.close();
		  	} 
		  	catch (IOException io) {
		  		io.printStackTrace();
		  	} 
		  	catch (JDOMException e) {
		  		e.printStackTrace();
		  	}  
		}
}
