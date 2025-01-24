import reflections.ReflectionOverview;

public class Main {

	public static void main(String[] args) throws InstantiationException, ReflectiveOperationException 
	{
		Class myReflClass = ReflectionOverview.class;
		System.out.println("This class name is: "+ myReflClass);
		System.out.println("This class perent class name is: " + myReflClass.getSuperclass());
		for(Class reflclass : myReflClass.getInterfaces()) 
		{
			System.out.println("This class use interface with name: " + reflclass);
		}
		//ReflectionOverview ref = (ReflectionOverview) myReflClass.newInstance();
	    
	}

}
