package truck;

public class Truck {
	private int id;
	private int capacity;
	
	public Truck(int id, int c) {
		this.id = id;
		this.capacity = c;
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
