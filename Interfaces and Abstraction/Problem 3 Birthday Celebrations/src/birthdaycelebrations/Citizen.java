package birthdaycelebrations;

public class Citizen implements Birthable,Identifiable {

	private String name;
	private int age;
	private String id;
	private String birthDate;
	
	public Citizen(String name,int age,String id,String birthDay) 
	{
		this.setName(name);
		this.setAge(age);
		this.setId(id);
		this.setBirthDay(birthDay);
	}
	
	public void setName(String name) 
	{
		if(!name.isBlank() && !name.isEmpty()) 
		{
			this.name = name;
		}
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public void setBirthDay(String birthDay) 
	{
		this.birthDate = birthDay;
	}
	
	@Override
	public String getBirthday() {
		
		return this.birthDate;
	}

	@Override
	public String getId() {
	
		return this.id;
	}

}
