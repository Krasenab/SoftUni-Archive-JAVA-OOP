package logers;

import logInterfaces.Appenders;
import logInterfaces.Layouts;

public class ConsoleAppender implements Appenders {
	private  Layouts layout;
	
	public ConsoleAppender(Layouts lay) 
	{
		this.layout = lay;
	}

	@Override
	public void append(String date, String reportLevel, String messages) {
		
		System.out.println(layout.layout(date, reportLevel, messages));
	}

	

}
