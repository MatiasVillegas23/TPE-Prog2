package establishment;

import filter.UnitaryFilter;
import truck.*;

public abstract class Establishment {
	private String name;
	
	
	public Establishment(String n){
		this.setName(n);
	}
	
	public abstract int getAverageAgeMonth();
	
	public abstract int getCantAnimals();
	
	public abstract double getTotalWeight();
	
	public abstract double getAverageWeight();
	
	public abstract boolean sellAnimals(Truck t);
	
	public abstract boolean isOkToSell(UnitaryFilter f);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}