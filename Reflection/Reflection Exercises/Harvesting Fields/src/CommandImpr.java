import java.util.Scanner;

import myReflection.RichSoilLendReflection;

public class CommandImpr 
{
	public CommandImpr() 
	{
		
	}
	
	public void Impr() 
	{
		Scanner sc = new Scanner(System.in);
		
		
		 RichSoilLendReflection rslr = new  RichSoilLendReflection();
		while(true) 
		{
			String command = sc.nextLine();
			if(command.equals("HARVEST")) 
			{
				break;
			}
			
			System.out.println(rslr.getInfo(command));
			
		}
		
	}
}
