package com.sag.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.sag.junit5")
public class ExpectedExceptionTest 
{
	@Test
	void testExpectedException() {

		Assertions.assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("One");
		});

	}

	@Test
	void testExpectedExceptionWithSameType() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("One");
		});
	}
	
	/*@Test
	void testExpectedExceptionFail() {
	 
	  Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    Integer.parseInt("1");
	  });
	 
	}*/
}
