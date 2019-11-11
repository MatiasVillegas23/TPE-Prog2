package main;

import java.util.ArrayList;

import establishment.*;
import filter.*;
import truck.*;

public class AgriculturalSystem {
	private Establishment establishment;
	private Truck truck;
	private Filter filter;
	
	public AgriculturalSystem(Establishment e, Truck t, Filter f){
		this.establishment = e;
		this.truck = t;
		this.filter = f;
	}
	
	public void loadTruck(){
		ArrayList<Animal> aux = new ArrayList<>();
		aux = this.establishment.sellAnimals(this.filter);
		ArrayList<Animal> aux2 = new ArrayList<>();
		
		for (int i = 0; i < this.truck.getCapacity(); i++) {
			this.truck.addAnimal(aux.get(i));
			aux2.add(aux.get(i));
		}
		deleteAnimals(aux2);
	}
	
	private void deleteAnimals(ArrayList<Animal> a){
		for (int i = 0; i < a.size(); i++) {
			this.establishment.deleteAnimal(a.get(i));
		}
	}
	
	public ArrayList<Animal> listAnimals(){
		return this.truck.getAnimals();
	}
}
