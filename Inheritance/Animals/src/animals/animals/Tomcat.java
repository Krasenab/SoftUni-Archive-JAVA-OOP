package animals;

public class Tomcat extends Cat {

	public static final String GENDER = "Male";
	public Tomcat(String name, int age, String gender) {
		super(name, age, GENDER);
		
	}
	
	
	@Override
	public String produceSound()
	{
		
		return "MEOW";
	}

}
