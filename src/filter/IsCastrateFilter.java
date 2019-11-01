package filter;

import establishment.Animal;

public class IsCastrateFilter implements UnitaryFilter{
	
	public IsCastrateFilter() {
	}
	
	public boolean eval(Animal a) {
		return a.isCastrate();
	}
}
