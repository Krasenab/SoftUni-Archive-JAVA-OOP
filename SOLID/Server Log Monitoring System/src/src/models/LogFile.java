package models;

import java.util.List;

import interfaces.IAppender;
import interfaces.ILayout;
import interfaces.ILogger;

public class LogFile {

	private StringBuilder sb = new StringBuilder();
	private int size;
	
	public LogFile() 
	{
		
		
	}
	
	public void writeLog(String text) 
	{
		sizeFile(text);
		sb.append(text);
	}
	public int getSize() 
	{
		
		return this.size;
	}
	private void sizeFile(String text) 
	{
		for(int ab=0;ab<text.length();ab++) 
		{
			char getSimbol = text.charAt(ab);
			if(Character.isAlphabetic(getSimbol)) 
			{
				size+=(int) getSimbol;
			}
		}
	}
	public String getLogs() 
	{
		return this.sb.toString();
	}
}
