import controllers.ControllerImpl;
import onlineShop.Computer;

public class Main {

	public static void main(String[] args) {
				
		ControllerImpl c = new ControllerImpl();		
		EngineImpl e = new EngineImpl();
		e.run();
//		AddComputer DesktopComputer 1 Asus Huracan 500
//		AddComponent 1 1 CentralProcessingUnit Ryzen 3950 1700 80 10
//		AddComponent 1 4 Motherboard MSI MEG 1700 80 7
//		AddComponent 1 16 VideoCard Nvidia Quadro 4000 90 6
//		AddPeripheral 1 2 Monitor Dell S27 800 60 HDMI
		//System.out.println(c.addComputer("DesktopComputer",1,"Asus","Huracan", 500));
		//System.out.println(c.addComponent(1, 1, "CentralProcessingUnit", "Ryzen 3950", "1700", 80, 10));
		
//		System.out.println(c.addComputer("Laptop", 4, "Asus", "ROG", 700));
//		System.out.println(c.addComponent(4, 3, "CentralProcessingUnit", "Intel","Xeon", 1600, 82, 10));
//		System.out.println(c.addComponent(4, 6, "Motherboard", "Asus", "ROG", 1250, 70, 8));
//		System.out.println(c.addComponent(4, 7, "PowerSupply", "Fortron", "FSP", 700, 70, 2));
//		System.out.println(c.addComponent(4, 10, "RandomAccessMemory", "Kingston", "HyperX", 900, 80, 4));
//		System.out.println(c.addComponent(4, 13, "SolidStateDrive", "Samsung", "Evo",800, 85, 7));
//		System.out.println(c.addComponent(4, 17, "VideoCard", "Nvidia", "GeForce", 2000, 97, 9));
//		System.out.println(c.addPeripheral(4, 3, "Headset", "Razer", "Thresher", 300, 70, "Bluetooth"));
		
		//System.out.println(c.addComputer("Laptop", 4, "Asus", "ROG", 700));
		//System.out.println(c.addComponent(4, 3, "CentralProcessingUnit", "Intel", "Xeon", 1600, 82, 9));
		//System.out.println(c.addComponent(4, 6, "Motherboard", "Asus", "ROG", 1250, 70, 8));
		//System.out.println(c.addComponent(4, 7, "PowerSupply", "Fortron", "FSP", 700, 70, 2));
		//System.out.println(c.addComponent(4, 10, "RandomAccessMemory", "Kingston", "HyperX", 900, 80, 4));
		//System.out.println(c.addComponent(4, 13, "SolidStateDrive", "Samsung", "Evo", 800, 85, 7));
		//System.out.println(c.addComponent(4, 17, "VideoCard", "Nvidia", "GeForce", 2000, 97, 9));
		//System.out.println(c.addPeripheral(4, 3, "Headset", "Razer", "Thresher", 300 ,70, "AUX"));
		//System.out.println("----------------------Computer data---------------------------------------");
		
		//System.out.println(c.getComputerData(4));
		//System.out.println(c.getComputerData(4));
//		for(Computer co: c.computers) 
//		{
//			System.out.println("Id is:" + co.getId());
//		}
		
		
		
		
	}

}
