package systemSplit;

public abstract class Software {
	

	private String name;
	private String type;
	private int capacityConsumption;
	private int memoryConsumption;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacityConsumption() {
		return capacityConsumption;
	}
	public void setCapacityConsumption(int capacityConsumption) {
		this.capacityConsumption = capacityConsumption;
	}
	public int getMemoryConsumption() {
		return memoryConsumption;
	}
	public void setMemoryConsumption(int memoryConsumption) {
		this.memoryConsumption = memoryConsumption;
	}
	public Software(String name, String type, int capacityConsumption, int memoryConsumption) {
		super();
		this.name = name;
		this.type = type;
		this.capacityConsumption = capacityConsumption;
		this.memoryConsumption = memoryConsumption;
	}
	
	
	
	
	

}
