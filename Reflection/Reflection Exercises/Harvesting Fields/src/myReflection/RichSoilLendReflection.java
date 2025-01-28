package myReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.stream.Stream;


public class RichSoilLendReflection {
	
	public RichSoilLendReflection() 
	{
		
	}
	
	public StringBuilder getInfo(String command) 
	{
		StringBuilder sb = new StringBuilder();
		Class<RichSoilLand> richSoilLend = RichSoilLand.class;
		
		Field[] f = richSoilLend.getDeclaredFields();
		
		if(command.equals("private")) 
		{						
			for(Field fi:f) 
			{
				int x = fi.getModifiers();
				if(Modifier.isPrivate(x)) 
				{
					sb.append(String.format("private %s %s \n",fi.getType().getSimpleName(),fi.getName()));
				}
			}
			
		}		
		if(command.equals("public")) 
		{
			for(Field fi:f) 
			{
				int x = fi.getModifiers();
				
				
				
				if(Modifier.isPublic(x)) 
				{
					sb.append(String.format("public %s %s", fi.getType().getSimpleName(),fi.getName()));
				}
			}
		}
		if(command.equals("protected")) 
		{
			for(Field fi:f) 
			{
				int x = fi.getModifiers();
				
				
				
				if(Modifier.isProtected(x)) 
				{
					sb.append(String.format("protected %s %s", fi.getType().getSimpleName(),fi.getName()));
				}
			}
		}
		if(command.equals("all")) 
		{
			String mod=null;
			for(Field fi:f) 
			{
				int x = fi.getModifiers();				
				if(Modifier.isPublic(x)) 
				{
					mod = "public";
				}
				else if(Modifier.isPrivate(x)) 
				{
					mod = "private";
				}
				else if(Modifier.isProtected(x)) 
				{
					mod = "protecetd";
				}
				
				sb.append(String.format("%s %s %s \n",mod,fi.getType().getSimpleName(),fi.getName()));
			}
		}
		return sb;
	}
}
