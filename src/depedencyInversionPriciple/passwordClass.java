package depedencyInversionPriciple;

public class passwordClass {
	
	private ConnectionInterface connection;
	
	public passwordClass(ConnectionInterface connection) 
	{
		this.connection=connection;
	}
	
	public ConnectionInterface getConnection() 
	{
		return connection;
	}

}
