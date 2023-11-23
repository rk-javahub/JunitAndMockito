package com.rkjavahub.junit.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingImplTest {

	@Test
	public void greetShouldReturnValidOutput() {
		Greeting greetingImplTest = new GreetingImpl();
		String message = greetingImplTest.greet("Junit");

		// Checking for null
		assertNotNull(message);

		// Checking actual vs expected message are same or not
		assertEquals("Hello Junit", message);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowIllegalArgumentExceptionFor_NameIsNull() {
		Greeting greetingImplTest = new GreetingImpl();
		greetingImplTest.greet(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowIllegalArgumentExceptionFor_NameIsEmpty() {
		Greeting greetingImplTest = new GreetingImpl();
		greetingImplTest.greet("");
	}

}
