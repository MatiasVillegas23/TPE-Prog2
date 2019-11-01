package filter;

import establishment.Animal;

public class LessAgeFilter implements UnitaryFilter{
private int age;
	
	public LessAgeFilter(int age){
		this.age = age;
	}
	
	public boolean eval(Animal a){
		return !(a.getAverageAgeMonth() >= age);
	}
}
