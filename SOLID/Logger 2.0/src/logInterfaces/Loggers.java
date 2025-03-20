package logInterfaces;

public interface Loggers {
	
	public void warrnings(String date,String message);
	public void errors(String date,String message);
	public void info(String date,String message);
	public void critical(String date,String message);
	public void fatal(String date,String message);
}
