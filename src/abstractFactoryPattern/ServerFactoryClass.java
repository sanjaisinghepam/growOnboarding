package abstractFactoryPattern;

public class ServerFactoryClass implements AbstractFactoryInterface{
	
	private String ram;
	private int hdd;
	
	
	public ServerFactoryClass(String ram, int hdd) {
		this.ram = ram;
		this.hdd = hdd;
	}
	
	
	
	@Override
	public Computer createComputer() {
		return new Server(ram,hdd);
	}

}
