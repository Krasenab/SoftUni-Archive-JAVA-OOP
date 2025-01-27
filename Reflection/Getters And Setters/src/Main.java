import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import reflection.ReflectionGetSet;

public class Main {

	public static void main(String[] args) {
		ReflectionGetSet rgs = new ReflectionGetSet();
		
		Method[] l = rgs.getClass().getDeclaredMethods();
		Arrays.sort(l,(l1,l2)->l1.getClass().getName().compareTo(l2.getName()));
		
		for(Method classMethod:l) 
		{
			System.out.println(classMethod.getName());
		}
		
		

	}

}
