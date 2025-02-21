import java.util.HashMap;
import java.util.Map;

import singletonInterfaces.SingletonConatiner;

public class SingletonDataContainer implements SingletonConatiner {

	private static SingletonDataContainer instance;
	private Map<String,Integer> capitals;
	
	private SingletonDataContainer() 
	{
		this.capitals = new HashMap<>();
	}
	public static SingletonDataContainer getInstance() 
	{
		if(instance!=null) 
		{
			return instance;
		}
		instance = new SingletonDataContainer();
		return instance;
	}
	@Override
	public int getPopulation(Map<String, Integer> capitals, String name) {
		
		int result = 0;
		for(String cap:capitals.keySet()) 
		{
			if(cap.contains(name)) 
			{
				result = capitals.get(cap);
			}
			
		}
		return result;
	}

}
