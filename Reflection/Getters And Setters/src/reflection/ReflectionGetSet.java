package reflection;

public class ReflectionGetSet implements Serializable  {

	protected String name;
	protected String webAddress;
	protected String emailAddress;
	protected String zip;
	
	public ReflectionGetSet() 
	{
		
	}
	
	public ReflectionGetSet(String name,String webAddress,String emailAddres,String zip) 
	{
		this.setName(name);
		this.setEmailAddress(emailAddress);
		this.setWebAddress(webAddress);
		this.setZIP(zip);
	}
	
	@Override
	public String getName() {
			return this.name;
	}

	@Override
	public void setName(String name) {
		if(name.isBlank()) 
		{
			throw new IllegalArgumentException("Name is null");
		}
		this.name = name;		
	}

	@Override
	public void setWebAddress(String webAddress) {
		
		if(webAddress.isBlank()) 
		{
			throw new IllegalArgumentException("Web address is null");
		}
		
		this.webAddress = webAddress;
	}

	@Override
	public String getWebAddress() {
		
		return this.webAddress;
	}

	@Override
	public void setEmailAddress(String email) {
		if(email.isBlank()) 
		{
			throw new IllegalArgumentException("Email is null");
		}
		
		this.emailAddress = email;
		
	}

	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return this.emailAddress;
	}

	@Override
	public void setZIP(String zip) {
		if(zip.isBlank()) 
		{
			throw new IllegalArgumentException("ZIP file is empty");
		}
		this.zip = zip;
	}

	@Override
	public String getZIP() {
		
		return this.zip;
	}

}
