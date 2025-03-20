package logers;

import logInterfaces.Appenders;
import logInterfaces.Layouts;

public class LogFile implements Appenders {

	private Layouts layout;
	private StringBuilder sb = new StringBuilder();
	
	public LogFile(Layouts l) 
	{
		this.layout = l;
	}
	
	
	
	
	@Override
	public void append(String date, String reportLevel, String messages) {
		
		sb.append(String.format("%s %s %s", date,reportLevel,messages)).append(System.lineSeparator());
	}

}
