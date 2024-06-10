package intro;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	public static void main(String[] args) {
		LocalDate currentdate =LocalDate.now();
		
		LocalDate birthdate = LocalDate.of(2006, 05, 29);
		
		Period p = Period.between(birthdate, currentdate);
		
		System.out.printf("your age is :- %d years ,%d months ,%d days",p.getYears(),p.getMonths(),p.getDays());
	}

}
