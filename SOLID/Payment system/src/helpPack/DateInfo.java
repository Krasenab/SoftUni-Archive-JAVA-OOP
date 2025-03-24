package helpPack;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class DateInfo  {
	
	public DateInfo() {}
	
	public static String getDate() {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String dateNow = localDate.format(myFormatObj);
		return dateNow;
	}


	public static String getTime() {
		LocalTime timeNow = LocalTime.now();
		DateTimeFormatter myTimeFormatObj = DateTimeFormatter.ofPattern("HH:mm");
	
		String time = timeNow.format(myTimeFormatObj);
		
		return time;
		
		
	}
	
}
