import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main 
{

	public static void main(String[] args) 
	{
		
		Reflection r = new Reflection();		
		checkFiledsModifires(r);
		

		checkGetMethodsModifires();
		checkSetMethodsModifires();
	}
	public static void checkFiledsModifires(Object c) 
	{
		Field[] reflClass = Reflection.class.getDeclaredFields();			
		for(Field f:reflClass) 
		{
			int y = f.getModifiers();		
			if(Modifier.isPublic(y)) 
			{
				System.out.printf("%s must be private!\n",f.getName());
			}			
		}						
	}
	public static void checkGetMethodsModifires() 
	{
		Class<Reflection> myReflClass = Reflection.class;
		Method[] someClassMethods = myReflClass.getDeclaredMethods();
		
		for(Method m: someClassMethods) 
		{
			if(m.getName().startsWith("get")) 
			{
				int access = m.getModifiers();
				if(Modifier.isPrivate(access) || Modifier.isProtected(access)) 
				{
					System.out.printf("%s have to be public!\n",m.getName());
				}
			}
		}
	}
	
	public static void checkSetMethodsModifires() 
	{
		Class<Reflection> myClass = Reflection.class;
		
		Method[] classM = myClass.getDeclaredMethods();
		
		for(Method m:classM) 
		{
			if(m.getName().startsWith("set")) 
			{
				int mod = m.getModifiers();
				if(Modifier.isPublic(mod)|| Modifier.isProtected(mod)) 
				{
					System.out.printf("%s have to be private!\n",m.getName());
				}
			}
			
		}
		
	}
}
