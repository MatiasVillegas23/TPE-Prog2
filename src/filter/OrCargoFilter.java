package filter;
import establishment.*;

public class OrCargoFilter implements Filter{
	private Filter f1, f2;
	
	public OrCargoFilter(Filter a, Filter b){
		this.f1=a;
		this.f2=b;
	}
	
	public boolean eval(Establishment e){
		return (f1.eval(e)||f2.eval(e));
	}
}
