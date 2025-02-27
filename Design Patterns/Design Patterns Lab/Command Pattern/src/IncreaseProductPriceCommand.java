import commandPatternIntefaces.ICommand;

public class IncreaseProductPriceCommand implements ICommand {
	
	private final Product p;
	private final float amount;
	public IncreaseProductPriceCommand(Product inputProduct,float amount) 
	{
		this.amount = amount;
		this.p = inputProduct;
	}
	
	
	@Override
	public void executeAction() {
		this.p.increasePrice(this.amount);
		
		System.out.printf("This price of the %s has been increased by %s $ \n",this.p.getName(),this.amount);
		
	}
	
}
