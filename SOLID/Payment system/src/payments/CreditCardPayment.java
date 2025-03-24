package payments;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import helpPack.DateInfo;
import paymentIntefaces.IbankCard;
import paymentIntefaces.Ipayment;

public class CreditCardPayment implements Ipayment, IbankCard {
	
	private String frontNumber;
	private String validDate;
	private String cvv;
	
	private double credit;
	private final double paymentTax = 0.03;
	public CreditCardPayment(String frontNumber,String validDate,String cvv) 
	{
		
	}
	@Override
	public String payment(double amount) {
		double addedTax = amount * paymentTax;
		this.credit =+ addedTax;
		
		
		
		return String.format("Payment done successfull with %s .\nPayed: %.2f $.\nDate: %s\nTime: %s",this.getClass().getSimpleName() ,amount ,DateInfo.getDate(),DateInfo.getTime());
	}

	@Override
	public void setForntNumbers(String frontNumber) { 
		this.frontNumber =frontNumber;
		
	}

	@Override
	public void setValidThru(String validDate) {
		
		this.validDate = validDate;
		
	}

	@Override
	public void setCvv(String cvv) {
		this.cvv = cvv;
		
	}

}
