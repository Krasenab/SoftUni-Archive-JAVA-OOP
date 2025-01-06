package personValidatonData;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	
	public Person() 
	{
		
	}
	
	public Person(String firstName,String lastName,int age,double salary ) 
	{
	   this.setFirstName(firstName);
	   this.setLastName(lastName);
	   this.setAge(age);
	   this.setSalary(salary);
	}
	
	
	public void setFirstName(String firstName) 
	{
		if(firstName.length()<3) 
		{
			throw new IllegalArgumentException("First name cannot be less than 3 symbols");
		}
		this.firstName = firstName;
	}
	public String getFirstName() 
	{
		return this.firstName;
	}
	public void setLastName(String lastName) 
	{
		if(lastName.length()<3) 
		{
			throw new IllegalArgumentException("Lat name cannot be less than 3 symbols");
		}
		this.lastName = lastName;
	}
	public String getLastName() 
	{
		return this.lastName;
	}
	public void setAge(int age) 
	{
		if(age<=0) 
		{
			throw new IllegalArgumentException("Age cannot be zero or negative integer");
		}
		this.age = age;
	}
	public int getAge() 
	{
		return this.age;
	}
	
	public void setSalary(double salary) 
	{
		if(salary<460) 
		{
			throw new IllegalArgumentException("Salary cannot be less 460 leva");
		}
		this.salary = salary;
	}
	public double getSalary() 
	{
		return this.salary;
	}
	
	public void increaseSalary(double bonus) 
	{
		if(this.age<30) 
		{
			double halfBonus = bonus/2;
			halfBonus/=100;				
			double salaryWithBonus = (this.salary * halfBonus) + this.salary;
			this.setSalary(salaryWithBonus);
			return;
		}
		double pr = bonus / 100;
		double salaryWithBonus = (this.salary * pr) + this.salary;
		this.setSalary(salaryWithBonus);
	}
	
	@Override
	public String toString() 
	{
		
			return String.format("%s %s gets %.1f leva", firstName,lastName,this.getSalary());
		
	}
	
}
