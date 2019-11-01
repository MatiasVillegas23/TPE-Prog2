package filter;
import establishment.*;

public class AndFilter implements Filter {
	private Filter f1, f2;
	
	public AndFilter(Filter a, Filter b) {
		this.f1 = a;
		this.f2 = b;
	}
	
	public boolean eval(Establishment e){
		return (f1.eval(e) && f2.eval(e));
	}
}