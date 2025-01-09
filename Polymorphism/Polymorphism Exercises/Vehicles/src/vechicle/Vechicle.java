package Vechicle;

public abstract class Vechicle 
{
	protected double fuelQuantity;
	protected double fuelConsumption;
	
	public Vechicle(double fuelQuantity,double fuelConsumption) 
	{
		this.setFuelConsumption(fuelConsumption);
		this.setFuelQuantity(fuelQuantity);
	}
	
	public abstract void refuel(double amaount);
	public abstract void drive(double distance);
			
	public void setFuelQuantity(double fuelQuantity) 
	{
		if(fuelQuantity <0) 
		{
			throw new IllegalArgumentException("fuel cannot be less 0");
		}
		this.fuelQuantity = fuelQuantity;
	}
	public double getFuelQuantity() 
	{
		return this.fuelQuantity;
	}
	
	public void setFuelConsumption(double fuelConsumption) 
	{
		this.fuelConsumption = fuelConsumption;
	}
	public double getFuelConsumption() 
	{
		return this.fuelConsumption;
	}
}
