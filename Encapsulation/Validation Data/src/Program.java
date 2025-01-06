import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import personValidatonData.Person;

public class Program {
	
	public static void main(String[] args) throws IllegalArgumentException, IOException 
	{
		List<Person> personsList = new ArrayList<>();
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		
		int nLine = Integer.parseInt(buffReader.readLine());
		for(int a =0;a<nLine;a++) 
		{
			
			String[] arr = buffReader.readLine().split(" ");
			Person p = new Person(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
			personsList.add(p);			
		}
		double precent = Double.parseDouble(buffReader.readLine());
		
		for(Person per : personsList) 
		{
			per.increaseSalary(precent);
		}
	}
	
}
