package establishment;

import java.util.ArrayList;

import filter.*;

public abstract class Establishment {
	private String name;
	
	
	public Establishment(String n){
		this.setName(n);
	}
	
	public abstract int getCantAnimals();
	
	public abstract double getTotalWeight();
	
	public abstract ArrayList<Integer> getAgeMonth();
	
	public abstract ArrayList<Double> getWeight();
	
	public abstract ArrayList<Animal> sellAnimals(Filter f);
	
	public abstract void deleteAnimal(Animal a);
	
	//public abstract boolean isOkToSell(UnitaryFilter f);
	
	public int getAverageAge(){
		ArrayList<Integer> aux = this.getAgeMonth();
		int sum = 0;
		for (int i = 0; i < aux.size(); i++) {
			sum += aux.get(i);
		}
		return sum/aux.size();
	}
	
	public Double getAverageWeight(){
		ArrayList<Double> aux = this.getWeight();
		double sum = 0;
		for (int i = 0; i < aux.size(); i++) {
			sum += aux.get(i);
		}
		return sum/aux.size();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}