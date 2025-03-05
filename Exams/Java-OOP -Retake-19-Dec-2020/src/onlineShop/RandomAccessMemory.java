package onlineShop;

public class RandomAccessMemory extends Component {

	public RandomAccessMemory(int id, String manufacturer, String model, double price, double overallPreformance,
			int generation) {
		super(id, manufacturer, model, price, overallPreformance, generation);
		this.setOverallPreformance(this.getOverallPreformance()*1.20);
	}

}
