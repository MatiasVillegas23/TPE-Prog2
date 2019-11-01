package filter;
import establishment.*;

public class WeightFilter implements UnitaryFilter{

private int weight;
	
	public WeightFilter(int weight) {
		this.weight = weight;
	}
	
	public boolean eval(Animal a) {
		return a.getWeight() >= weight;
	}
}

