package payments;

import paymentIntefaces.IbankCard;
import paymentIntefaces.Ipayment;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DebitCardPayment implements Ipayment, IbankCard  {
	
	private String forntNumbers;
	private String validThru;
	private String cvv;
	private double money;
	private final double paymentTax = 0.01;
	public DebitCardPayment(String frontNumbers,String validThru,String cvv) 
	{
			
		this.setCvv(cvv);
		this.setValidThru(validThru);
		this.setForntNumbers(frontNumbers);
	}
	
	
	
	@Override
	public String payment(double amount) {
		if(this.money<amount) 
		{
			return String.format("insufficient availability.");
		}
		double calculateTax = amount*paymentTax;
		this.setAccountQuatity(this.getAccountQuantity() - amount-calculateTax);
		
		LocalTime timeNow = LocalTime.now();
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter myTimeFormatObj = DateTimeFormatter.ofPattern("HH:mm");
		
		return String.format("Payment done successfull with %s .\nPayed: %.2f $.\nDate: %s\nTime: %s",this.getClass().getSimpleName() ,amount ,localDate.format(myFormatObj),timeNow.format(myTimeFormatObj));
	}
	
	
	
	@Override
	public void setForntNumbers(String frontNumber) {
		// TODO Auto-generated method stub
		if(frontNumber.length()!=15) 
		{	
			throw new IllegalArgumentException("Invalid number");
		}
		this.forntNumbers = frontNumber;
	}
	@Override
	public void setValidThru(String validDate) {
		 if(validDate.isBlank() || validDate.isEmpty()) 
		 {
			 throw new IllegalArgumentException("Invalid date");
		 }
		 
		this.validThru = validDate;
	}
	@Override
	public void setCvv(String cvv) {
		if(cvv.length()<3 || cvv.length()>3) 
		{
			 throw new IllegalArgumentException("Invalid cvv code");
		}
		this.cvv = cvv;
	}

	public void setAccountQuatity(double quantity) {
		if(quantity<=0.00) 
		{
			throw new IllegalArgumentException("Quantity cannot be zero");
		}
		this.money = quantity;
	}
	public double getAccountQuantity() 
	{
		return this.money;
	}


	
	
	
}
