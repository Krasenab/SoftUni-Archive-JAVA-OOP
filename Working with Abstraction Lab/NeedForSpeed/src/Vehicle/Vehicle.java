package Vehicle;

public abstract class Vehicle 
{
	final static double DEFAULT_FUEL_CONSUMPTION=1.25; 
	public double fuelConsumption;
	public double fuel;
	public int horsePower;
	
	public void setFuel(double fuel) 
	{
		this.fuel = fuel;
	} 
	
	public double getFuel() 
	{
		return this.fuel;
	}
	
	public int getHorsePower() 
	{
		return this.horsePower;
	}
	public void setHorsePower(int horsePower) 
	{
		if(horsePower>=1) 
		{
			this.horsePower = horsePower;
		}
		
	}
	
	public void setFuelConsumption(double defFuelConsumption) 
	{
		this.fuelConsumption = defFuelConsumption;
	}
	
	public Vehicle(double fuel,int horsePower )
	{
		this.setFuel(fuel);
		this.setHorsePower(horsePower);
		this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
	}
	
	public  void drive(double kiometers) 
	{
		double driveF = kiometers* this.fuelConsumption;
		if(this.fuel>driveF)
		{
			double leftFuel = this.fuel - driveF;
			this.setFuel(leftFuel);
		}
	};
	
}
