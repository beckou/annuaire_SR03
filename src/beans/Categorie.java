package beans;
import java.util.ArrayList;
import java.util.List;

public class Categorie {
	private Long Id;
	private String Name;

	public  Categorie(){
	}	
	
	public Long getId() {
		return Id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setId(long l) {
		Id = l;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
