package filter;
import establishment.*;

public class AverageAge implements Filter {

	private int ageMonth;
	
	public AverageAge(int ageMonth) {
		this.ageMonth = ageMonth;
	}
	
	public boolean eval(Establishment e) {
		return e.getAverageAge()>=ageMonth;
	}
	
}