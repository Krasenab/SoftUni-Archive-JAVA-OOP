package restaurant;

import java.math.BigDecimal;

public class Dessert extends Food {

	private double calories;
	public Dessert(String name, BigDecimal price,double grams,double clalories) {
		super(name, price,grams);
		this.setCalories(clalories);
	
	}
	
	
	public double getCalories() 
	{
		return this.calories;
	}
	
	public void setCalories(double calories) 
	{
		if(calories>=1) 
		{
			this.calories = calories;
		}
	}

}
