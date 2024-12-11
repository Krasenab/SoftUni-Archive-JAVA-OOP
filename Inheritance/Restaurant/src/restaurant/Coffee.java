package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {

	private static final double COFFEE_MILLILITERS = 50;
	private static final BigDecimal COFFEE_PRICE  = new BigDecimal(3.50);
	private double cafeine;
	
	public Coffee(String name, BigDecimal price, double milliliters,double cafeine) {
		super(name, COFFEE_PRICE,COFFEE_MILLILITERS);
		
		
		setCafeine(cafeine);
		
		
	}
	
	public void setCafeine(double cafeine) 
	{
		if(cafeine>=0.0) 
		{
			this.cafeine = cafeine;
		}
	}
	public double getCafeine() 
	{
		return this.cafeine;
	}

}
