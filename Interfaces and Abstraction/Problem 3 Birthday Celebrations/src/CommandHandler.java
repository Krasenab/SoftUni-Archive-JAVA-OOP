
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import birthdaycelebrations.Citizen;
import birthdaycelebrations.Pet;
import birthdaycelebrations.Robot;

public class CommandHandler 
{
	private List<String> dataStructorCollector = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public CommandHandler() 
	{
		
	}
	
	
	public void StartApp() 
	{
		String[] inputArr = sc.nextLine().split(" ");
		
		while(!inputArr[0].equals("End")) 
		{
			if(inputArr.length>=4) 
			{
				String type = inputArr[0];
				String name = inputArr[1];
				int age =Integer.parseInt(inputArr[2]);
				String id = inputArr[3];
				String bDay = inputArr[4];
				Citizen c = new Citizen(name, age, id, bDay);
				dataStructorCollector.add(c.getBirthday());
				
			}
			else if(inputArr.length<=3) 
			{
				if(inputArr[0].equals("Robot")) 
				{
					String model = inputArr[1];
					String id = inputArr[2];
					Robot r = new Robot(model,id);
					
				}
				else if(inputArr[0].equals("Pet")) 
				{
					String name = inputArr[1];
					String bDay = inputArr[2];
					Pet p = new Pet(name,bDay);
					dataStructorCollector.add(p.getBirthday());
					
				}
			}
			inputArr = sc.nextLine().split(" ");
			if(inputArr.length<=1 && inputArr[0].equals("End")) 
			{
		      
				break;
			}
		}
		String serchedDate = sc.nextLine();
		Boolean isFind = false;
		for(int a =0;a<dataStructorCollector.size();a++) 
		{
			String[] currentbDate = dataStructorCollector.get(a).split("/");
		    String year = currentbDate[2];

			if(serchedDate.equals(year))
			{
				System.out.println(dataStructorCollector.get(a));
				isFind = true;
			}
			
				
		}
		if(!isFind) 
		{
			System.out.println("<no output>");
		}
		
	}
}
