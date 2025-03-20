package logers;
	
import java.util.ArrayList;
import java.util.List;

import logInterfaces.Appenders;
import logInterfaces.Loggers;
	
public class MessageLogger implements Loggers {
		
		
		private List<Appenders> apList = new ArrayList<>();
		
		public MessageLogger(Appenders... ap) 
		{
			addAppenders(ap);
		}
		@Override
		public void warrnings(String date, String message) {
			
			log(date,"WARRNING",message);
			
		}
		@Override
		public void errors(String date, String message) {
			log(date,"ERROR",message);
			
		}
		@Override
		public void info(String date, String message) {
			log("INFO",date,message);
			
		}
		
		@Override
		public void critical(String date, String message) {
			log(date,"CRITICAL",message);
			
		}
		@Override
		public void fatal(String date, String message) {
		    log(date,"FATAL",message);
			
		}
		
		
		
		
		private void addAppenders(Appenders...appenders) 
		{
		
			for(Appenders ap:appenders) 
			{
				
				apList.add(ap);
			}
		}
		private void log(String date,String report,String message) 
		{
			
			for(Appenders app:apList) 
			{
				app.append(date,report,message);
			}
		}
		
		
		public void printLogMessages() 
		{
			for(Appenders ap: apList) 
			{
				
				System.out.print(ap.getClass().getSimpleName());
			}
		}
	
	}
