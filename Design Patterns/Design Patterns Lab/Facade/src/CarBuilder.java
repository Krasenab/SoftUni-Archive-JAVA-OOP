
public class CarBuilder {
	
	protected Car car;
	public CarBuilder() 
	{
		this.car = new Car();
	}
	
	public Car build() 
	{
		return this.car;
	}
	
	public CarInfoBuilder info() 
	{
		return new CarInfoBuilder(this.car);
	}
	
	public CarAddressBuilder address() 
	{
		return new CarAddressBuilder(this.car);
	}
	

}
