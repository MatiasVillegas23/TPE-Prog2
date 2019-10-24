package establishment;

import filter.*;

public abstract class Establishment {
	private String nombre;
	
	
	public Establishment(String n){
		this.nombre = n;
	}
	
	public abstract int getAverageAgeMonth();//borra esto, agregar metodos abs
	
	public abstract int getCantAnimals();
	
	public abstract double getTotalWeight();
	
	public abstract double getAverageWeight();
	
	public abstract boolean isFilterOk(Filter f);
	
}