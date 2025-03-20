package controllers;

import java.util.Scanner;

import logInterfaces.Appenders;
import logInterfaces.Layouts;
import logInterfaces.Loggers;
import logers.ConsoleAppender;
import logers.MessageLogger;
import logers.SimpleLayout;

public class Controller {
	
	Scanner sc = new Scanner(System.in);
	String appenderType = "";
	String layoutType = "";
	String reportLevel = "";
//	String[] command = null;
	
	private Layouts layout;
	private Loggers log;
	private Appenders ap;
	public Controller() 
	{
		
	}
	
	public void input() 
	{
		int n = Integer.parseInt(sc.nextLine());
		for(int a=0;a<n;a++) 
		{
			String[] inputArr = sc.nextLine().split(" ");
			appenderType = inputArr[0];
			layoutType = inputArr[1];
			if(inputArr.length==3) 
			{
				reportLevel = inputArr[2];
			}
			else {
				reportLevel = "INFO";
			}
			setAppenders();
		}
		
	}
	
	private void setAppenders() 
	{
		
		
		if(appenderType.equals("ConsoleAppender") && layoutType.equals("SimpleLayout")) 
		{
			layout = new SimpleLayout();
			ap = new ConsoleAppender(layout);
			this.log = new MessageLogger(ap);			
			setLoggers(ap);
		}
		
		
	}
	private void setLoggers(Appenders ap) 
	{
		String stop = "STOPER";
		while(true)
		{
			String[] command = sc.nextLine().split("\\|");
			if(command[0].equals("End")) 
			{
				((MessageLogger) log).printLogMessages();
				break;
			}
			
			reportLevel = command[0];
			String time = command[1];
			String message = command[2];
			if(reportLevel.equals("ERROR")) 
			{
				log.errors(time, message);
			}
			else if(reportLevel.equals("WARNING")) 
			{
				log.warrnings(time, message);
			}
			else if(reportLevel.equals("INFO")) 
			{
				log.info(time, message);
			}
			else if(reportLevel.equals("FATAL")) 
			{
				log.fatal(time, message);
			}
			else if(reportLevel.equals("CRITICAL")) 
			{
				log.critical(time, message);
			}
			
		}
	}
	
}
