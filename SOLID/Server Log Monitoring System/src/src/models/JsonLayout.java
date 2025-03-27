package models;

import interfaces.IAppender;
import interfaces.ILayout;

public class JsonLayout implements ILayout{

	public JsonLayout() 
	{
		
	}
	
	@Override
	public String format(String date, String houers, String level, String text) {
		
	    return String.format("{ \"date\": \"%s %s\", \"level\": \"%s\", \"message\": \"%s\" }", date, houers, level, text);
	}

}
