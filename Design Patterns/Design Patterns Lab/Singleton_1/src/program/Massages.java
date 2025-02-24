package main;

public class Massages implements IMassage{

	
	public Massages() 
	{
		
	}
	@Override
	public String addMasage(String typeMassage, String massage) {
		// TODO Auto-generated method stub
		return String.format("%s massage: %s", typeMassage,massage);
	}

}
