package systemSplit;

public abstract class Hardware {
	private String name;
	private String type;
	private int maximumCapacity;
	private int maximumMomory;
	
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
	public int getMaximumCapacity() {
		return maximumCapacity;
	}
	public void setMaximumCapacity(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}
	public int getMaximumMomory() {
		return maximumMomory;
	}
	public void setMaximumMomory(int maximumMomory) {
		this.maximumMomory = maximumMomory;
	}
	
	public Hardware(String name, String type, int maximumCapacity, int maximumMomory) {
		super();
		this.name = name;
		this.type = type;
		this.maximumCapacity = maximumCapacity;
		this.maximumMomory = maximumMomory;
	}
	
	
	
	
	
	
}
