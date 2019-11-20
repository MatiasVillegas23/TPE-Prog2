package establishment;

import java.util.ArrayList;

import filter.*;

public class AgroBusiness extends Establishment{
	private ArrayList<Establishment> establishments;
	
	public AgroBusiness(String n) {
		super(n);
		this.establishments = new ArrayList<Establishment>();
	}
	
	public ArrayList<Animal> sellAnimals(Filter f){
		ArrayList<Animal> aux = new ArrayList<>();
		for(Establishment e: establishments)
			aux.addAll(e.sellAnimals(f));
		return aux;
	}
	
	/*public boolean isOkToSell(UnitaryFilter f){
		for (int i = 0; i < this.establishments.size(); i++) {
			if (!(this.establishments.get(i).isOkToSell(f))) {
				return false;
			}
		}
		return true;
	}*/
	
	@SuppressWarnings("unchecked")
	public ArrayList<Establishment> getEstablishments() {
		return (ArrayList<Establishment>) establishments.clone();
	}

	@Override
	public int getAgeMonth() {
		int sum = 0;
		for (int i = 0; i < this.establishments.size(); i++) {
			sum += this.establishments.get(i).getAgeMonth();
		}
		return sum;
	}

	@Override
	public double getWeight() {
		double sum = 0;
		for (int i = 0; i < this.establishments.size(); i++) {
			sum += this.establishments.get(i).getWeight();
		}
		return sum;
	}
	
	public int getCantAnimals() {
		int sum = 0;
		for (int i = 0; i < this.establishments.size(); i++) {
			sum += this.establishments.get(i).getCantAnimals();
		}
		return sum;
	}

	/*@Override
	public double getTotalWeight() {
		return this.getWeight();
	}*/
	
	public boolean deleteAnimal(Animal a){
		if (this.establishments.contains(a)) {
			removeAnimal(a);
			return true;
		}else
		for (int i = 0; i < this.establishments.size(); i++) {
			if (this.establishments.get(i).deleteAnimal(a)) {
				return true;
			}
		}
		return false;
	}

	public void addAnimal(Establishment e) {
		this.establishments.add(e);
	}
	
	public void removeAnimal(Animal a) {
		this.establishments.remove(a);
	}

}