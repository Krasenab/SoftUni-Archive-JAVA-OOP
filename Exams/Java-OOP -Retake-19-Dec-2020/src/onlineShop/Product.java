package onlineShop;

public class Product extends BaseProduct {

	public Product(int id, String manufacturer, String model, double price, double overallPreformance) {
		super(id, manufacturer, model, price, overallPreformance);
		
	}
	
	
	@Override
	public String toString() 
	{		
		return String.format("Overall Performance: {%s}. Price: {%d} - {product type}: {%s} {%d} (Id: {%d})"
				, this.getOverallPreformance(),this.getPrice(),this.getManufacturer(),this.getModel(),this.getId());
	}
}
