package foodshortage;

import Servicable.Buyer;
import Servicable.Identifiable;
import Servicable.Person;

public class Rebel implements Person,Buyer {

	private String name;
	private int age;
	private String group;
	private int food;
	
	public Rebel(String name,int age,String group) 
	{
		this.name = name;
		this.age = age;
		this.group = group;
	}
	
	
	@Override
	public void buyFood() {
		
		this.food+=5;
	}

	
	
	


	@Override
	public int getFood() {
		// TODO Auto-generated method stub
		return this.food;
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

}
