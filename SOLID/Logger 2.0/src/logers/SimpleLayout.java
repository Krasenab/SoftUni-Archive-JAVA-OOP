package logers;

import logInterfaces.Layouts;

public class SimpleLayout implements Layouts {

	@Override
	public String layout(String dateTime, String reportLevel, String message) {
		
		return String.format("<%s> - <%s> - <%s>", dateTime,reportLevel,message);
	}

}
