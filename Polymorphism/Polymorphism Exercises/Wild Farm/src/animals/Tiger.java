package animals;

import foods.Food;

public class Tiger extends Felime {

	public Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
		super(animalName, animalType, animalWeight, foodEaten, livingRegion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		
		System.out.println("ROAAR!!!");
	}

	@Override
	public void eat(Food food) {
	    this.setFoodEaten(food.getQuantity());
		
	}
	@Override
	public String toString() 
	{
		return String.format("%s[%s, %f, %s, %d]", this.getAnimalType(),this.getAnimalName(),this.getAnimalWeight(),this.getLivingRegion(),this.getFoodEaten());
	}
}
