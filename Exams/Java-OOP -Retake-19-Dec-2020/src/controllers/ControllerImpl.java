package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import globalConstants.TypesOfComponentsAndPer;
import interfacesOnlineShop.Controller;
import onlineShop.CentralProcessingUnit;
import onlineShop.Component;
import onlineShop.Computer;
import onlineShop.DesktopComputer;
import onlineShop.Laptop;
import onlineShop.Motherboard;
import onlineShop.PowerSupply;
import onlineShop.RandomAccessMemory;
import onlineShop.SolidStateDrive;
import onlineShop.VideoCard;

public class ControllerImpl implements Controller {
	
	public ControllerImpl() 
	{
		
	}
	public List<Computer> computers = new ArrayList<>();
	
	@Override
	public String addComputer(String computerType, int id, String manufacturer, String model, double price) {
		
		//If a computer, with the same id, already exists in the computers collection, throw an IllegalArgumentException with the message "Computer with this id already exists."
		for(Computer c:computers) 
		{
			if(c.getId()==id) 
			{
				throw new IllegalArgumentException(String.format("Computer with this %d already exists.", id));			
			}
		}
		if(computerType.equals("Laptop")) 
		{
			Laptop l = new Laptop(id,manufacturer,model,price);
			computers.add(l);
		}
		else if(computerType.equals("DesktopComputer")) 
		{
			DesktopComputer dc = new DesktopComputer(id,manufacturer,model,price);
			computers.add(dc);
		}
		else {
			 throw new IllegalArgumentException("Computer type is invalid.");
		}
		
		
		return String.format("Computer with id {%d} added successfully.", id);
	}

	@Override
	public String addPeripheral(int computerId, int id, String peripheralType, String manufacturer, String model,
			double price, double overallPerformance, String connectionType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removePeripheral(String peripheralType, int computerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addComponent(int computerId, int id, String componentType, String manufacturer, String model,
			double price, double overallPerformance, int generation) {
		// If a component, with the same id, already exists in the components collection, 
		//throws an IllegalArgumentException with the message "Component with this id already exists."
		
		Computer c = computers.stream().filter(x->x.getId()==computerId).findFirst().orElse(null);
		if(c.equals(null)) 
		{
			throw new IllegalArgumentException("Computer with this id not exists.");
		}
		
		for(Component comp:c.components) 
		{
			if(comp.getId()==id) 
			{
				throw new IllegalArgumentException("Component with this id already exists.");
			}
		}
		
		
		 Component component = null;
				
		  if(componentType.equals("CentralProcessingUnit")) 
		  {
			  component = new CentralProcessingUnit( id,manufacturer,model,
						price, overallPerformance,  generation);
		  }
		  else if(componentType.equals("Motherboard")) 
		  {
			  component = new Motherboard( id,manufacturer,model,
						price, overallPerformance,  generation);
		  }
		  else if(componentType.equals("PowerSupply")) 
		  {
			  component = new PowerSupply( id,manufacturer,model,
						price, overallPerformance,  generation);
		  }
		  else if(componentType.equals("RandomAccessMemory")) 
		  {
			  component = new RandomAccessMemory( id,manufacturer,model,
						price, overallPerformance,  generation);
		  }
		  else if(componentType.equals("SolidStateDrive")) 
		  {
			  component = new SolidStateDrive( id,manufacturer,model,
						price, overallPerformance,  generation);
		  }
		  else if(componentType.equals("VideoCard")) 
		  {
			  component = new VideoCard( id,manufacturer,model,
						price, overallPerformance,  generation);
		  }
		  else {
			  throw new IllegalArgumentException("Component type is invalid.");
		  }
		  
		  c.components.add(component);

		return String.format("Component %s with id %d added successfully in computer with id %d.",component.getClass().getSimpleName(),component.getId(),c.getId());
	}

	@Override
	public String removeComponent(String componentType, int computerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buyComputer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BuyBestComputer(double budget) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getComputerData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
