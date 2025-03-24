import payments.CreditCardPayment;
import payments.DebitCardPayment;
import payments.PayPal;
import payments.PaymentProcessor;

public class Main {
	
	public static void main(String[]args) 
	{
		DebitCardPayment debitCard = new DebitCardPayment("697 625 358 892","05/2025","412");
		debitCard.setAccountQuatity(150000);
		PaymentProcessor p = new PaymentProcessor(debitCard);
		
		CreditCardPayment creditCard = new CreditCardPayment("697 625 358 892","07/2025","199");
		PaymentProcessor p1 = new PaymentProcessor(creditCard);
		
		
		PayPal pay = new PayPal();
		pay.setBalance(122222222);
		System.out.println(p.pay(12000));
		System.out.println(p1.pay(200000));	
		
		System.out.println(pay.payment(124545));
		
	}	

}
