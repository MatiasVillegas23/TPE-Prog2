package filter;
import establishment.*;

public class WeightFilter implements Filter{

private int weight;
	
	public WeightFilter(int weight) {
		this.weight = weight;
	}
	
	public boolean eval(Establishment e) {
		return e.getAverageWeight() >= weight;
	}
}

