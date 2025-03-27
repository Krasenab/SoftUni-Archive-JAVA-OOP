package models;

import interfaces.ILayout;

public class SimpleLayout implements ILayout {
	
	public SimpleLayout() 
	{
		
	}
	@Override
	public String format(String date, String houers, String level, String text) {

		return String.format("<%s  %s> - <%s> - <%s>", date,houers,level,text);
	}

}
