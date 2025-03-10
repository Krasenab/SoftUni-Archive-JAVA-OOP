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
import onlineShop.Headset;
import onlineShop.Keyboard;
import onlineShop.Laptop;
import onlineShop.Monitor;
import onlineShop.Motherboard;
import onlineShop.Mouse;
import onlineShop.Peripheral;
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
//		Creates a peripheral, with the correct type, and adds it to the computer with that id, then adds it to the collection of peripherals in the controller.
//		If a peripheral, with the same id, already exists in the peripherals collection, it throws an IllegalArgumentException with the message "Peripheral with this id already exists."
//		If the peripheral type is invalid, throws an IllegalArgumentException with the message "Peripheral type is invalid."
//		If it's successful, it returns "Peripheral {peripheral type} with id {peripheral id} added successfully in computer with id {computer id}.".
		Computer c = getComputer(computerId);
		if(c==null) 
		{
			throw new IllegalArgumentException("PC with this Id not exist");
		}
		
		for(Peripheral p: c.peripherals) 
		{
			if(p.getId()==id) 
			{
				throw new IllegalArgumentException("Peripheral with this id already exists.");
				
			}
		}
		Peripheral peripheral = null;
		if(peripheralType.equals("Headset")) 
		{
			peripheral = new Headset(id,manufacturer,model,price,overallPerformance,connectionType);
		}
		else if(peripheralType.equals("Keyboard")) 
		{
			
			peripheral = new Keyboard(id,manufacturer,model,price,overallPerformance,connectionType);
		}
		else if(peripheralType.equals("Monitor")) 
		{
			peripheral = new Monitor(id,manufacturer,model,price,overallPerformance,connectionType);
		}
		else if(peripheralType.equals("Mouse")) 
		{
			peripheral = new Mouse(id,manufacturer,model,price,overallPerformance,connectionType);
		}
		else {
			
			throw new IllegalArgumentException("Peripheral type is invalid.");
		}
		
		c.peripherals.add(peripheral);
		
		
		return String.format("Peripheral %s with id %d added successfully in computer with id %d.",peripheralType,id,c.getId());
	}

	@Override
	public String removePeripheral(String peripheralType, int computerId) {
		//"Successfully removed {peripheral type} with id { peripheral id}.".
		
		Computer c = getComputer(computerId);
		int id=0;
		for(Peripheral p: c.peripherals) 
		{
			if(p.getClass().getSimpleName().equals(peripheralType)) 
			{
				id = p.getId();
				c.peripherals.remove(p);
			}
		}
		
		return String.format("Successfully removed peripheralType with id %d.", peripheralType,id);
		
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
		// Removes a component, with the given type from the computer with that id, then removes component from the collection of components.
		//If it's successful, it returns "Successfully removed {component type} with id {component id}.".
		Computer comp = null;
		Component compoForRemove = null;
		Boolean isExistComputer = false;
		for(Computer c:computers) 
		{
			if(computerId == c.getId()) 
			{
				comp = c;
				isExistComputer = true;
				break;
			}
		}
		if(isExistComputer==false) 
		{
			throw new IllegalArgumentException("\"Computer with this id not exists.\"");
		}
		
		for(Component compo:comp.components) 
		{
			if(compo.getClass().getSimpleName().equals(componentType)) 
			{
				compoForRemove = compo;
				break;
			}
		}
		comp.components.remove(compoForRemove);
		
		
		return String.format("Successfully removed {component type} with id {component id}.",componentType,comp.getId());
	}

	@Override
	public String buyComputer(int id) {
		Computer c = getComputer(id);
		computers.remove(c);
		return c.toString();
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
	
	private Computer getComputer(int computerId) 
	{
		Computer c = null;
		for(Computer currentComputer:computers) 
		{
			if(currentComputer.getId()== computerId) 
			{
				return c = currentComputer;
			}
		}
		return c;
	}

}
