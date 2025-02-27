import commandPatternIntefaces.ICommand;

public class DecreaseProductPriceCommand implements ICommand {

	private final Product product;
	private final float amount;
	
	
	
	public DecreaseProductPriceCommand(Product p,float amount) {
		this.amount = amount;
		this.product = p;
	}




	@Override		
	public void executeAction() {
		this.product.decreasePrice(this.amount);
		
		System.out.printf("This price of the %s has been decreased by %s \n",this.product.getName(),this.amount);
	}

}
