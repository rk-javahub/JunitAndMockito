package com.rkjavahub.junit.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingImplTest {

	private Greeting greeting;

	@BeforeEach
	public void setup() {
		System.out.println("Inside initial setup");
		greeting = new GreetingImpl();
	}

	@Test
	public void greetShouldReturnValidOutput() {
		System.out.println("Inside greetShouldReturnValidOutput testcase");
		String message = greeting.greet("Junit");

		// Checking for null
		Assertions.assertNotNull(message);

		// Checking actual vs expected message are same or not
		Assertions.assertEquals("Hello Junit", message);
	}

	@Test()
	public void greetShouldThrowIllegalArgumentExceptionFor_NameIsNull() {
		System.out.println("Inside greetShouldThrowIllegalArgumentExceptionFor_NameIsNull testcase");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greeting.greet(null);
		});
	}

	@Test()
	public void greetShouldThrowIllegalArgumentExceptionFor_NameIsEmpty() {
		System.out.println("Inside greetShouldThrowIllegalArgumentExceptionFor_NameIsEmpty testcase");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greeting.greet("");
		});
	}

	@AfterEach
	public void tearDownProcess() {
		System.out.println("Inside teardown method");
		greeting = null;
	}

}
