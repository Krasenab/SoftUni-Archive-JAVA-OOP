package files;

import appenders.FileAppender;
import interfaces.Layout;

public class LogFile extends FileAppender {

	private StringBuilder sb;
	private double size=0;
	private String text;
	public LogFile(Layout layout) {
		super(layout);
		sb =new StringBuilder();
	}
	
	public void write(String txt) 
	{
		this.text = txt;
		sb.append(txt).append(System.lineSeparator());
	}
	
	public double getSize() 
	{	
		char[] c = text.toCharArray();
		for(int a=0;a<c.length;a++) 
		{
			char currentChar = c[a];
			if(Character.isLetter(currentChar)) 
			{
				int valueOfChar = (int)currentChar;
				size+=valueOfChar;
			}
		}
		return size;
	}
	public String readFile() 
	{
		return sb.toString();
	}
		
}
