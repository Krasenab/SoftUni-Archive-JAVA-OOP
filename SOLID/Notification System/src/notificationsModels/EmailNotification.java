package notificationsModels;

import notifications.Inotifications;

public class EmailNotification implements Inotifications {
	
	private String emailAddress;
	
	
	public EmailNotification(String greeterEmailAddress) 
	{
		this.emailAddress = greeterEmailAddress;
	}
	
	@Override
	public void send(String text) {
		
		System.out.print(String.format("Email is send to %s.\n %s", this.emailAddress,text));
	}
	

	

}
