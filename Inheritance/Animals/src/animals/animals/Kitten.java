package animals;

public class Kitten extends Cat {
	
	public static final String GENDER = "Female";
	
	public Kitten(String name, int age, String gender) {
		super(name, age, GENDER);
		
	}

	@Override
	public String produceSound() 
	{
		return "Meow";
	}

}
