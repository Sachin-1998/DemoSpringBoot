package PracticeStreamApi;

import java.time.LocalDate;
import java.time.Period;

public class CalulateAge {

	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(2000, 2, 19); // student's date of birth
		
        LocalDate today = LocalDate.now(); // today's date
        Period age = Period.between(dob, today); // calculate age
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        System.out.println("The student is " + years + " years, " + months + " months, and " + days + " days old.");

	}

}
