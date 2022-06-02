package com.capgemini.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalTest {

	private static Cal c;

	@BeforeAll
	public static void setup() {
		System.out.println("Testing started.");
		c = new Cal();
	}

	@AfterAll
	public static void teardown() {
		System.out.println("Testing ended.");
		c = null;
	}
 
	@BeforeEach
	public void abc() {
		System.out.println("Run once before each test case.");
	}

	@AfterEach
	public void def() {
		System.out.println("Run once after each test case.");
	}

	@Test
	public void testAddNums() {
		int expected = 30;
		int actual = c.addNums(10, 20);
		assertEquals(expected, actual); // true
	}

	@Test
	public void testAddNums2() {

		int unexpected = 35;
		int actual = c.addNums(10, 20);
		assertNotEquals(unexpected, actual); // true
	}

	@Disabled
	@Test
	public void testAddNums3() {

		assertEquals(30, c.addNums(10, 20)); // true
	}
}