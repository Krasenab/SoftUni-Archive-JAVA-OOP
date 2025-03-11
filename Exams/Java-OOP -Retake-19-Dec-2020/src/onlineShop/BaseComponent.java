package onlineShop;

public abstract class BaseComponent extends BaseProduct {

	private int generation;
	
	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

	public BaseComponent(int id, String manufacturer, String model, double price, double overallPreformance,int generation) {
		super(id, manufacturer, model, price, overallPreformance);
		this.setGeneration(generation);
	}
	
	@Override
	public String toString() 
	{
		return String.format("Overall Performance: %f. Price: %f - %s: %s %s (Id: %d)\n Generation: {%d}"
				, this.getOverallPreformance(),this.getPrice(),this.getClass().getSimpleName(),this.getManufacturer(),this.getModel(),this.getId(),this.getGeneration());
	}

}
