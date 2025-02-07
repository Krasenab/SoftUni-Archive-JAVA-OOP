package appenders;

import interfaces.Appenders;
import interfaces.Layout;

public class ConsoleAppender implements Appenders {
	private Layout interfaceLayout;
	public ConsoleAppender(Layout inputLayout) 
	{
		interfaceLayout = inputLayout;
	}

	@Override
	public void appendMessage(String dateTime, String reportLevel, String message) {
		
		System.out.println(interfaceLayout.format(dateTime, reportLevel, message));
		
	}
}
