package animals;

import foods.Food;

public class Mouse extends Mammal {

	public Mouse(String animalName,String animalType,double animalWeight,int foodEaten,String livingRegion) 
	{
		super(animalName,animalType,animalWeight,foodEaten,livingRegion);
	}
	@Override
	public void makeSound() {
		
		System.out.println("SQUEEEAAAK!");
	}

	@Override
	public void eat(Food food) {
		super.setFoodEaten(food.getQuantity());				
	}
	

	
	@Override
	public String toString() 
	{
		return String.format("%s[%s, %d, %s, %d]", this.getAnimalType(),this.getAnimalName(),this.getAnimalWeight(),this.getLivingRegion(),this.getFoodEaten());
	}

}
