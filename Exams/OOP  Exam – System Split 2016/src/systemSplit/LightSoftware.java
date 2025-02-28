package systemSplit;

public class LightSoftware extends Software {

	private final double value = 0.50;
	public LightSoftware(String name, String type, int capacityConsumption, int memoryConsumption) {
		super(name, type, capacityConsumption, memoryConsumption);
		increasesCapacityConsumption(); 
		decreasesMemoryConsumption(); 
	}
	
	private void increasesCapacityConsumption() 
	{
		double  calculation = this.getCapacityConsumption()* this.value;
		double result = this.getCapacityConsumption() + calculation;
		this.setCapacityConsumption((int)result);
	} 
	 
	private void decreasesMemoryConsumption() 
	{
		double calculation = this.getMemoryConsumption() * value;
		double result = this.getMemoryConsumption() - calculation;
		this.setMemoryConsumption((int)result);
	} 

}
