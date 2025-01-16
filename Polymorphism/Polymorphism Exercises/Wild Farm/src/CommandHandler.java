import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import animals.Animal;
import animals.Cat;
import animals.Mouse;
import animals.Tiger;
import animals.Zebra;
import foods.Food;
import foods.Meat;
import foods.Vegetable;

public class CommandHandler {
	
	private String[] inputAnimalArr;
	private String[] foodArr;
	private String end;
	public Scanner sc = new Scanner(System.in);
	
	public List<Animal> animalsList = new ArrayList<>();
	
	public CommandHandler() 
	{
		
		
	}
	
	public void input() 
	{
		String end = "";
		
		while(!end.equals("End")) 
		{
			inputAnimalArr = sc.nextLine().split(" ");
			foodArr = sc.nextLine().split(" ");
			engine(inputAnimalArr,foodArr);
			end = sc.nextLine();
			
		}
		for(var animal: animalsList) 
		{
			animal.makeSound();
			System.out.println(animal.toString());
			
		}
	
		
	}
	public void engine(String[]animal,String[]food) 
	{
		
		if(animal[0].equals("Mouse")) 
		{
			String animalType = animal[0];
			String animalName = animal[1];
			Double animalWeight = Double.parseDouble(animal[2]);
			String animalRegion = animal[3];
			
			String stoper = null;
			if(!food[0].equals("Vegetable")) 
			{
				System.out.printf("%s are not eating that type of food!\n",animal[0]);
				Animal a = new Mouse(animalName,animalType,animalWeight,0,animalRegion);
				animalsList.add(a);
			}
			else {
				
				Food f = new Vegetable(Integer.parseInt(food[1]));
				int quantityFood = f.getQuantity();
				Animal a = new Mouse(animalName,animalType,animalWeight,quantityFood,animalRegion);
				a.eat(f);
				animalsList.add(a);
			}
		}
		else if(animal[0].equals("Zebra")) 
		{
			String animalType = animal[0];
			String animalName = animal[1];
			Double animalWeight = Double.parseDouble(animal[2]);
			String animalRegion = animal[3];
			if(!food[0].equals("Vegetable")) 
			{
				System.out.printf("%s are not eating that type of food!\n",animalType);
				Animal a = new Zebra(animalName,animalType,animalWeight,0,animalRegion);
				animalsList.add(a);
			}
			else {
				
				Food f = new Vegetable(Integer.parseInt(food[1]));
				int q = f.getQuantity();
				Animal a = new Zebra(animalName,animalType,animalWeight,q,animalRegion);
				a.eat(f);
				animalsList.add(a);
				
			}
			
		}
		else if(animal[0].equals("Cat")) 
		{
			String animalType = animal[0];
			String animalName = animal[1];
			Double animalWeight = Double.parseDouble(animal[2]);
			String animalRegion = animal[3];
			String catBreed = animal[4];
			int fq =Integer.parseInt(food[1]);
			Cat c = new Cat(animalName,animalType,animalWeight,fq,animalRegion,catBreed);
			if(food[0].equals("Meat")) 
			{
				Food f = new Meat(Integer.parseInt(food[1]));
				c.eat(f);
				
			}
			else {
				
				Food f = new Vegetable(Integer.parseInt(food[1]));
				c.eat(f);
			}
			
			animalsList.add(c);
			
		}
		else if(animal[0].equals("Tiger")) 
		{
			String animalType = animal[0];
			String animalName = animal[1];
			Double animalWeight = Double.parseDouble(animal[2]);
			String animalRegion = animal[3];
			if(!food[0].equals("Meat")) 
			{
				System.out.printf("%s are not eating that type of food!\n",animalType);
				Animal a = new Tiger(animalName,animalType,animalWeight,0,animalRegion);
				
				animalsList.add(a);
			}
			else {
				Food f = new Meat(Integer.parseInt(food[1]));
				int q = f.getQuantity();
				Animal a = new Tiger(animalName,animalType,animalWeight,q,animalRegion);
				a.eat(f);
				animalsList.add(a);
			}
		}
	}
}
