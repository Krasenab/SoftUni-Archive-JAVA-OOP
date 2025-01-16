package animals;

import foods.Food;

public abstract class Animal {
	
	private String animalName;
	private String animalType;
	private Double animalWeight;
	protected int foodEaten;
	
	public Animal(String animalName,String animalType,double animalWeight,int foodEaten) 
	{
		this.setAnimalName(animalName);
		this.setAnimalType(animalType);
		this.setAnimalWeight(animalWeight);
		this.setFoodEaten(foodEaten);
	
	}
	
	public String getAnimalName() 
	{
		return this.animalName;
	}
	public void setAnimalName(String name) 
	{
		this.animalName = name;	
	}
	public String getAnimalType() 
	{
		return this.animalType;
	}
	
	public void setAnimalType(String typeAnimal) 
	{
		if(typeAnimal.isBlank()) 
		{
			throw new IllegalArgumentException("type is null");
		}
		this.animalType = typeAnimal;
	}
	public Double getAnimalWeight() 
	{
		return this.animalWeight;
	}
	public void setAnimalWeight(Double weight) 
	{
		if(weight<=0.00) 
		{
			throw new IllegalArgumentException();
		}
		this.animalWeight = weight;
	}
	public int getFoodEaten() 
	{
		return this.foodEaten;
	}
	public void setFoodEaten(int foodEaten) 
	{
		this.foodEaten = foodEaten;
	}
	
	
	
	public abstract void makeSound();
	public abstract void eat(Food food);
	
	
	
}
