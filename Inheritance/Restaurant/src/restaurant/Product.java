package restaurant;

import java.math.BigDecimal;

public class Product 
{
	private String name;
	
	private BigDecimal price;
	
	public Product(String name,BigDecimal price) 
	{
		setPrice(price);
		setName(name);
	}
	
	public String getName() 
	{
		return this.name;
	}
	public void setName(String name) 
	{
		if(!name.isBlank() && !name.isEmpty()) 
		{
			this.name = name;
		}
	}
	public BigDecimal getPrice() 
	{
		return this.price;
	}
	public void setPrice(BigDecimal price) 
	{
		this.price = price;
	}
}
