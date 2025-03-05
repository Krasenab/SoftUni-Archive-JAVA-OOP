package onlineShop;

public abstract class BasePeripheral extends BaseProduct {

	private String connectionType;
	
	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public BasePeripheral(int id, String manufacturer, String model, double price, double overallPreformance,String conncetionType) {
		super(id, manufacturer, model, price, overallPreformance);
		this.setConnectionType(conncetionType);
	}
	
	public String toString() 
	{
		return super.toString() + String.format("Connection Type: {%s}", this.getConnectionType());
	}

}
