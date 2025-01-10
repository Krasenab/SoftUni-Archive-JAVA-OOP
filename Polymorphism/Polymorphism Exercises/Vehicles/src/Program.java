import java.awt.TextComponent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Vechicle.Car;
import Vechicle.Truck;

public class Program {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bfR = new BufferedReader(new InputStreamReader(System.in));
		
		String[] vechicle1 = bfR.readLine().split(" ");
		Car c = new Car(Double.parseDouble(vechicle1[1]),Double.parseDouble(vechicle1[2]));
		
		String[] vechicle2 = bfR.readLine().split(" ");
		Truck t = new Truck(Double.parseDouble(vechicle2[1]),Double.parseDouble(vechicle2[2]));
		
		int n = Integer.parseInt(bfR.readLine());
		
		for(int a = 0;n>a;a++) 
		{
			String[] commands = bfR.readLine().split(" ");
			String action = commands[0];
			String distance = commands[2];
			if(commands[1].equals("Car")) 
			{
				if(action.equals("Drive")) 
				{
					c.drive(Double.parseDouble(distance));
				
				}
				else {
					//System.out.println("I am in else conditon etc. REFEUL");
					c.refuel(Double.parseDouble(commands[2]));
				}
			}
			else if(commands[1].equals("Truck")) 
			{
				if(action.equals("Drive")) 				
				{
					t.drive(Double.parseDouble(distance));
				}
				else if(action.equals("Refuel")) 
				{
					t.refuel(Double.parseDouble(commands[2]));
				}
							
			}
			
		}
		
		System.out.println("Car: "+ (double) Math.round(c.getFuelQuantity()*100)/100);
		System.out.println("Truck: "+(double)Math.round(t.getFuelQuantity()*100)/100);
		
	}

}
