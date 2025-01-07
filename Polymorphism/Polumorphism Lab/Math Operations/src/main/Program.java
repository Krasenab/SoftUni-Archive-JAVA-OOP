package main;

import mathOperations.MathOperation;

public class Program {
	public static void main(String[] args) 
	{
		MathOperation m = new MathOperation();
		
		System.out.println(m.add(1, 1));
		System.out.println(m.add(1, 1,1));
		System.out.println(m.add(1, 1,1,1));
		
	}
}
