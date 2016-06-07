package dao;

import beans.Addresse;
import beans.Annonce;
import beans.Categorie;


public interface AnnonceDao {

	  
	void creer( Annonce annonce ) throws DAOException;
  
	void modifier (Annonce annonce ) throws DAOException;
	
	void supprimer ( Annonce annonce) throws DAOException;
	
	Annonce trouver( Addresse add ) throws DAOException;

	Annonce trouver( Categorie cat ) throws DAOException;

	
	
}
