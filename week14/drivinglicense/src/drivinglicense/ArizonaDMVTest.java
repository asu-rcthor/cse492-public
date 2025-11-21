package drivinglicense;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ArizonaDMVTest {
	// Spoiler alert, since the methods depend on what day it is today, you will NOT be able to achieve full coverage.
	// Have fun anyways!
	
	@Test
	void testZero() {
		LocalDate birthday = LocalDate.now();
		String testResult = ArizonaDMV.determineEligibleDrivingLicense(
				birthday.getYear(),
				birthday.getMonthValue(),
				birthday.getDayOfMonth()
		);
		String expected = "Ineligible";
		assertEquals(expected, testResult, "A newborn with a license???");
	}
}
