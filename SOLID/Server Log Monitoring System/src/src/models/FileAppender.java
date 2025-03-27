package models;

import interfaces.IAppender;
import interfaces.ILayout;

import java.io.File;
import java.io.FileWriter; 
import java.io.IOException;

public class FileAppender implements IAppender{
	private ILayout layout;
	private LogFile logFile;
	public FileAppender(ILayout layout) 
	{
		this.layout = layout;
		this.logFile = new LogFile();
	}
	@Override
	public void append(String date, String houers, String level, String text) {
		
//		try {
//			File fileObj = new File("C:\\...\\...\\Desktop\\logFile.txt");
//			
//			FileWriter writer = new FileWriter(fileObj,true);
//			writer.write(layout.format(date, houers, level, text));
//		writer.close();
//			
//		}catch(IOException ex){
//			
//			ex.printStackTrace();
//		}
		  String formattedText = layout.format(date, houers, level, text);
		 logFile.writeLog(formattedText);
		
		
	}
	

}
