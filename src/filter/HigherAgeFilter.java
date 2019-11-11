package filter;
import establishment.*;

public class HigherAgeFilter implements Filter{
	
private int age;
	
	public HigherAgeFilter(int age){
		this.age = age;
	}
	
	public boolean eval(Establishment e){
		return (e.getAverageAge() >= age);
	}
}