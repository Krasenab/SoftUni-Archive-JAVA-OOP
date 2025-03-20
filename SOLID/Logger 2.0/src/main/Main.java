package main;
import logers.ConsoleAppender;
import logers.LogFile;
import logers.SimpleLayout;
import controllers.Controller;
import logInterfaces.Layouts;
import logInterfaces.Loggers;
import logers.MessageLogger;


public class Main {
	public static void main(String[]args) 
	{
		
//		Layouts simpleLayout = new SimpleLayout();
//		ConsoleAppender consoleAppender = new ConsoleAppender(simpleLayout);
//		LogFile fileAppender = new LogFile(simpleLayout);
//
//		Loggers logger = new MessageLogger(consoleAppender, fileAppender);
//		logger.errors("3/26/2015 2:08:11 PM", "Error parsing JSON.");
//		logger.info("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");
		
		Controller c = new Controller();
		c.input();
	}	
}
