package animals;

public abstract class Mammal extends Animal
{
	protected String livingRegion;
	
//	public Mammal(String animalName,String animalType,double animalWeight,int foodEaten,String livingRegion) 
//	{
//		super(animalName,animalType,animalWeight,foodEaten);
//		this.setLivingRegion(livingRegion);
//	}
	
	
	public Mammal(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
		super(animalName,animalType,animalWeight,foodEaten);
		this.setLivingRegion(livingRegion);
	}


	public String getLivingRegion() 
	{
		return this.livingRegion;
	}
	public void setLivingRegion(String livingRegion) 
	{
		if(livingRegion.isBlank()) 
		{
			throw new IllegalArgumentException("region cannot be empty");			
		}
		
		this.livingRegion = livingRegion;
	}
	

}
