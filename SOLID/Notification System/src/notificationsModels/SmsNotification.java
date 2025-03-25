package notificationsModels;

import notifications.Inotifications;

public class SmsNotification implements Inotifications {

	private String smsText;
	private String phone;
	public SmsNotification(String phoneNumber) 
	{
		this.setPhone(phoneNumber);
	}
	@Override
	public void send(String text) {
		System.out.println(String.format("SMS to %s.\n You send: %s", this.phone,text));
		
	}
	
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
}
