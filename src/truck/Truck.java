package truck;
import java.util.ArrayList;
import establishment.*;
import filter.*;

public class Truck {
	private int id;
	private int capacity;
	private UnitaryFilter filter;
	private ArrayList<Animal> Animals;
	
	public Truck(int id, int c, UnitaryFilter f) {
		this.id = id;
		this.capacity = c;
		this.filter = f;
		this.Animals = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal a){
		Animals.add(a);
	}
	
	public UnitaryFilter getFilter() {
		return filter;
	}

	public void setFilter(UnitaryFilter filter) {
		this.filter = filter;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Animal> getAnimals() {
		return (ArrayList<Animal>) Animals.clone();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}