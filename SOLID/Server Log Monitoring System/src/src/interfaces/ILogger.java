package interfaces;

public interface ILogger {
	
	public void INFO(String date, String houers, String text);
	public void Warning(String date, String houers, String text);
	public void Error(String date, String houers, String text);
	public void Critical(String date, String houers,  String text);
	public void Fatal(String date, String houers, String text);
}
