package systemSplit;

public class PowerHardware extends Hardware {

	private final double decreasesIncreasesCapacityValue = 0.75;
	
	public PowerHardware(String name, String type, int maximumCapacity, int maximumMomory) {
		super(name, type, maximumCapacity, maximumMomory);
		this.decreasesCapacity();
		this.increasesMemory();		
		}
	
	
	private void decreasesCapacity() 
	{		
		double calculation = this.getMaximumCapacity() * this.decreasesIncreasesCapacityValue;
		double result = this.getMaximumCapacity() - calculation;
				
		this.setMaximumCapacity((int)result);
	}
	private void increasesMemory() 
	{
		double calculation = this.getMaximumMomory() * decreasesIncreasesCapacityValue;
		double result = this.getMaximumMomory() + calculation;		
		this.setMaximumMomory((int)result);
	}

}
