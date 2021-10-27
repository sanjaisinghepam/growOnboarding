package depedencyInversionPriciple;

public class mainclass {

	public static void main(String[] args) {
		
		passwordClass pc = new passwordClass(new dbConnection());
		
		pc.getConnection().connect();

	}

}
