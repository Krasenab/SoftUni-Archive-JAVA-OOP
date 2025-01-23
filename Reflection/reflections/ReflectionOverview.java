package reflections;

public class ReflectionOverview extends ReflectionMainOverview implements PersonNamable,AgeCalculator  {
	
	public ReflectionOverview() 
	{
		
	}
	@Override
	public void printNames(String name) 
	{
		System.out.println("Your name is: " + name);
	}

	@Override
	public void printLastName(String lastName) {
		System.out.println("Your last name is: " + lastName);
		
	}
	@Override
	public int getAgeComparedToAverageYears(int actual, int average) {
		
		return average-actual;
	}
	@Override
	public int getDifferenceBetweenTheYears(int oldAge, int youngAge) {
		
		return oldAge-youngAge;
	}
}
