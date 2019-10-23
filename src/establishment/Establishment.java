package establishment;

public abstract class Establishment {
	private String nombre;
	
	
	public Establishment(String n){
		this.nombre = n;
	}
	
	public abstract int getAverageAge();//borra esto, agregar metodos abs

	public abstract int getAgeMonth();
	
}