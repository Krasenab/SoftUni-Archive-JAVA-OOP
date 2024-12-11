package restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {
	
	public final static double CAKE_GRAMS = 250;
	public final static double CAKE_CALORIES = 1000;
	public final static BigDecimal CAKE_PRICE = new BigDecimal(5);

	public Cake(String name, BigDecimal price, double grams, double clalories) {
		super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
		super.setGrams(CAKE_GRAMS);
		super.setCalories(CAKE_CALORIES);
		super.setPrice(CAKE_PRICE);
	}

}
