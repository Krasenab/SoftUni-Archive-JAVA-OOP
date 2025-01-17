import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		double currentCalculation = -1;
		String operation = "";
		double finalResult = -1;
		List<Double> calculatoinMemory = new ArrayList<>();
		int currentMr = -1;
		
			while(true) 
			{
				
				String[] input = sc.nextLine().split(" ");
				if(input[0].equals("End")) 
				{
					System.out.println("Result is: "+ currentCalculation);
					break;
				}
				for(int a=0;a<input.length;a++) 
				{
					if(isNum(input[a])) 
					{
						double n = Double.parseDouble(input[a]);
						if(currentCalculation==-1) 
						{
							currentCalculation = n;
						}
						
						if(!operation.isEmpty()) 
						{
							if(operation.equals("*")) 
							{
								
								currentCalculation *= n;
								finalResult = currentCalculation;
							}
							if(operation.equals("/")) 
							{
								currentCalculation/=n;
							}
						
							operation="";
						}
					}
					else if(input[a].equals("ms")) 
					{
						System.out.println("Added in memory: " + currentCalculation);
						calculatoinMemory.add(currentCalculation);
					}
					else if(input[a].equals("mr")) 
					{
						if(operation.equals("*")) 
						{
							currentCalculation *= calculatoinMemory.remove(0);
						}
						if(operation.equals("/")) 
						{
							currentCalculation /= calculatoinMemory.remove(0);
						}
						if(operation.isEmpty()) 
						{
							currentCalculation = calculatoinMemory.remove(0);
						}
						operation = "";
						
					}
					else 
					{
						operation = input[a];
					}
					
				}
			}
			
			

    }
	// i make this method cuz if i use Charachter.isDigit() i cannot check when number is more then two digit ( 12, 123, 4321)  input 1sd1 this is not number
	public static boolean isNum(String numberAsStr) 
	{
		try {
			Double.parseDouble(numberAsStr);
			return true;
			
		}catch(NumberFormatException e){
			
			return false;
			
		}
		
	}
}
