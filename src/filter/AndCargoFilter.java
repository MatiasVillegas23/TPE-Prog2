package filter;
import establishment.*;

public class AndCargoFilter implements Filter{
	private Filter f1, f2;
	
	public AndCargoFilter(Filter a, Filter b){
		this.f1=a;
		this.f2=b;
	}
	
	public boolean eval(Establishment e){
		return (f1.eval(e)&&f2.eval(e));
	}
}