package com.rkjavahub.junit.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingImplTest {

	@Test
	public void testGreet() {
		GreetingImpl greetingImplTest = new GreetingImpl();
		String message = greetingImplTest.greet();

		// Checking for null
		assertNotNull(message);

		// Checking actual vs expected message are same or not
		assertEquals("Hello Junit", message);
	}

}
