package examplesToRefer;

public class Exampal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("hello world and new to it"); 
		  System.out.println("----------------");
		  OverloadingExample obj1 = new OverloadingExample(); 
		  obj1.add(56);
		  System.out.println("----------------"); 
		  Overridding obj2 = new Overridding();
		  obj2.add(78); 
		  System.out.println(obj2.add(2,9)); 
		  obj2.sub();
		  System.out.println("----------------");
		  OverloadingExample obj3 = new Overridding();
		  obj3.add(54); 
		  System.out.println(obj3.add(5,1));
		  
		  
		  FactoryPatternClass.getComputer("500GB", 56, "laptop");
		
	}

}

class OverloadingExample
{
	
	public void add(int i) 
	{
		System.out.println("display "+ i);
	}
	
	 protected int add(int i, int j) 
	{
		return i+j;
	}

}

class Overridding extends OverloadingExample
{
	public void add(int i) 
	{
		System.out.println("override method" + i);
	}
	
	void sub() 
	{
		System.out.println("subtracted in child class");
	}
	
}