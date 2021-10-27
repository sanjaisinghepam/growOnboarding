package java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeMainClass {

	public static void main(String[] args) {
		
		// Local date is new class
		LocalDate ld  =LocalDate.now(); 
		System.out.println(ld);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		
	}

}
