package notificationsModels;

import notifications.Inotifications;

public class PushNotification implements Inotifications {
	
	private String deviceId;
	public PushNotification(String id) 
	{
		this.setDeviceId(id);
	} 
	@Override
	public void send(String text) {
		
		System.out.println(String.format("Send push to device %s.\n notification: %s",this.deviceId, text));
		
	}
	

	public void setDeviceId(String id) 
	{
		this.deviceId = id;
	}
	
}
