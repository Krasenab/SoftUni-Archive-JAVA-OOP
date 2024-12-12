package animals;

public abstract class Animal 
{
	private String name;
	private int age;
	private String gender;
	
	
	public Animal (String name,int age,String gender) 
	{
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
		
	}
	
	public abstract String produceSound(); 
	
	@Override
	public String toString() 
	{
		return String.format("%s \n%s %s %s \n%s", this.getClass().getName(),getName(),getAge(),getGender(),produceSound());
	}
	
	// get and set methods (yeah a comment, cuz before i use C#)
	public String getGender() 
	{
		return this.gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	
	public void setName(String name) 
	{
		if(!name.isBlank() || !name.isEmpty()) 
		{
			this.name = name;
		}
	}
	public String getName() 
	{
		return this.name;
	}

	
	public int getAge() 
	{
		return this.age;
	}
	public void setAge(int age) 
	{
		if(age>=0) 
		{
			this.age = age;
		}
	}
	
	
	
}
