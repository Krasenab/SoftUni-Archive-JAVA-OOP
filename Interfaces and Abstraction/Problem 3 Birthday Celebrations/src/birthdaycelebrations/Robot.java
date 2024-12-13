package birthdaycelebrations;

public class Robot implements Identifiable {

	private String id;
	private String model;
	public Robot(String id,String model) 
	{
		this.model = model;
		this.id = id;
	}
	
	@Override
	public java.lang.String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
