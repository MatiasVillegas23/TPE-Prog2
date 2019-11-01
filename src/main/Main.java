package main;
import filter.*;
import truck.*;
import establishment.*;

public class Main {

	public static void main(String[] args) {
		
		Filter f = new BreedFilter("Holando Argentino");
		
		AgroBusiness a = new AgroBusiness("Hacienda Pepito");
		AgroBusiness c = new AgroBusiness("Hacienda Cholito");
		Establishment v1 = new Animal("vaca", 1, 24, 300, "Holando Argentino", 'h', false, 5);
		Establishment v2 = new Animal("vaca", 2, 12, 300, "Holando Argentino", 'h', true, 3);
		Establishment v3 = new Animal("vaca", 3, 24, 300, "Holando Argentino", 'h', false, 5);
		Establishment v4 = new Animal("vaca", 4, 24, 300, "Holando Argentino", 'm', false, 0);
		Truck t = new Truck(1, 50, f);
		
		a.addAnimal(c);
		a.addAnimal(v1);
		a.addAnimal(v2);
		a.addAnimal(v3);
		a.addAnimal(v4);
	}

/*	private static void listarCategoriasAnimal(Set<Categoria> categorias, Animal a) {
		System.out.println("Categorias del animal "+ a.getId());
			for (Categoria c: categorias) {
				System.out.println(c.toString());
			}
	}*/
}