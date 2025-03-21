package payments;

import paymentIntefaces.Ipayment;

public class PaymentProcessor {
	
	private Ipayment payment;
	public PaymentProcessor(Ipayment paymentCard) 
	{
		this.payment = paymentCard;
	}
	
	public String pay(double amount) 
	{
		return payment.payment(amount);
	}
	
	
}
