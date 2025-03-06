package controllers;

import java.util.ArrayList;
import java.util.List;

import interfacesOnlineShop.Controller;
import onlineShop.Computer;
import onlineShop.DesktopComputer;
import onlineShop.Laptop;

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
		// TODO Auto-generated method stub
		return null;
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
