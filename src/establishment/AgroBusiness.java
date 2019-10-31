package establishment;
import java.util.ArrayList;
import filter.*;
import truck.Strategy;
import truck.Truck;


public class AgroBusiness extends Establishment implements Strategy {
	private ArrayList<Establishment> Establishments;
	private Strategy strategy;
	
	public AgroBusiness(String n, Strategy strategy) {
		super(n);
		this.Establishments = new ArrayList<Establishment>();
		this.strategy = strategy;
	}
	
	@Override
	public ArrayList<Establishment> animalUp(Truck c, Strategy s) {
		ArrayList<Establishment> aux = new ArrayList<>();
		for (int i = 0; i < this.Establishments.size(); i++) {
			if(s.eval(this.Establishments.get(i)));
				aux.add(this.Establishments.get(i));
		}
		return aux;
	}
	
	public void addAnimal(Establishment e) {
		this.Establishments.add(e);
	}
	
	public boolean toSell(Filter f) {
		return isFilterOk(f);
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
