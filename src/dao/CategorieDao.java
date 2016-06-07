package dao;

import beans.Categorie;;

public interface CategorieDao {
	  
	void creer( Categorie categorie ) throws DAOException;
    
	void modifier (Categorie categorie ) throws DAOException;
	
	void supprimer (Categorie categorie ) throws DAOException;
	
	Categorie trouver( String id ) throws DAOException;

}
