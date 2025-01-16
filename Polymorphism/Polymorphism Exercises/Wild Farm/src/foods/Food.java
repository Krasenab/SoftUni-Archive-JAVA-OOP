package foods;

public abstract class Food 
{
	private int quantity;
	
	public Food(int quantity) 
	{
		this.setQuantity(quantity);
	}
	
	public void setQuantity(int quantity) 
	{
		if(quantity<0) 
		{
			throw new IllegalArgumentException("Quantity cannot be less then ZERO");
		}
		this.quantity = quantity;
	}
	public int getQuantity() 
	{
		return this.quantity;
	}
}
