package abstractFactoryPattern;

public class Laptop extends Computer{

	private String ram;
	private int hdd;
	
	
	public Laptop(String ram, int hdd) {
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public String getRam() {
		
		return this.ram;
	}

	@Override
	public int getHdd() {
		
		return this.hdd;
	}

}
