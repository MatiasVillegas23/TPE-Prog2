package main;

import java.util.ArrayList;

import establishment.*;
import filter.*;
import truck.*;

public class AgriculturalSystem {
	private AgroBusiness AgroBusiness;
	private Truck truck;
	private Filter filter;
	
	public AgriculturalSystem(AgroBusiness a, Truck t, Filter f){
		this.AgroBusiness = a;
		this.truck = t;
		this.filter = f;
	}
	
	public void loadTruck(){
		ArrayList<Animal> aux = new ArrayList<>();
		aux = this.AgroBusiness.sellAnimals(this.filter);
		ArrayList<Animal> aux2 = new ArrayList<>();
		
		for (int i = 0; i < this.truck.getCapacity() && i < aux.size() ; i++) {
			this.truck.addAnimal(aux.get(i));
			aux2.add(aux.get(i));
		}
		deleteAnimals(aux2);
	}
	
	private void deleteAnimals(ArrayList<Animal> a){
		for (int i = 0; i < a.size(); i++) {
			this.AgroBusiness.deleteAnimal(a.get(i));
		}
	}
	
	public ArrayList<Animal> listAnimals(){
		return this.truck.getAnimals();
	}
}
