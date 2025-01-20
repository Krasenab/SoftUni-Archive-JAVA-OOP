package simpleCalculator;

import java.util.ArrayList;
import java.util.List;

public class CalculationEngine {

	
	double currentCalculation = -1;
	List<Double> calculatoinMemory = new ArrayList<>();
	
	public CalculationEngine() 
	{
		
	}
	
	public void executeOperation(Operations operaions,double operand) 
	{
		currentCalculation = operaions.applay(operand, operand);
			
	}
	
	public void addToCalculationMemory() 
	{
		calculatoinMemory.add(currentCalculation);
	}
	
	public double ReturnFromMemory() 
	{
		return  calculatoinMemory.remove(calculatoinMemory.size()-1);
	}
	
	public double getCurrentResult() 
	{
		return this.currentCalculation;
	}
	
	public void setCurrentResut(double value) 
	{
		this.currentCalculation = value;
	}
}
