package Vechicle;

public class Car extends Vechicle {

	public Car(double fuelQuantity, double fuelConsumption) {
		super(fuelQuantity, fuelConsumption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void refuel(double amaount) {
		
		double newFuel = this.getFuelQuantity() + amaount;
		this.setFuelQuantity(newFuel);
	}

	@Override
	public void drive(double distance) {
		// consuprtion with 0.9 AC losses 
		double finalConsution = this.getFuelConsumption() + 0.9;
		double driveResult = finalConsution * distance;
		double remainging =this.getFuelQuantity() - driveResult;
		if(remainging<=0) 
		{
			System.out.println("Car needs refueling");
		}
		else {
			
			this.setFuelQuantity(remainging);
			System.out.printf("Car travelled %s km\n",distance);
		}
		
	}

}
