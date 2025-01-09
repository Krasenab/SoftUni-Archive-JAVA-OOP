package Vechicle;

public class Truck extends Vechicle {
	private double totalR = 0;
	private double baseR = 0;
	private double initialF= 0;
	private double driveD = 0;
	private double usedF = 0;
	
	public Truck(double fuelQuantity, double fuelConsumption) {
		super(fuelQuantity, fuelConsumption);
		this.baseR = this.getFuelConsumption();
		this.initialF = this.getFuelQuantity();
	}

	@Override
	public void refuel(double amaount) {
		double x = amaount * 0.05;
		double remaining = amaount - x;
		double newFuel = remaining + this.getFuelQuantity();
		this.setFuelQuantity(newFuel);
		//System.out.println("Refuel fuel is: " + this.getFuelQuantity());
	}

	@Override
	public void drive(double distance) {
		driveD = distance;
		totalR = baseR + 1.6;
		usedF = totalR * driveD;
		//System.out.println("Initial F: " + initialF);
		double remaining = initialF - usedF;
		//System.out.println(remaining);
		if(remaining<=0) 
		{
			
			System.out.println("Truck needs refueling");
		}
		else {
			
			 double newFuel = remaining;			 
			 this.setFuelQuantity(newFuel);
			 //System.out.printf("Truck travelled %s km",distance);
		}
		
	}

}
