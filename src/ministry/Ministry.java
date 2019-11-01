package ministry;
import java.util.ArrayList;
import establishment.*;

public class Ministry {
	private ArrayList<Category> Categories;

	public Ministry(){
		this.Categories = new ArrayList<Category>();
	}
	
	public ArrayList<String> listCategories(Animal a){
		ArrayList<String> aux = new ArrayList<String>();
		
		for (int i = 0; i < Categories.size(); i++) {
			if(Categories.get(i).belong(a)){
				aux.add(Categories.get(i).getName());
			}
		}
		return aux;
	}
	
	public void addCategory (Category c){
		this.Categories.add(c);
	}
}