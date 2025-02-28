package systemSplit;

public class ExpressSoftware extends Software {

	public ExpressSoftware(String name, String type, int capacityConsumption, int memoryConsumption) {
		super(name, type, capacityConsumption, memoryConsumption);
		
		this.doubleMemoryConsumption();
	}
	
	private void doubleMemoryConsumption() 
	{
		this.setMemoryConsumption(this.getMemoryConsumption()*2);
	}
	
	

}
