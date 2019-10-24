package filter;
import establishment.*;

public class AgeFilter implements Filter{
	
private int age;
	
	public AgeFilter(int age){
		this.age = age;
	}
	
	public boolean eval(Establishment e){
		return (e.getAverageAgeMonth() >= age);
	}
}
