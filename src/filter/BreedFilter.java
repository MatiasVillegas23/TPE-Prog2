package filter;
import establishment.*;

public class BreedFilter implements Filter {
	private String breed;
	
	public BreedFilter(String breed) {
		this.breed=breed;
	}
	
	public boolean eval(Establishment e) {
		return ((Animal)e).getBreed().equals(breed);
	}
}
