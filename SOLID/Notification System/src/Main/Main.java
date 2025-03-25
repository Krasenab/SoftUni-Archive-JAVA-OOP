package Main;

import notificationsModels.EmailNotification;
import notificationsModels.PushNotification;
import notificationsModels.SmsNotification;
import notifications.Inotifications;
public class Main {

	public static void main(String[] args) {
		
		 	Inotifications email = new EmailNotification("test@example.com");
	        Inotifications sms = new SmsNotification("+359888123456");
	        Inotifications push = new PushNotification("device-12345");
	        
	        
	        
	        NotificationProcessor notification1 = new NotificationProcessor(email);
	        NotificationProcessor notification2 = new NotificationProcessor(sms);
	        
	        NotificationProcessor notification3 = new NotificationProcessor(push);
	        
	        // Изпращане на различни видове нотификации
	        notification1.sendNotification("Hello! This is an email notification.");
	        notification2.sendNotification("Hello! This is an SMS notification.");
	        notification3.sendNotification("Hello! This is a push notification.");



	}

}
