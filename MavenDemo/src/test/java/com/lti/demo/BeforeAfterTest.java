package com.lti.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {
	
	
	
	Calculator c=new Calculator();
	int sum;
	@BeforeAll
	public static void testDbConn() {
		System.out.println("db is up");
	}
	@BeforeEach
	public void testStartup() {
		sum=500;
		System.out.println("before each");
	}
	
	@Test
	public void testsayHello() {
		
		Assertions.assertEquals("Hello", c.sayHello());
		sum=sum+100;
		System.out.println(sum);
		System.out.println("testhello");
		
	}
	
	

	@Test
	void testAssertFalse() {
		Assertions.assertTrue(10<11);
		Assertions.assertFalse(10>11);
		Assertions.assertNotEquals("hello", "hii");
	}

	@Test
	void testAssertNull() {
		String s1=null;
		String s2="abcd";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);

	}
	
	@AfterAll
	public static void testDbClose() {
		System.out.println("close db connection ");
	}
	@AfterEach
	public void testCleanUp() {
		sum=0;
		System.out.println("clean up ");
	}

}