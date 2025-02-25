
public class CarInfoBuilder extends CarBuilder {

		public CarInfoBuilder(Car car) 
		{
			this.car = new Car();
		}
		
		public CarInfoBuilder withType(String type) 
		{
			car.setType(type);
			return this;
		}
		
		public CarInfoBuilder withColor(String color) 
		{
			car.setColor(color);
			return this;
		}
		
		public CarInfoBuilder withNumberOfDoors(int numberOfDoors) 
		{
			car.setNumbersOfDoors(numberOfDoors);
			return this;
		}
}
