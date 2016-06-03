import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.corba.se.impl.orbutil.graph.Node;

public class Annuaire {

	
	List<Categorie> categories;
	File fXmlFile;

	
	public  Annuaire(){
		categories = new ArrayList<Categorie>();
		
		  try {

				File file = new File("src/annuaire.xml");

				DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
			                             .newDocumentBuilder();

				Document doc = dBuilder.parse(file);

				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

				if (doc.hasChildNodes()) {

					//printNote(doc.getChildNodes());

				}

			    } catch (Exception e) {
				System.out.println(e.getMessage());
			    }
		

	 
		
	}
		
	public void createCategory(String newCategory) throws SAXException, IOException, ParserConfigurationException{
		// create new categorie
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
    	Document document = documentBuilder.parse("server.xml");
    	Element root = (Element) document.getDocumentElement();

        categories.add(new Categorie());
        
        for(Categorie categorie: categories){
        	
        	Element newCategorie = (Element) document.createElement("Categorie");


//            name.appendChild(document.createTextNode(server.getName()));
//            newServer.appendChild(name);
//
//            Element port = document.createElement("port");
//            port.appendChild(document.createTextNode(Integer.toString(server.getPort())));
//            newServer.appendChild(port);
//
//            root.appendChild(newServer);
//        	
//        	
        }
		
	}
	
	public void modifyCategory(String category){
		// modify category
	}
	
	
	public void deleteCategory(){
		// delete category
	}
	
	
	public void addAnnonce(){
		// add an announce
	}
	
	public void deleteAnnonce(){
		// delete an announce
	}
	
	public void modifyAnnonce(){
		// modify an announce
	}
	
	public String searchAnnonce(){
		// search an announce
		return null;
	}
	
	public void displayAnnonces(){
		//afficher les annonces par adresse, par catégorie et/ou par nom.

	}
	
	
}
