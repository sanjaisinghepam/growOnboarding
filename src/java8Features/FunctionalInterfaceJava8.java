package java8Features;

public class FunctionalInterfaceJava8 {
	
	public static void main(String[] args) {
		
		Java8InterfaceF fi = () -> System.out.println("10 add method");
		
		fi.add();
	}

}

interface Java8InterfaceF {
	
	public abstract void add();

}
