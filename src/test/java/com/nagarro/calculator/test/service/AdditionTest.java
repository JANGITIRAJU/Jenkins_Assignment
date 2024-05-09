package com.nagarro.calculator.test.service;
import static org.junit.Assert.assertEquals;
import org.junit.Test; 
import com.nagarro.calculator.service.addService;

public class AdditionTest {

	@Test
	public void testAdditionOfNumbers() {
		addService asr= new addService();
		int a=6;
		int b=6;
		int r= asr.add(a,b);
		assertEquals(12,r);
	}
	@Test
	public void testAddOfNumbers() {
		addService asr= new addService();
		int a=6;
		int b=6;
		int r= asr.add(a,b);
		assertEquals(12,r);
	}
	
}
