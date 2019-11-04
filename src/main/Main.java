package main;
import filter.*;
import ministry.*;
import establishment.*;
import truck.*;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		HigherAgeFilter f3 = new HigherAgeFilter(8);
		LessAgeFilter f4 = new LessAgeFilter(12);
		AndFilter f5 = new AndFilter(f3, f4);
		
		AgroBusiness a = new AgroBusiness("Hacienda Pepito");
		AgroBusiness b = new AgroBusiness("Hacienda Cholito");
		Animal v1 = new Animal("vaca", 1, 24, 300, "Holando Argentino", 'h', false, 5);
		Animal v2 = new Animal("vaca2", 2, 11, 400, "Holando Argentino", 'h', true, 3);
		Animal v3 = new Animal("vaca3", 3, 15, 500, "Holando Argentino", 'h', false, 5);
		Animal v4 = new Animal("vaca4", 4, 36, 600, "Holando Argentino", 'm', false, 0);
		//Truck t = new Truck(1, 50, f);
		Ministry m = new Ministry("Spain");
		Category d = new Category("ando2", f5);
		m.addCategory(d);
		
		a.addAnimal(b);
		a.addAnimal(v1);
		a.addAnimal(v2);
		a.addAnimal(v3);
		a.addAnimal(v4);
		
		listAnimalsCategories(m, v2);
	}
	
	private static boolean readyToSell(AgroBusiness a, UnitaryFilter f){
		ArrayList<Establishment> aux = a.getEstablishments();
		for (int i = 0; i < aux.size(); i++) {
			if (!(a.isOkToSell(f))) {
				return false;
			}
		}
		return true;
	}

	private static void listAnimalsCategories(Ministry m, Animal a) {
		ArrayList<String> aux = new ArrayList<String>();
		aux = m.listCategories(a);
		System.out.println("Las categorias del animal "+a.getName()+" son:");
			for (int i = 0; i < aux.size(); i++) {
				System.out.println(aux.get(i));
			}
	}
}