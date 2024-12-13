import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

import person.Citizen;
import person.Person;

public class Program {

	public static void main(String[] args) {
		
		Class[] citInterfaces = Citizen.class.getInterfaces();
		if(Arrays.asList(citInterfaces).contains(Person.class)) 
		{
			Method[] fields = Person.class.getDeclaredMethods();
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			int age = Integer.parseInt(sc.nextLine());
			Person p = new Citizen(name,age);
			System.out.println(fields.length);
			System.out.println(p.getName());
			System.out.println(p.getAge());
			
		}

	}

}
