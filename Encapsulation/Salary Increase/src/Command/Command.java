package Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import PersonSalary.Person;

public class Command {
	

	private List<Person> p = new ArrayList<>();
	public Command() 
	{
		
	}
	
	public void Start() throws Throwable, IOException 
	{
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buffReader.readLine());
						
		for(int a=0;a<n;a++) 
		{
			String[] inputArr = buffReader.readLine().split(" ");
			if(inputArr.length>1) 
			{
				Create(inputArr[0],inputArr[1],Integer.parseInt(inputArr[2]),Double.parseDouble(inputArr[3]));
			}
			
		}
		double bonus = Double.parseDouble(buffReader.readLine());
		 increaseBonusAndPrint(bonus); 
		
		
	}
	private void Create(String name,String lastName,int age,double salary) 
	{
		Person person = new Person(name,lastName,age,salary);
		p.add(person);
		
	}
	private void increaseBonusAndPrint(double bonus) 
	{
		for(Person person : p) 
		{
			person.increaseSalary(bonus);
			System.out.println(person.toString());
		}
	}

}
