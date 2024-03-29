package main;
import filter.*;
import ministry.*;
import establishment.*;
import truck.*;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		AgroBusiness a = new AgroBusiness("Hacienda Pepito");
		AgroBusiness b = new AgroBusiness("Hacienda Cholito");
		Animal v1 = new Animal("vaca", 1, 24, 300, "aberdeen angus", 'h', false, 5);
		Animal v2 = new Animal("vaca2", 2, 11, 400, "aberdeen angus", 'h', true, 3);
		Animal v3 = new Animal("vaca3", 3, 15, 500, "aberdeen angus", 'h', false, 5);
		Animal v4 = new Animal("vaca4", 4, 7, 600, "aberdeen angus", 'm', false, 0);
		Animal v5 = new Animal("vaca5", 5, 10, 250, "aberdeen angus", 'h', false, 5);
		
		HigherAgeFilter f1 = new HigherAgeFilter(8);
		LessAgeFilter f2 = new LessAgeFilter(12);
		AndFilter f6 = new AndFilter(f1, f2);
		WasRaisedFilter f3 = new WasRaisedFilter();
		BreedFilter f4 = new BreedFilter("aberdeen angus");
		AndUnitaryFilter f5 = new AndUnitaryFilter(f3, f4);
		f3.eval(v5);

		Truck t = new Truck(1, 50);
		Ministry m = new Ministry("Spain");
		Category d = new Category("ando2", f5);
		m.addCategory(d);
		
		a.addAnimal(b);
		a.addAnimal(v1);
		a.addAnimal(v2);
		a.addAnimal(v3);
		a.addAnimal(v4);
		
		listAnimalsCategories(m, v2);
		System.out.println(a.sellAnimals(f2));
		System.out.println(t.getAnimals());
		
		
		
	}

	public static void listAnimalsCategories(Ministry m, Animal a) {
		ArrayList<String> aux = new ArrayList<String>();
		aux = m.listCategories(a);
		System.out.println("Las categorias del animal "+a.getName()+" son:");
			for (int i = 0; i < aux.size(); i++) {
				System.out.println(aux.get(i));
			}
	}
}