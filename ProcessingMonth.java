package year;

import java.util.Scanner;
/**
 * Operations with Month enum that are entered from the keyboard.
 *  
 * @author Ivan
 *
 */
public class ProcessingMonth {
	Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * @return month equalized with the console entered month
	 */
	public Month readMonth() {
		while (true) {
			if (sc.hasNextInt()) {
				int m = sc.nextInt();
				if (m > 12 || m < 1) {
					System.out.println("You entered the wrong month, try again.");
				}
				for (Month month : Month.values()) {
					if (m == month.ordinal() + 1) {
						return month;
					}
				}
			} else {
				String s = sc.nextLine().trim();
				for (Month month : Month.values()) {
					if (s.equalsIgnoreCase(month.name())) {
						return month;
					}
				}
				System.out.println("The word you entered is not \nthe name of the month, try again");
			}
		}
	}

	/**
	 * 
	 * @param month console entered month
	 */
	public void sameSeasonMonths(Month month) {
		Seasons season;
		if (month.ordinal() >= 8 && month.ordinal() <= 10) {
			season = Seasons.AUTUMN;			
		} else if (month.ordinal() >= 2 && month.ordinal() <= 4) {
			season = Seasons.SPRING;
		} else if (month.ordinal() >= 5 && month.ordinal() <= 7) {
			season = Seasons.SUMMER;
		} else {
			season = Seasons.WINTER;
		}
		switch (season) {
		case AUTUMN:
			for (Month months : Month.values()) {
				if (months.ordinal() == month.ordinal() || months.ordinal() < 8 || months.ordinal() > 10) {
				} else {
					System.out.println(months);
				}				
			}			
			break;
		case SPRING:
			for (Month months : Month.values()) {
				if (months.ordinal() == month.ordinal() || months.ordinal() < 2 || months.ordinal() > 4) {
				} else {
					System.out.println(months);
				}				
			}			
			break;
		case SUMMER:
			for (Month months : Month.values()) {
				if (months.ordinal() == month.ordinal() || months.ordinal() < 5 || months.ordinal() > 7) {
				} else {
					System.out.println(months);
				}				
			}			
			break;
		case WINTER:
			for (Month months : Month.values()) {
				if (months.ordinal() == month.ordinal() || months.ordinal() < 11 && months.ordinal() > 1) {
				} else {
					System.out.println(months);
				}				
			}			
			break;
		}
	}
	
	/**
	 * 
	 * @param month console entered month
	 * @param days number of days of the current month
	 */
	public void isEvenNumberOfDays(Month month, int days) {
		if (days % 2 == 0) {
			System.out.println(month.name() + " has an even number of days.");
		} else {
			System.out.println(month.name() + " has an odd number of days.");
		}		
	}
}