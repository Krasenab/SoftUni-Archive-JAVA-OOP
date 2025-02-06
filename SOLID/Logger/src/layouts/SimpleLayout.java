package layouts;

import interfaces.Layout;

public class SimpleLayout implements Layout 
{
	public SimpleLayout() 
	{
		
	}

	@Override
	public String format(String dateTime, String reportLevel, String message) {
		
		return String.format("%s - %s - %s", dateTime,reportLevel,message);
	}
	
	
}
