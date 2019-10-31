package main;
import filter.*;
import truck.*;
import establishment.*;

public class Main {

	public static void main(String[] args) {
		Filter f = new BreedFilter("Holando Argentino");
		Strategy s = new StrategyBreed();
		AgroBusiness a = new AgroBusiness("Hacienda Pepito", s);
		AgroBusiness c = new AgroBusiness("Hacienda Cholito", s);
		Establishment v1 = new Animal("vaca", 1, 24, 300, "Holando Argentino", 'h', false, 5);
		Establishment v2 = new Animal("vaca", 2, 12, 300, "Holando Argentino", 'h', true, 3);
		Establishment v3 = new Animal("vaca", 3, 24, 300, "Holando Argentino", 'h', false, 5);
		Establishment v4 = new Animal("vaca", 4, 24, 300, "Holando Argentino", 'm', false, 0);
		Truck t = new Truck(1, 50);
		
		//a.addAnimal(c);
		a.addAnimal(v1);
		a.addAnimal(v2);
		a.addAnimal(v3);
		a.addAnimal(v4);	
		System.out.println(a.animalUp(t, f));
	}

}
