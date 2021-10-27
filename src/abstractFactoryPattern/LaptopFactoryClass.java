package abstractFactoryPattern;

public class LaptopFactoryClass implements AbstractFactoryInterface{

	private String ram;
	private int hdd;
	
	
	public LaptopFactoryClass(String ram, int hdd) {
		this.ram = ram;
		this.hdd = hdd;
	}
	
	
	
	@Override
	public Computer createComputer() {
		return new Laptop(ram,hdd);
	}

}
