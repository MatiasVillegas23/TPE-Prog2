package filter;
import establishment.*;

public class OrFilter implements UnitaryFilter {
	private UnitaryFilter f1, f2;
	
	public OrFilter(UnitaryFilter a, UnitaryFilter b) {
		this.f1 = a;
		this.f2 = b;
	}
	
	public boolean eval(Animal a) {
		return (f1.eval(a) || f2.eval(a));
	}
}
