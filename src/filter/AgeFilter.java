package filter;
import establishment.*;

public class AgeFilter implements UnitaryFilter{
	
private int age;
	
	public AgeFilter(int age){
		this.age = age;
	}
	
	public boolean eval(Animal a){
		return (a.getAverageAgeMonth() >= age);
	}
}
