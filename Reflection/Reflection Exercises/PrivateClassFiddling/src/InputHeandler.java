import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InputHeandler {
	
	private Scanner sc = new Scanner(System.in);
	private int numberForOperations = 0;
	private Class<?> classReflection;
	private Object objClassInstance;
	public InputHeandler() 
	{}
	
	public void start() throws Exception 
	{
		String subCommand = "";
		getReflectionIstance();
		
		
		while(!subCommand.equals("end")) 
		{
			String[] command = sc.nextLine().split("_");
			 subCommand = command[0].toLowerCase();
			 if(command.length==2) 
			 {
				 numberForOperations = Integer.parseInt(command[1]);
				 
			 }
			if(command[0].equals("add")) 
			{
			
				Method m = classReflection.getDeclaredMethod("add", int.class);
				m.setAccessible(true);
				m.invoke(objClassInstance,  numberForOperations );
				System.out.println("Успешно подадохте като параметър чрез рефкешън на 'add' method");
				System.out.println(getReflectionObjectFiledAndFiledValue());
			}
			else if(command[0].equals("subtract")) 
			{
				Method m = classReflection.getDeclaredMethod("subtract", int.class);
				m.setAccessible(true);
				m.invoke(objClassInstance, numberForOperations);
				System.out.println("Успешно подадохте параметър чрез рефлекшън на метода 'Subtract'");
				System.out.println(getReflectionObjectFiledAndFiledValue());
			}
			else if(command[0].equals("divide")) 
			{
				Method methodDivide = classReflection.getDeclaredMethod("divide", int.class);
				methodDivide.setAccessible(true);
				methodDivide.invoke(objClassInstance, numberForOperations);
				System.out.println("Успешно подадохте параметър на частният метод 'divide' чрез рефлекшън");
				System.out.println(getReflectionObjectFiledAndFiledValue());
			}
			else if(command[0].equals("rightShift")) 
			{
				
				Method methodShift = classReflection.getDeclaredMethod("rightShift",int.class);				
				methodShift.setAccessible(true);
				methodShift.invoke(objClassInstance, numberForOperations);
				System.out.println(getReflectionObjectFiledAndFiledValue());
			}
			else if(command[0].equals("leftShift")) 
			{
				Method methodLeftShift = classReflection.getDeclaredMethod("leftShift", int.class);
				methodLeftShift.setAccessible(true);
				methodLeftShift.invoke(objClassInstance, numberForOperations);
				System.out.println(getReflectionObjectFiledAndFiledValue());
				
				
				
			}
			
		}
		
	}
	private void getReflectionIstance() throws Exception 
	{
		classReflection = Class.forName("BlackBoxInt");
		Constructor<?> ctorArr = classReflection.getDeclaredConstructor();
		Constructor ctor = ctorArr;
		ctor.setAccessible(true);
		objClassInstance = ctor.newInstance();
		
	}
	
	private Object getReflectionObjectFiledAndFiledValue() throws Exception, Exception 
	{
		Field f = classReflection.getDeclaredField("innerValue");
		f.setAccessible(true);
		Object intValue = f.getInt(objClassInstance);
		return intValue;
	}
}
