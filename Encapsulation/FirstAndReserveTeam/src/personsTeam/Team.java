package personsTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Team {
	
	private String name;
	private List<Person> firstTeam = new ArrayList<>();
	private List<Person> reserveTeam = new ArrayList<>();
	
	public Team(String name) 
	{
	   this.setName(name);
	}
	
	public void setName(String teamName) 
	{
		this.name = teamName;
	}
	public String getTeamName() 
	{
		return this.name;
	}
	
	public void addPlayer(Person person) 
	{
		if(person.getAge()>40) 
		{
			reserveTeam.add(person);
			return;
		}
		firstTeam.add(person);
	}
	public List<Person> getFirstTeam()
	{
		return Collections.unmodifiableList(firstTeam);
	} 
	
	public List<Person> getReserveTeam()
	{
		return Collections.unmodifiableList(reserveTeam);
	}
	
	public String getFirstTeamSize() 
	{
		return String.format("First team have %d players", firstTeam.size());
	}
	public String getReserveTeamSize() 
	{
		
		return String.format("Reserve team have %d players", reserveTeam.size());
	}


}
