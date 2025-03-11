import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import interfacesOnlineShop.InputReader;

public class Reader implements InputReader {
	 private BufferedReader reader;

	    public Reader() {
	        this.reader = new BufferedReader(new InputStreamReader(System.in));
	    }

	   
	    public String readLine() throws IOException {
	        return this.reader.readLine();
	    }
} 	
