package day3;

public class factoryObject {
	public Sport getSport(String mysport)
	{
		if(mysport==null)
		{
			return null;
		}
		if(mysport.equalsIgnoreCase("Badminton"))
		{
			return new badminton();
		}
		else if(mysport.equalsIgnoreCase("Football"))
		{
			return new football();
		}
		return null;
	}
}
