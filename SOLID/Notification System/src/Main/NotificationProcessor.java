package Main;

import notifications.Inotifications;

public class NotificationProcessor {
		Inotifications noticitaion;
		
		public NotificationProcessor(Inotifications notification) 
		{
			this.noticitaion = notification;
		}
		
		public void sendNotification(String text) 
		{
			this.noticitaion.send(text);
		}
}
