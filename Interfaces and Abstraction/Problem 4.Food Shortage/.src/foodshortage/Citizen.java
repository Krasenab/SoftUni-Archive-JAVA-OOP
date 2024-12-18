package foodshortage;

import Servicable.Buyer;
import Servicable.Identifiable;
import Servicable.Person;

public class Citizen implements Person,Buyer,Identifiable {
	
	private String name;
	private String id;
	private String birthDate;
	
	private int age;
	private int food = 0;
	
	public Citizen(String name,int age,String id,String birthDate) 
	{
		 this.name = name;
		 this.age = age;
		 this.id = id;
		 this.birthDate = birthDate;
	}

	@Override
	public void buyFood() {
		
		this.food+=10;
		
	}
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public int getFood() {
		return this.food;
	}

	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public int getAge() {

		return this.age;
	}
}
