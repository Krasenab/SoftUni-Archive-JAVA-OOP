package systemSplit;

public class HeavyHardware extends Hardware {

	private final double increasesDecreasesValue = 0.25;
	
	
	public HeavyHardware(String name, String type, int maximumCapacity, int maximumMomory) {
		super(name, type, maximumCapacity, maximumMomory);
		this.decreasesMemory();
		this.doublesCapacity();
	}
	
	
	private void decreasesMemory() 
	{
		double calculation = this.getMaximumMomory() * increasesDecreasesValue;
		double result = this.getMaximumCapacity() - calculation;
		this.setMaximumMomory((int)result);
	}
	private void doublesCapacity() 
	{
		this.setMaximumCapacity(this.getMaximumCapacity()*2);
	}

}
