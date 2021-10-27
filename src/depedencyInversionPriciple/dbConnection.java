package depedencyInversionPriciple;

public class dbConnection implements ConnectionInterface{

	@Override
	public void connect() {
		
		System.out.println("db connection");
		
	}

}
