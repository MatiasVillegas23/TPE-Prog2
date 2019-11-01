package filter;
import establishment.*;

public class BreedFilter implements UnitaryFilter {
	private String breed;
	
	public BreedFilter(String breed) {
		this.breed=breed;
	}
	
	public boolean eval(Animal a) {
		return a.getBreed().equals(breed);
	}
}
