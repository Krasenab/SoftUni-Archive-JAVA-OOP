package birthdaycelebrations;

public class Pet implements Birthable 
{
	private String name;
	private String birthDay;
	public Pet() 
	{
		
	}
	public Pet(String name,String birthDay) 
	{
		this.name = name;
		this.birthDay = birthDay;
	}
	

	@Override
	public String getBirthday() {
		// TODO Auto-generated method stub
		return this.birthDay;
	}

}
