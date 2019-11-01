package filter;

import establishment.Animal;

public class WasRaisedFilter implements UnitaryFilter{
	public WasRaisedFilter() {
	}
	
	public boolean eval(Animal a) {
		return a.getCalf()>0;
	}
}
