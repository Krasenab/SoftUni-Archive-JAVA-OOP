import commandPatternIntefaces.ICommand;

public class Main {

	public static void main(String[] args) {
		
		ModifyPrice mdp = new ModifyPrice();
		Product p = new Product("Phone",500);
		execute(mdp,new DecreaseProductPriceCommand(p,100));
	}
	
	private static void execute(ModifyPrice mdp,ICommand c) 
	{
		mdp.setCommand(c);
		mdp.invoke();
	}

}
