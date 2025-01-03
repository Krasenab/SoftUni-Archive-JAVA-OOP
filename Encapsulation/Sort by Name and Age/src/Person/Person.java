package Person;

public class Person {
	
	
	private String firstName;
	private String lastName;
	private int age;
	
	
	
	public Person(String firstName,String lastName,int age) 
	{
		this.setName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
	}
	
	public void setName(String firstName) 
	{
		if(!firstName.isBlank()) 
		{
			this.firstName = firstName;
		}
		else {
			
			this.firstName = "No name";
		}
		
	}
	public String getFirstName() 
	{
		return this.firstName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getLastName() 
	{
		return this.lastName;
	}
	public void setAge(int age) 
	{
		if(age<0) 
		{
			this.age = 0;
		}
		this.age = age;
	}
	public int getAge() 
	{
		return this.age;
	}
	
	@Override
	public String toString() 
	{
		return String.format("%s %s is %d years old.", firstName,lastName,age);
	}
	

}
