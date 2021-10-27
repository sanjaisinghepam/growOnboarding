package abstractFactoryPattern;

public class MainClassExecute {

	public static void main(String[] args) {
		
		Computer laptop = ComputerFactory.getComputer(new LaptopFactoryClass("500GB", 50));
		
		System.out.println(laptop);
		
	}
	
	
}
