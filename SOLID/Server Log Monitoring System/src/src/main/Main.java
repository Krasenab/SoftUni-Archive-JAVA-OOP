package main;
import interfaces.ILayout;
import models.ConsoleAppender;
import models.SimpleLayout;
import models.Logger;

import models.FileAppender;
import models.JsonLayout;
import models.LogFile;
import interfaces.ILogger;

import java.util.ArrayList;
import java.util.List;

import interfaces.IAppender;


public class Main {
	public static void main(String[] args) 
	{
		ILayout layout = new SimpleLayout();
//		layout.format("3/26/2025", "20:01", "ERROR", "ERROR logg");
		IAppender ap = new ConsoleAppender(layout);
		ILogger log = new Logger(ap);
		log.INFO("3/26/2025", "20:01", "Loading in progress");
		
		  ILayout jsonLayout = new JsonLayout();
	        IAppender fileAppender = new FileAppender(jsonLayout);
	        ILogger fileLogger = new Logger(fileAppender);
	        fileLogger.Critical("3/27/2025", "7:02", "ZAPISVAM KRITIchni danni");
	        System.out.println();
	       

	}
}
