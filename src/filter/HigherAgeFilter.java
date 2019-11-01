package filter;
import establishment.*;

public class HigherAgeFilter implements UnitaryFilter{
	
private int age;
	
	public HigherAgeFilter(int age){
		this.age = age;
	}
	
	public boolean eval(Animal a){
		return (a.getAverageAgeMonth() >= age);
	}
}