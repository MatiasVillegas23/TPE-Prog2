package filter;
import establishment.*;

public class AndFilter implements UnitaryFilter {
	private UnitaryFilter f1, f2;
	
	public AndFilter(UnitaryFilter a, UnitaryFilter b) {
		this.f1 = a;
		this.f2 = b;
	}
	
	public boolean eval(Animal a){
		return (f1.eval(a) && f2.eval(a));
	}
}