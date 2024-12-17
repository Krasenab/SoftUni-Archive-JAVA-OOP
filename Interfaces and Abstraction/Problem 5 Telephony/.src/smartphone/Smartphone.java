package smartphone;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable,Browsable {

    private List<String> numbers = new ArrayList<>();
    private List<String> urls = new ArrayList<>();
    private StringBuilder outputNumbersAndUrls = new StringBuilder();

	public Smartphone(List<String> inputNumbers, List<String>inputUrls) 
	{
		this.numbers = inputNumbers;
		this.urls = inputUrls;
	}
	
	
	
	@Override
	public String browse() {
		outputNumbersAndUrls = new StringBuilder();
		Boolean findDigit = false;
		for(var url:urls) 
		{
			for(var c:url.toCharArray()) 
			{
				if(Character.isDigit(c)) 
				{
					outputNumbersAndUrls.append(String.format("Invalid URL!\n"));
					findDigit = true;
					break;
				}
			}
			if(findDigit==true) 
			{
				findDigit = false;
				continue;
			}
			else {
				outputNumbersAndUrls.append(String.format("Browsing: %s!\n",url));
			}
		}
	
		return outputNumbersAndUrls.toString().trim();
		
	}

	@Override
	public String call() {

		

		for(var number: numbers) 
		{
			try {
				
				Integer.parseInt(number);
				outputNumbersAndUrls.append(String.format("Calling... %s\n", number));
				
			}catch(NumberFormatException f) 
			{
				outputNumbersAndUrls.append("Invalid number!\n");
			}
			
		}
		return outputNumbersAndUrls.toString().trim();
	}

}
