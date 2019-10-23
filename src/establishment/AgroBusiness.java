package establishment;
import java.util.ArrayList;


public class AgroBusiness extends Establishment {
	private ArrayList<Establishment> Establishments;
	
	public AgroBusiness(String n) {
		super(n);
		this.Establishments = new ArrayList<Establishment>();
	}
	//preguntar estos 2 metodos son iguales??? cambia el sum, posible solucion retornar array
	public int getAverageAge(){
		int sum=0;
		
		for(int i = 1; i<Establishments.size(); i++){
			sum += Establishments.get(i).getAgeMonth();
		}
		return sum/Establishments.size();
	}
	
	public int getAgeMonth(){
		int sum=0;
		
		for(int i = 1; i<Establishments.size(); i++){
			sum += Establishments.get(i).getAgeMonth();
		}
		return sum/Establishments.size();
	}
	
}
