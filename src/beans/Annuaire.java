package beans;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




import dao.DAOFactory;
import dao.AnnonceDao;
import dao.CategorieDao;

public class Annuaire {

	 DAOFactory dao =DAOFactory.getInstance();
     AnnonceDao annonceDAO = (AnnonceDao) dao.getAnnonceDao();
     CategorieDao categorieDAO = (CategorieDao) dao.getCategorieDao();


	
	public  Annuaire(){
		
	 
		
	}

	public void createCategory(String newCategory){
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
