package models;

import interfaces.IAppender;
import interfaces.ILayout;

public class ConsoleAppender implements IAppender {
	
	private  ILayout layoutModel;
	public ConsoleAppender(ILayout inputLayoutModel) 
	{
		this.layoutModel = inputLayoutModel;
	}

	@Override
	public void append(String date, String houers, String level, String text) {
		
		System.out.println(layoutModel.format(date, houers, level, text));
	}
	
	
}
