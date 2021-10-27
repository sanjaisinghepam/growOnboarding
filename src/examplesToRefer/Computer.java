package examplesToRefer;

public abstract class Computer {

		public abstract String getRam();
		public abstract int getHdd();
		
		@Override
		public String toString() {
			return "Computer [getRam()=" + getRam() + ", getHdd()=" + getHdd() + "]";
		}
		
		
}


