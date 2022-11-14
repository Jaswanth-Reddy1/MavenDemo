package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CalculatorTest {
 Calculator c=new Calculator();
 @Test
 public void testsayHello() {
  Assertions.assertEquals("Hello",c.sayHello());
  
 }
 @Test
 void testAssertFalse()
 {
	 Assertions.assertTrue("sai".length()==3);
	 
 }
 @Test
 void testAssertNull()
 {
	 String str1 = null;
	 String str2 = "abcd";
	 Assertions.assertNotNull(str2);
 } 
}