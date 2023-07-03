package com.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void before() {

		System.out.println("before scenario");
	}
	
	@After
	public void after() {

		System.out.println("After scenario");
	}
	
}
