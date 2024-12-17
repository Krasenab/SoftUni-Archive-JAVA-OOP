package smartphone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommandHeandler 
{
	
	public CommandHeandler() 
	{
		
	}
	
	public void start() 
	{
		System.out.println("Hello!!!!");
		
		Scanner sc = new Scanner(System.in);
		
		String[] numbersInput = sc.nextLine().split(" ");
		String[] urlsInput = sc.nextLine().split(" ");
		
		List<String> numbersInputList = Arrays.asList(numbersInput);
		List<String> urlsInputList = Arrays.asList(urlsInput);
		
		Smartphone sm = new Smartphone(numbersInputList,urlsInputList);
		
		System.out.println(sm.call());
	    System.out.println(sm.browse());
		//sm.browse();
		
		
		
	}
	
}
