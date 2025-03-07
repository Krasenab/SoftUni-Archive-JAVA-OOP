import controllers.ControllerImpl;
import onlineShop.Computer;

public class Main {

	public static void main(String[] args) {
		
		
		ControllerImpl c = new ControllerImpl();
		
		System.out.println(c.addComputer("Laptop", 4, "Asus", "ROG", 700));
		//System.out.print(c.addComputer("Tablet", 5, "Asus", "ROG", 700));
		//System.out.println(c.addComputer("Laptop", 0, "Asus", "ROG", 700));
		//System.out.println(c.addComputer("Laptop", 4, "Asus", "ROG", 700));
		//System.out.println(c.addComputer("Laptop", 7, "Asus", "ROG", 0));
		
		System.out.println(c.addComponent(4, 3, "CentralProcessingUnit", "Intel","Xeon", 1600, 82, 10));
		System.out.println(c.addComponent(4, 3, "CentralProcessingUnit", "Intel","Xeon", 1600, 82, 10));
		System.out.println(c.addComponent(4, 3, "CentralProcessingUnit", "Intel","Xeon", 1600, 82, 10));
		System.out.println(c.addComponent(4, 3, "CentralProcessingUnit", "Intel","Xeon", 1600, 82, 10));
		System.out.println(c.addComponent(4, 3, "CentralProcessingUnit", "Intel","Xeon", 1600, 82, 10));
		System.out.println(c.addComponent(4, 3, "CentralProcessingUnit", "Intel","Xeon", 1600, 82, 10));
		for(Computer co: c.computers) 
		{
			System.out.println("Id is:" + co.getId());
		}
		
	}

}
