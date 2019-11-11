package filter;

import establishment.Establishment;

public class OrFilter implements Filter{
	private Filter f1, f2;
	
	public OrFilter(Filter f1, Filter f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean eval(Establishment e) {
		return ((f1.eval(e))||(f2.eval(e)));
	}

}