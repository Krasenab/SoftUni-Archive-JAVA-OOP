package simpleCalculator;

import java.util.HashMap;
import java.util.Map;

public class InputInterpreter {
  
	private CalculationEngine cEngine;
	private Map<String,Operations> operations;
	protected MultiplicationOperation m = new MultiplicationOperation();
	
	 public InputInterpreter(CalculationEngine e) 
	 {
		 this.cEngine = e;
		 this.operations = new HashMap<>();
		 this.operations.put("*", m);
	 }
	 public boolean interpret(String input) 
	 {
		 if (input.equals("End")) {
	            System.out.println("Result is: " + cEngine.getCurrentResult());
	            return false; // Сигнал да спрем програмата.
	        }

	        try {
	            double number = Double.parseDouble(input);
	            cEngine.setCurrentResut(number);
	        } catch (NumberFormatException e) {
	            if (input.equals("ms")) {
	              cEngine.addToCalculationMemory();
	            } else if (input.equals("mr")) {
	                cEngine.setCurrentResut(cEngine.ReturnFromMemory());
	            } else if (operations.containsKey(input)) {
	                // Операция (*, /, и т.н.)
	                Operations operation = operations.get(input);
	                double operand = cEngine.getCurrentResult(); 
	                cEngine.executeOperation(operation, operand);
	            } else {
	                throw new IllegalArgumentException("Unknown input: " + input);
	            }
	        }
	        
	        return true;
	 }
	 
	 
}
