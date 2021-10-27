package examplesToRefer;

public class FactoryPatternClass {
	
	public static Computer getComputer(String ram, int hdd, String type) 
	{
		if(type.equalsIgnoreCase("laptop")) 
		{
			return new Laptop(ram, hdd);
		}
		
		else if(type.equalsIgnoreCase("server")) 
		{
			return new Server(ram, hdd);
		}
		return null;
	}

}
