package payments;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import helpPack.DateInfo;
import paymentIntefaces.IbankCard;
import paymentIntefaces.Ipayment;



public class PayPal implements Ipayment  {

	private double balance;

	public PayPal() 
	{
		
	}
	@Override
	public String payment(double amount) {
		
		if(balance < 0 || this.balance - amount <=0) 
		{
			throw new IllegalArgumentException("You cannot buy this item"); 
		}
		balance -= amount;
		
		
		
		return String.format("Payment done successfull with %s .\nPayed: %.2f $.\nDate: %s\nTime: %s"
				,this.getClass().getSimpleName() 
				,amount,DateInfo.getDate() ,DateInfo.getTime());
	}
	public void setBalance(double balance) 
	{
		if(balance <0) 
		{
			throw new IllegalArgumentException("Balance cannot be less than zero");
		}
		this.balance = balance;
	}
	
	
}
