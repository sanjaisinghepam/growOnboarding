package examplesToRefer;

public class SingletonDesignPattern {
	//lazy initialization --only initialize when in use
	
	private static SingletonDesignPattern objofsingle;
	
	private SingletonDesignPattern() 
	{
		
	}

	public static SingletonDesignPattern getInstance() 
	{
		if(objofsingle == null) 
		{
			return objofsingle = new SingletonDesignPattern();
		}
		
		return objofsingle;
	}
	
	public void add(int i, int j) 
	{
		int k=i+j;
		System.out.println("singleton class method " + k);
	}
}
