package establishment;

import java.util.ArrayList;

import filter.*;

public abstract class Establishment {
	private String name;
	
	
	public Establishment(String n){
		this.setName(n);
	}
	
	public abstract int getCantAnimals();
	
	//public abstract double getTotalWeight();
	
	public abstract int getAgeMonth();//edad total del simple suma de edades de todo lo que contiene el compuesto
	
	public abstract double getWeight();//pero total del simple y suma de pesos de todo lo que contiene el compuesto
	
	public abstract ArrayList<Animal> sellAnimals(Filter f);
	
	public abstract boolean deleteAnimal(Animal a);
	
	//public abstract boolean isOkToSell(UnitaryFilter f);
	
	public int getAverageAge(){
		return this.getAgeMonth()/this.getCantAnimals();
	}
	
	public Double getAverageWeight(){
		return this.getWeight()/this.getCantAnimals();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}