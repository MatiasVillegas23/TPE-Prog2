package filter;
import establishment.*;

public class AverageWeight implements Filter {
	
	private double weight;
	
	public AverageWeight(double w) {
		this.weight = w;
	}
	
	public boolean eval(Establishment e) {
		return e.getAverageWeight()>=weight;//error
	}
	
}