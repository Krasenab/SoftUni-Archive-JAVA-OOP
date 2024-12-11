package restaurant;

import java.math.BigDecimal;

public class Beverage extends Product 
{
	private double milliliters;
	
	public Beverage(String name,BigDecimal price,double milliliters ) 
	{
		super(name, price);
		setMilliliters(milliliters);
	}
	
	public void  setMilliliters(double  milliliters) 
	{
		if( milliliters>=1) 
		{
			this.milliliters = milliliters;
		}
	}
	public double getMilliliters() 
	{
		return  this.milliliters;
	}
	
}
