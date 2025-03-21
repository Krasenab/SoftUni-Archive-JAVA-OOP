import payments.DebitCardPayment;
import payments.PaymentProcessor;

public class Main {
	
	public static void main(String[]args) 
	{
		DebitCardPayment debitCard = new DebitCardPayment("697 625 358 892","05/2025","412");
		debitCard.setAccountQuatity(150000);
		PaymentProcessor p = new PaymentProcessor(debitCard);
		
		
		
		System.out.println(p.pay(12000));
			
	}

}
