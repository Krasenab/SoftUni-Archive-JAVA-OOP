import java.util.HashMap;
import java.util.Map;

import singletonInterfaces.SingletonConatiner;

public class Main {

	public static void main(String[] args) {
		
		 // only one instance
	     SingletonConatiner iSingletonContainer = SingletonDataContainer.getInstance();
		
	     Map<String,Integer> cityAndPopulation = new HashMap<>();
	     cityAndPopulation.put("Sofiq", 110000);
	     cityAndPopulation.put("Plovdiv",700000000);
	     
	    
	     System.out.println(iSingletonContainer.getPopulation(cityAndPopulation, "Sofiq"));
	     
	     
	}

}
