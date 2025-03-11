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
	
	public Peripheral removePeripheral(String peripheralType) 
	{
		Boolean isExist = false;
		Peripheral result = null;
		//"Peripheral {peripheral type} does not exist in {computer type} with Id {id}."
		for(Peripheral p :peripherals) 
		{
			if(p.getModel().equals(peripheralType)) 
			{
				result = p;
				peripherals.remove(p);
				isExist = true;				
			}
		}
		
		if(isExist==false || peripherals.size()<=0) 
		{
			
			throw new IllegalArgumentException(String.format("Peripheral {%s} does not exist in {%s} with Id {%d}.",peripheralType,this.getClass().getSimpleName(),this.getId()));
		}
		
		
		return result;
	}
	
	public void аddPeripheral(Peripheral peripheral) 
	{
		if(peripherals.contains(peripheral)) 
		{
			throw new IllegalArgumentException(String.format("Peripheral {%s} already exists in {%s} with Id {%d}.",peripheral.getClass().getSimpleName(),this.getModel(),this.getId()));
		}
		peripherals.add(peripheral);
	}
	
	public Component removeComponent(String componentType)
	{
		Component result = null;
		Boolean isExist = false;
		for(Component c:components) 
		{
			String a = c.getModel();
			
			if(c.equals(componentType)) 
			{
				result = c;
				components.remove(c);
				isExist = true;
			}
		}
		if(components.size()<=0 || isExist==false) 
		{
			throw new IllegalArgumentException(String.format("Component {%s} does not exist in {%s} with Id {id}."
					,componentType.getClass().getSimpleName(),this.getClass().getSimpleName(),this.getId()));
		}
		return result;
	}
	
	public void addComponent(Component component) 
	{
		//If the components collection contains a component with the same component type, throw an IllegalArgumentException 
		//"Component {component type} already exists in {computer type} with Id {id}."
		for(Component c:components) 
		{
			if(c.equals(component)) 
			{
				throw new IllegalArgumentException(String.format("Component {%s} already exists in {%s} with Id {%d}."
						,component.getClass().getSimpleName(),this.getClass().getSimpleName(),this.getId()));
			}
			components.add(component);
		}
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
		sb.append(String.format("Overall Performance: {%f}. Price: {%f} - %s: {%s} {%s} (Id: {%d})\n"
				,this.getOverallPreformance(),this.getPrice(),this.getClass().getSimpleName(),this.getManufacturer(),this.getModel(),this.getId()));
		sb.append(String.format("Components (%d): \n",components.size()));
		for(Component c:components) 
		{
			sb.append(c.toString()+"\n");
		}
		double avg = peripherals.stream().map(x->x.getOverallPreformance()).mapToDouble(Double::doubleValue).average().orElse(0.0);
		sb.append(String.format("Peripherals (%d); Average Overall Performance ({%f}):", peripherals.size(),avg));
		for(Peripheral p:peripherals) 
		{
			sb.append(p.toString()+"\n");
		}
		return sb.toString();
	}

}
