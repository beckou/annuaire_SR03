package beans;
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
		

	 
		
	}
		
	public void createCategory(String newCategory) throws SAXException, IOException, ParserConfigurationException{
		// create new categorie

		
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
