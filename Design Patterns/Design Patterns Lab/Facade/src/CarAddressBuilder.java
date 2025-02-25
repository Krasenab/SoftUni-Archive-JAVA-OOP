
public class CarAddressBuilder extends CarBuilder {
		
	public CarAddressBuilder(Car car) 
	{
		this.car = new Car();
	}
	
	public CarAddressBuilder inCity(String city) 
	{
			this.car.setCity(city);
			return this;
	}
	
	public CarAddressBuilder atAddress(String address) 
	{
		this.car.setAddress(address);
		return this;
	}
		
}
