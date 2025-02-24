package main;
import singletoninterfaces.Ilogger;
public class Main {

	public static void main(String[] args) {
		Ilogger log =Logger.getInstance();
		//log.log("Error in program 8G6206M0291");
		//log.log("Error in IQP 8G6206M0295");
		//log.log("Problem with PCDMIS softwere and TESA");
		//log.log("K12 stop reciving");
		
		//log.showLogs();
		Massages m = new Massages();
		String message1 =  m.addMasage("Error", "in program 8G6206M0291");
		String message2 =  m.addMasage("Warrning", "in IQP 8G6206M0295");
		String message3 =  m.addMasage("Warrning", "Problem with PCDMIS softwere and TESA");
		String message4 =  m.addMasage("INFO", "K12 stop reciving");
		
		log.log(message1);
		log.log(message2);
		log.log(message3);
		log.log(message4);
		
		log.showLogs();
		

	}

}
