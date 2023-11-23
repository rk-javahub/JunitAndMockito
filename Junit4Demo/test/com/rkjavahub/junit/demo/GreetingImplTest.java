package com.rkjavahub.junit.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	private Greeting greeting;

	@Before
	public void setup() {
		System.out.println("Inside initial setup");
		greeting = new GreetingImpl();
	}

	@Test
	public void greetShouldReturnValidOutput() {
		System.out.println("Inside greetShouldReturnValidOutput testcase");
		String message = greeting.greet("Junit");

		// Checking for null
		assertNotNull(message);

		// Checking actual vs expected message are same or not
		assertEquals("Hello Junit", message);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowIllegalArgumentExceptionFor_NameIsNull() {
		System.out.println("Inside greetShouldThrowIllegalArgumentExceptionFor_NameIsNull testcase");
		Greeting greetingImplTest = new GreetingImpl();
		greetingImplTest.greet(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowIllegalArgumentExceptionFor_NameIsEmpty() {
		System.out.println("Inside greetShouldThrowIllegalArgumentExceptionFor_NameIsEmpty testcase");
		Greeting greetingImplTest = new GreetingImpl();
		greetingImplTest.greet("");
	}

	@After
	public void tearDownProcess() {
		System.out.println("Inside teardown method");
		greeting = null;
	}

}
