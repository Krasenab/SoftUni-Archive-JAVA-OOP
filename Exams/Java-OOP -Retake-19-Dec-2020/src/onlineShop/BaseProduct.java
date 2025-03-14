package onlineShop;

public abstract class BaseProduct {
	
	private int id;
	private String manufacturer;
	private String model;
	private double price;
	private double overallPreformance;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<=0) 
		{
			throw new IllegalArgumentException("Id can not be less or equal then zero"); 
		}
		this.id = id;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		if(manufacturer.isBlank() || manufacturer.isEmpty()) 
		{
			throw new IllegalArgumentException("Manufacturer canot be empty");
		}
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		if(model.isBlank() || model.isEmpty() ) 
		{
			throw new IllegalArgumentException("Model can not be empty.");
		}
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<=0) 
		{
			throw new IllegalArgumentException("Price can not be less or equal than 0.");
		}
		this.price = price;
	}
	public double getOverallPreformance() {
		return overallPreformance;
	}
	public void setOverallPreformance(double overallPreformance) {
		 if(overallPreformance<=0) 
		 {
			 
			 throw new IllegalArgumentException("Overall Performance can not be less or equal than 0.");
		 }
		this.overallPreformance = overallPreformance;
	}
	
	public BaseProduct(int id, String manufacturer, String model, double price, double overallPreformance) {
		
		this.setId(id);
		this.setManufacturer(manufacturer);
		this.setModel(model);
		this.setPrice(price);
		this.setOverallPreformance(overallPreformance);
	}
	
	
	
	
	
}
