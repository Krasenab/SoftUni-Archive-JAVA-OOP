package onlineShop;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Computer extends BaseComputer {

	public List<Component> components = new ArrayList<>();
	public List<Peripheral> peripherals = new ArrayList<>();
	
	public Computer(int id, String manufacturer, String model, double price, double overallPreformance) {
		super(id, manufacturer, model, price, overallPreformance);
	}
	
	@Override
	public double getPrice() 
	{
		//The price is equal to the total sum of the computer price with the sum of all component prices and the sum of all peripheral prices
		double thisPcPrice = super.getPrice();
		double allCompPrices = components.stream().mapToDouble(Component::getPrice).sum();
		double allPeripheralsPrices = peripherals.stream().mapToDouble(Peripheral::getPrice).sum();
		return thisPcPrice+allCompPrices+allPeripheralsPrices;
	}
	@Override
	public double getOverallPreformance() 
	{
		
		if(components.size()<=0) 
		{
			return super.getOverallPreformance();
		}
		
		double avgComp = components.stream().map(x->x.getOverallPreformance()).mapToDouble(Double::doubleValue).average().orElse(0.0);
		
		return  super.getOverallPreformance() + avgComp;
	}
	
	
	@Override	
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Overall Performance: {%s}. Price: {%d} - {product type}: {%s} {%d} (Id: {%d})\n"
				,this.getOverallPreformance(),this.getPrice(),this.getManufacturer(),this.getModel(),this.getId()));
		sb.append(String.format("Components ({%d}):",components.size()));
		for(Component c:components) 
		{
			sb.append(c.toString()+"\n");
		}
		OptionalDouble avg = peripherals.stream().map(x->x.getOverallPreformance()).mapToDouble(Double::doubleValue).average();
		sb.append(String.format("Peripherals ({%d}); Average Overall Performance ({%d}):", peripherals.size(),avg));
		for(Peripheral p:peripherals) 
		{
			sb.append(p.toString()+"\n");
		}
		return sb.toString();
	}

}
