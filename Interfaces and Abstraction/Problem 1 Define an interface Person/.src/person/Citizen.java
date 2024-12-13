package person;

public class Citizen implements Person
{
	private String name;
	private int age;
	
	public Citizen() {}
	
	public Citizen(String name,int age) 
	{
		this.setName(name);
		this.setAge(age);
	}
	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public void setName(String name) {
		if(!name.isBlank() && !name.isEmpty()) 
		{
			this.name = name;
		}
		
	}

	@Override
	public void setAge(int age) {
		if(age>=0) 
		{
			this.age = age;
		}
		
	}

	@Override
	public int getAge() {
		
		return this.age;
	}
	
}
