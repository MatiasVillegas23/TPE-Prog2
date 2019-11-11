package filter;

import establishment.*;

public class LessAgeFilter implements Filter{
private int age;
	
	public LessAgeFilter(int age){
		this.age = age;
	}
	
	public boolean eval(Establishment e){
		return !(e.getAverageAge() >= age);
	}
}
