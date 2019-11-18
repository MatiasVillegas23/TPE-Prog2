package truck;
import java.util.ArrayList;
import establishment.*;

public class Truck {
	private int id;
	private int capacity;
	private ArrayList<Animal> Animals;
	
	public Truck(int id, int c) {
		this.id = id;
		this.capacity = c;
		this.Animals = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal a){
		Animals.add(a);
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
		return capacity-Animals.size();
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}