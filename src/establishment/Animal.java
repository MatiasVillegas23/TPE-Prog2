package establishment;

public class Animal extends Establishment {
	
	private int id;
	private int ageMonth;
	private double weight;
	private String breed;
	private char sex;
	private boolean castrate;
	private int calf;
	
	public Animal(String n, int id, int a, double w, String b, char s, boolean c, int calf) {
		super(n);
		this.id = id;
		this.ageMonth = a;
		this.weight = w;
		this.breed = b;
		this.sex = s;
		this.castrate = c;
		this.calf = calf;
	}
	
	public int getAverageAge(){
		return this.ageMonth;
	}
	
	public int getAgeMonth(){
		return this.ageMonth;
	}

	public void setAgeMonth(int ageMonth) {
		this.ageMonth = ageMonth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isCastrate() {
		return castrate;
	}

	public void setCastrate(boolean castrate) {
		this.castrate = castrate;
	}

	public int getCalf() {
		return calf;
	}

	public void setCalf(int calf) {
		this.calf = calf;
	}
}
