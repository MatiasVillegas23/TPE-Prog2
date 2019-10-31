package establishment;

import java.util.ArrayList;

import filter.Filter;
import truck.*;

public class Animal extends Establishment implements Strategy{

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
	
	@Override
	public boolean isFilterOk(Filter f) {
		if(f.eval(this)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<Establishment> animalUp(Truck c, Filter f) {
		// TODO Auto-generated method stub
		return null;
	}
	public double getAverageWeight() {
		return this.getWeight();
	}
	
	public double getTotalWeight() {
		return this.getWeight();
	}
	
	public int getCantAnimals() {
		return 1;
	}	

	public int getAverageAgeMonth(){
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
