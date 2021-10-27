package abstractFactoryPattern;

//Now we will create a consumer class that will provide the entry point for the client classes to create sub-classes.

public class ComputerFactory {
	
	public static Computer getComputer(AbstractFactoryInterface factory) 
	{
		return factory.createComputer();
	}
}
