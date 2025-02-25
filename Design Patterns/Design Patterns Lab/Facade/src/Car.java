
public class Car {
	
	
	
	private String type;
	private String color;
	private int numbersOfDoors;
	private String city;
	private String address;

	
	public Car() {}
	
	
//	public Car(String type, String color, int numbersOfDoors, String city, String address) {
//		super();
//		this.type = type;
//		this.color = color;
//		this.numbersOfDoors = numbersOfDoors;
//		this.city = city;
//		this.address = address;
//	}
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumbersOfDoors() {
		return numbersOfDoors;
	}
	public void setNumbersOfDoors(int numbersOfDoors) {
		this.numbersOfDoors = numbersOfDoors;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return String.format("CarType: %s,\n Color: %s, Number of doors: %d, \n Manufactured in %s, at address: %s", this.type,this.color,this.numbersOfDoors,this.getCity(),this.getAddress());
	}
	
	

}
