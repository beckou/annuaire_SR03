package beans;
import java.util.ArrayList;
import java.util.List;

public class Categorie {

	private String Name;
	private List<Annonce> annonce;

	public  Categorie(){
		annonce = new ArrayList<Annonce>();
	}	
	
}
