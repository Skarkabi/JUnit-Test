package com.JUnit_Test;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class additionTest extends TestCase {
	
	@Test
	public void testAddOne() {	
		int x = 1;
		int answer = 2;
		additionClass addClass = new additionClass();
		
		assertEquals(x+1,addClass.addOne(x));
		
	
	}
		
	@Test
	public void testDoubleAddition() {	
		double x = 5.5;	
		double y = 4.5;		
		double answer = 10.0;
		additionClass addClass = new additionClass();
		
		assertEquals(x+y, addClass.addTwoNumbers(x, y));
			
	}
	@Test
	public void testAdditionClassComparison() {
		additionClass addClass = new additionClass();
		additionClass addClass2 = new additionClass();
		ArrayList<additionClass> addClassList = new ArrayList<additionClass>();
		addClassList.add(addClass);
		addClassList.add(addClass2);
		additionClass checkClass = new additionClass();
		
		//Create an assertSame test to check that the two items in the addClassList are indeed the objects that were added
		assertEquals(addClassList.get(0), addClass);
		assertEquals(addClassList.get(1), addClass2);
		
		//Create an assertEquals test to check that the length of the addClassList is 2
		assertEquals(2, addClassList.size());
		
	}
	
	
}
