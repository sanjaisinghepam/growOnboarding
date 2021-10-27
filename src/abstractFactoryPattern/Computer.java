package abstractFactoryPattern;

public abstract class Computer {

		public abstract String getRam();
		public abstract int getHdd();
		
		@Override
		public String toString() {
			return "[RAM =" + this.getRam() + ", HDD=" + this.getHdd() + "]";
		}
		
		
}


