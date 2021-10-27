package java8Features;

public interface Java8InterfaceDSmethod {
	
	int i=10;
	
	public abstract void add();
	
	default String worldname(String name) 
	{
		return name;
	}
	
	static int sub(int j) 
	{
		return j;
	}
	
}

class UsedInterface implements Java8InterfaceDSmethod
{

	@Override
	public void add() {
		
		System.out.println("add method implementation");
		
	}
	
	public String worldname(String name) 
	{
		System.out.println("override method");
		return name;
	}
}

