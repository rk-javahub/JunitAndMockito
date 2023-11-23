package com.rkjavahub.junit.demo;

public class GreetingImpl implements Greeting {
	@Override
	public String greet(String name) {

		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("Illegal name");
		}

		return "Hello " + name;
	}
}
