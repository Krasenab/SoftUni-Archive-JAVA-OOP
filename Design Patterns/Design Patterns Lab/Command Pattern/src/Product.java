
public class Product {
	
	private String name;
	private float price;
	
	public Product() 
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void increasePrice(float amount) 
	{
		float incr = this.getPrice() + amount;
		this.setPrice(incr);
	}
	
	public void decreasePrice(float amount) 
	{
		this.setPrice(this.getPrice()-amount);
	}
	
	
	
}
