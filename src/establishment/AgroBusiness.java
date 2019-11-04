package establishment;

import java.util.ArrayList;

import filter.*;
import truck.*;

public class AgroBusiness extends Establishment{
	private ArrayList<Establishment> Establishments;
	
	public AgroBusiness(String n) {
		super(n);
		this.Establishments = new ArrayList<Establishment>();
	}
	
	public boolean sellAnimals(Truck t){
		boolean r = false;
		for (int i = 0; i < this.Establishments.size() && i <= (t.getCapacity()); i++) {
			if (Establishments.get(i).sellAnimals(t)) {
				r = true;
				Establishments.remove(i);
				i--;
			}
		}
		return r;
	}
	
	public boolean isOkToSell(UnitaryFilter f){
		for (int i = 0; i < this.Establishments.size(); i++) {
			if (!(this.Establishments.get(i).isOkToSell(f))) {
				return false;
			}
		}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Establishment> getEstablishments() {
		return (ArrayList<Establishment>) Establishments.clone();
	}

	public void addAnimal(Establishment e) {
		this.Establishments.add(e);
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