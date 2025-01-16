package animals;

import foods.Food;

public class Cat extends Felime {
	
	private String breed;
	
	public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion,String breed) {
		super(animalName, animalType, animalWeight, foodEaten, livingRegion);
		this.setBreed(breed);
	}

	
	
	public String getBreed() 
	{
		return this.breed;
	}
	public void setBreed(String breed) 
	{
		if(breed.isBlank()) 
		{
			throw new IllegalArgumentException("Breed cannot be empty");
		}
		this.breed = breed;		
	}



	@Override
	public void makeSound() {
		System.out.println("Meowwww");		
	}



	@Override
	public void eat(Food food) {
		this.setFoodEaten(food.getQuantity());
		
	}
	@Override
	public String toString() 
	{
		return String.format("%s[%s, %f, %s, %d, %s]", this.getAnimalType(),this.getAnimalName(),this.getAnimalWeight(),this.getLivingRegion(),this.getFoodEaten(),this.breed);
	}
	
	
	
	
}
