package ministry;
import java.util.ArrayList;
import establishment.*;

public class Ministry {
	private String name;
	private ArrayList<Category> categories;

	public Ministry(String name){
		this.setName(name);
		this.categories = new ArrayList<Category>();
	}
	
	public ArrayList<String> listCategories(Animal a){
		ArrayList<String> aux = new ArrayList<String>();
		
		for (int i = 0; i < categories.size(); i++) {
			if(categories.get(i).belong(a)){
				aux.add(categories.get(i).getName());
			}
		}
		return aux;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Category> getCategories(){
		return (ArrayList<Category>) this.categories.clone();
	}
	
	public void addCategory (Category c){
		this.categories.add(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}