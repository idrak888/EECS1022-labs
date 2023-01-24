package lab2;

/**
 * Objective: practice  If statements, nested If statements, Demorgan's Law, Data Comparison 
 *
 */
public class Lab2 {
	/**
	 * Takes an integer as the gender of a person, integer age, double weigh, 
	 * double height, and a boolean athlete 
	 * and calculates the needed daily calories for that person as a double.
	 */
	public static double getCalories(int gender,int age,double weight, double height, boolean athlete) 
	 {
		double calorieIntake = 0;
		
		if (age < 0 || weight < 0 || height < 0) {
			return -1;
		}
		
	    if (gender == 1) {
	    	calorieIntake = 10 * weight + 6.25 * height - 5 * age + 5;
	    	if (athlete) {
	    		calorieIntake *= 1.2;
	    	}
	    } else if (gender == 2) {
	    	calorieIntake = 10 * weight + 6.25 * height - 5 * age - 161;
	    	if (athlete) {
	    		calorieIntake *= 1.15;
	    	}
	    } else {
	    	return -1;
	    }
	    
	    return calorieIntake;
	 }

		
	/**
	 * Takes a salary as a double and calculates the tax owed for this salary
	 * returns a double value. 
	 * if the salary is an invalid amount it returns -1.
	 */
	public static double computeTax(double income) {
		double taxAmount = 0;
		double excess = 0;
		
		if (income > 0 && income <= 7150) {
	    	excess = income - 0;
	    	taxAmount += excess * 0.1;
	    } else if (income > 7150 && income <= 29050) {
	    	taxAmount += 715;
	    	excess = income - 7150;
	    	taxAmount += excess * 0.15;
	    } else if (income > 29050 && income <= 70350) {
	    	taxAmount += 4000;
	    	excess = income - 29050;
	    	taxAmount += excess * 0.25;
	    } else if (income > 70350) {
	    	taxAmount += 14325;
	    	excess = income - 70350;
	    	taxAmount += excess * 0.28;
	    } else {
	    	return -1;
	    }
	    
	    return taxAmount;
	}
	
	/**
	 * Takes a date as three integers:day, month, and year.
	 * The method returns a true if he date is valid and false otherwise.
	 * The method checks if the month is valid, and the year is after the year 1000.
	 * It checks if the day is valid according to the month. If the month is february, 
	 * it checks if the year is a leap year
	 */
	public static boolean validDate(int day, int month, int year) {
		boolean monthValid = false;
		boolean yearValid = false;
		boolean isLeapYear = false;
		int daysInMonth = 0;
		boolean dayValid = false;
		
		if (month >= 1 && month <= 12) {
			monthValid = true;
		}
		
		if (year >= 1000) {
			yearValid = true;
		}
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			isLeapYear = true;
		}
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			daysInMonth = 31;
		} else if (month == 2) {
			if (isLeapYear) {
				daysInMonth = 29;
			} else {
				daysInMonth = 28;
			}
		} else {
			daysInMonth = 30;
		}
		
		if (day >= 1 && day <= daysInMonth) {
			dayValid = true;
		}
		
		if (monthValid && yearValid && dayValid) {
			return true;
		}
		
		
		return false;
	}
}