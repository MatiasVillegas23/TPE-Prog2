package establishment;
import java.util.ArrayList;
import filter.*;


public class AgroBusiness extends Establishment {
	private ArrayList<Establishment> Establishments;

	public AgroBusiness(String n) {
		super(n);
		this.Establishments = new ArrayList<Establishment>();
	}

	public boolean isFilterOk(Filter f) {
		for (int i = 0; i < Establishments.size(); i++) {
			if(!f.eval(Establishments.get(i))) {
				return false;			
			}
		}
		return true;
	} 
	
	public int getCantAnimals() {
		return this.Establishments.size();
	}

	public int getAverageAgeMonth() {
		int sum = 0;
		for(int i = 1; i < Establishments.size(); i++){
			sum += Establishments.get(i).getAverageAgeMonth();
		}
		return sum / Establishments.size();
	}
	
	//recorrer el arreglo solo una vez en un método
	public double getTotalWeight() {
		int sum = 0;
		for(int i = 1; i < Establishments.size(); i++){
			sum += Establishments.get(i).getTotalWeight();
		}
		return sum;
	}
	
	public double getAverageWeight() {
		int sum = 0;
		for(int i = 1; i < Establishments.size(); i++){
			sum += Establishments.get(i).getAverageWeight();
		}
		return sum / Establishments.size();
	}

}
