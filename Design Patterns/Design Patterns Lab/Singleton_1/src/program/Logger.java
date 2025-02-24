package main;

import java.util.ArrayList;
import java.util.List;

import singletoninterfaces.Ilogger;

public class Logger implements Ilogger {

	private List<String> logMessagers = new ArrayList<>();
	private static Logger loger;
	private Logger() 
	{
		
	}
	@Override
	public  void log(String message) {
		
		logMessagers.add(message);
	}
	
	public static Logger getInstance() 
	{
		if(loger==null) 
		{
			return loger = new Logger();
		}
		return loger;
	}

	@Override
	public void showLogs() {
		
		for(String message:logMessagers) 
		{
			System.out.println(message);
		}
		
	}

}
