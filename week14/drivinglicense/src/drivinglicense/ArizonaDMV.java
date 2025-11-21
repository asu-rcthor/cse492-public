package drivinglicense;

import java.time.LocalDate;
import java.time.Period;

public class ArizonaDMV {
	// In theory, there is only one Arizona Department of Motor Vehicles.
	// This could be a singleton, but for the sake of convenience, you don't have to instantiate the DMV.
	// You're welcome. Now happy testing :)
	
	private ArizonaDMV() {
		// SoonTM
	}
	
	/**
	 * Determines the eligible driving license type based on the input birthday.
	 * @param year  The year of the input birthday. Ex: for the birthday June 8, 2003, year = 2003.
	 * @param month The month of the input birthday. Ex: for the birthday June 8, 2003, month = 6.
	 * @param day   The day of the input birthday. Ex: for the birthday June 8, 2003, date = 8.
	 * @return A String which describes the most eligible license: "Class D driving license", 
	 * "Class G graduated driving license", "Learner's permit", or "Ineligible"
	 */
	public static String determineEligibleDrivingLicense(int year, int month, int day) {
		final LocalDate today = LocalDate.now();
		int currentYear = today.getYear();
		int currentMonth = today.getMonthValue();
		int currentDay = today.getDayOfMonth();
		int maxAge = today.getYear() - year;
		int age = 0;
		if (currentMonth < month) {
			// Before the month of birthday
			age = maxAge - 1;
		} else if (currentMonth == month) {
			if (currentDay < day) {
				// Same month, but before birthday
				age = maxAge - 1;
			} else {
				age = maxAge;
			}
		} else {
			age = maxAge;
		}
		if (age >= 21) {
			return "Class D driving license"; // Horizontal license
		} else if (age >= 16) {
			return "Class G graduated driving license"; // Vertical license
		} else if (age == 15) {
			int monthGap = ((currentMonth - month) % 12 + 12) % 12;
			if (monthGap > 6) {
				return "Learner's permit";
			} else if (monthGap == 6) {
				// 6 month absolute difference, not accounting for days
				if (currentDay >= day) {
					return "Learner's permit";
					// Anything past this point, currentDay < day.
				} else if (currentDay >= 28 && month == 8) {
					// Today is in February 28 or 29, and you are born August 29-31.
					int reqDay = (currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0)) ? 29 : 28;
					if (currentDay == reqDay) {
						return "Learner's permit";
					} else {
						return "Ineligible";
					}
				} else if (currentDay == 30 && (month == 10 || month == 12 || month == 3 || month == 5)) {
					// Today is April 30, and you are born October 31.
					// Today is June 30, and you are born December 31.
					// Today is September 30, and you are born March 31.
					// Today is November 30, and you are born May 31.
					return "Learner's permit";
				} else {
					return "Ineligible";
				}
			} else {
				return "Ineligible";
			}
		} else {
			return "Ineligible";
		}
	}
}
