import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Frog;
import animals.Kitten;
import animals.Tomcat;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String stopWord = "";
		
		List<Animal> dataBase = new ArrayList<>();
		
		while(!stopWord.equals("Beast!")) 
		{
			stopWord = sc.nextLine();
			if(stopWord.equals("Beast!")) 
			{
				break;
			}
			String[] secondLine = sc.nextLine().split(" ");
			if(secondLine.length<=2 || Integer.parseInt(secondLine[1])<=0) 
			{
				System.out.println("Invalid input!");
				continue;
			}
			if(!stopWord.equals("Cat") && !stopWord.equals("Dog") && !stopWord.equals("Tomcat") && !stopWord.equals("Kitten") 
					&& !stopWord.equals("Frog")) 
			{
				System.out.println("Invalid input!");
				continue;
			}
			if(stopWord.equals("Cat")) 
			{
				Cat c = new Cat(secondLine[0],Integer.parseInt(secondLine[1]),secondLine[2]);
				dataBase.add(c);
			}
			else if(stopWord.equals("Tomcat")) 
			{
				Tomcat tC = new Tomcat(secondLine[0],Integer.parseInt(secondLine[1]),secondLine[2]);
				dataBase.add(tC);
			}
			else if(stopWord.equals("Kitten")) 
			{
				Kitten kT = new Kitten(secondLine[0],Integer.parseInt(secondLine[1]),secondLine[2]);
				dataBase.add(kT);
			}
			else if(stopWord.equals("Dog")) 
			{
				Dog d = new Dog(secondLine[0],Integer.parseInt(secondLine[1]),secondLine[2]);
				dataBase.add(d);
			}
			else if(stopWord.equals("Frog")) 
			{
				Frog fg = new Frog(secondLine[0],Integer.parseInt(secondLine[1]),secondLine[2]);
				dataBase.add(fg);
			}
			
			
		}
		
		for(int a = 0; a<dataBase.size();a++) 
		{
			System.out.println(dataBase.get(a).toString());
		}
		
		System.out.println("Out of while loop");
		sc.close();

	}

}
