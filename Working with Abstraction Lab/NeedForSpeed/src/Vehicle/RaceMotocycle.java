package Vehicle;

public class RaceMotocycle extends Motorcycle 
{
	
	final static double DEFAULT_FUEL_CONSUMPTION = 8.0;
	
	public RaceMotocycle(double fuel, int horsePower) {
		super(fuel, horsePower);
	    super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
	}
	


}
