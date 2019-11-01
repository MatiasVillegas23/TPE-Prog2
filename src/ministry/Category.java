package ministry;
import establishment.*;
import filter.*;

public class Category {
	private String name;
	private UnitaryFilter filter;

	public Category(String n, UnitaryFilter f) {
		this.name = n;
	    this.filter = f;
	}

	public boolean belong(Animal a) {
		return this.filter.eval(a);
	}

	public String getName() {
		return this.name;
	}
}