import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import foodshortage.Citizen;
import foodshortage.Rebel;

public class Engine 
{
		Scanner sc = new Scanner(System.in);
		List<Rebel> rebels = new ArrayList<>();
		List<Citizen> citizens = new ArrayList<>();
		public String CommandAcceptor() 
		{
		
			Integer nPeople = sc.nextInt(); 
			
			for(int a =0;a<=nPeople;a++) 
			{
				String[] dataInput = sc.nextLine().split(" ");
				if(dataInput.length==3) 
				{
					Rebel r = new Rebel(dataInput[0],Integer.parseInt(dataInput[1]),dataInput[2]);
					rebels.add(r);					
				}else if(dataInput.length==4) 
				{
					Citizen c = new Citizen(dataInput[0],Integer.parseInt(dataInput[1]),dataInput[2],dataInput[3]);
					
					citizens.add(c);
				}else {
					
					continue;
				}
									
			}
			
			int getResult=Start(rebels,citizens);
			String result = Integer.toString(getResult);
			return result;
		}
		
		private int Start(List<Rebel> rebel,List<Citizen>citizen) 
		{
			
			String namesInput = sc.nextLine();
			
			int result = 0;
			while(!namesInput.equals("End"))
			{
				
				
				for(Rebel r:rebel) 
				{
				   if(r.getName().equals(namesInput)) 
				   {
					   r.buyFood();
					   
				   }
				}
				
				
				for(Citizen c:citizen) 
				{
					
					
					if(c.getName().equals(namesInput)) 
					{
						c.buyFood();
						
				
					}
				}
				
				
				namesInput = sc.nextLine();
				
			}
			
			
			for(Rebel r:rebel) 
			{
				result += r.getFood();
			}
			for(Citizen c:citizen) 
			{
				result +=c.getFood();
			}
			
			return result;
		}
		
	
}
