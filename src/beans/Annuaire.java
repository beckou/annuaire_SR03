package beans;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.lang.model.element.Element;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import dao.DAOFactory;
import com.sun.corba.se.impl.orbutil.graph.Node;
import dao.AnnonceDao;
import dao.CategorieDao;

@WebServlet("/Annuaire")
public class Annuaire extends HttpServlet{

	
	List<Categorie> categories;
	File fXmlFile;
    private AnnonceDao annonceDAO;
    private CategorieDao categorieDAO;

    public static final String CONF_DAO_FACTORY = "daofactory";

	
	public  Annuaire(){
		categories = new ArrayList<Categorie>();
		
	 
		
	}
	// (DAOFactory) getServletContext().getAttribute( CONF_DAO_FACTORY ) ).getCategorieDao()
    public void init() throws ServletException {
        this.categorieDAO = ((DAOFactory) getServletContext().getAttribute(CONF_DAO_FACTORY)).getCategorieDao();
        this.annonceDAO = ((DAOFactory) getServletContext().getAttribute(CONF_DAO_FACTORY)).getAnnonceDao();

    }
	public void createCategory(String newCategory) throws SAXException, IOException, ParserConfigurationException{
		// create new categorie
		Categorie categorie = new Categorie();
		categorie.setName(newCategory);
		categorieDAO.creer(categorie);
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
