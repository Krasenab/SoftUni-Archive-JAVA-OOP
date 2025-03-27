package models;

import interfaces.IAppender;
import interfaces.ILogger;

public class Logger implements ILogger {
	IAppender appender;
	LogFile logFile = new LogFile();
	public Logger(IAppender inputAppender) 
	{
		this.appender = inputAppender;
	}
	@Override
	public void INFO(String date, String houers, String text) {
		appender.append(date, houers, "INFO", text);
	
	}
	@Override
	public void Warning(String date, String houers, String text) {
		appender.append(date, houers, "WARNING", text);
		
	}
	@Override
	public void Error(String date, String houers, String text) {
		appender.append(date, houers, "ERROR", text);
		
	}
	@Override
	public void Critical(String date, String houers, String text) {
		appender.append(date, houers, "CRITICAL", text);
		
	}
	@Override
	public void Fatal(String date, String houers, String text) {
		appender.append(date, houers, "FATAL", text);
		
	}
	

}
