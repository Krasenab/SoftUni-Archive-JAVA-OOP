import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Person.Person;

public class Program {

	public static void main(String[] args) throws IOException {
		
		//Scanner sc= new Scanner(System.in);
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buffReader.readLine());
		
		List<Person> persons = new ArrayList<Person>();
		
		for(int a =0;a<=n;a++) 
		{
			String[] input = buffReader.readLine().split(" ");
			if(input.length>1) 
			{
				Person p = new Person(input[0],input[1],Integer.parseInt(input[2]));
				persons.add(p);
			}
		
		}
		
		//System.out.println("Not sorted printng: ");
		//for(int ab = 0;ab<persons.size();ab++) 
		//{
			//System.out.println(persons.get(ab).toString());
			
			
		//}
		
		System.out.println();
		System.out.println("Sorted collection: ");
		
		Collections.sort(persons,(firstPerson,secondPerson) -> 
		{
			int nameAndAgeCompare = ((Person) firstPerson).getFirstName().compareTo(((Person) secondPerson).getFirstName());
			if(nameAndAgeCompare !=0) 
			{
				return nameAndAgeCompare;
			}
			else {
				
				return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
			}
		
		});
		
		for(int m=0;m<persons.size();m++) 
		{
			System.out.println(persons.get(m).toString());
		}
		
		buffReader.close();
		//sc.close();
	}

}
