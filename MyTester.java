package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {
	
		@Test
		public void testNFactorial1() {
			MyCalculator mc = new MyCalculator(); 
			
			int actual = mc.nfactorial(5);
			
			assertEquals("5! = 120", 120, actual, 0.0);
		}
		
		@Test
		public void testNFactorial2() {
			MyCalculator mc = new MyCalculator(); 
			
			int actual = mc.nfactorial(0);
			
			assertEquals("0! = 1", 1, actual, 0.0);
		}
		
		@Test
		public void testNFactorial3() {
			MyCalculator mc = new MyCalculator(); 
			
			int actual = mc.nfactorial(1);
			
			assertEquals("1! = 1", 1, actual, 0.0);
		}

		@Test
		public void testBinarySearch1() {
			MyCalculator mc = new MyCalculator(); 
			
			int arr[] = {1,2,3,4,5,6,7,8,9};
			
			int actual = mc.binarySearch(arr, 5);
			
			assertEquals(4, actual, 0.0);
		}
		
		@Test
		public void testBinarySearch2() {
			MyCalculator mc = new MyCalculator(); 
			
			int arr[] = {1,2,3,4,5,6,7,8,9};
			
			int actual = mc.binarySearch(arr, 2);
			
			assertEquals(1, actual, 0.0);
		}
		
		@Test
		public void testBinarySearch3() {
			MyCalculator mc = new MyCalculator(); 
			
			int arr[] = {1,2,3,4,5,6,7,8,9};
			
			int actual = mc.binarySearch(arr, 15);
			
			assertEquals(1, actual, 0.0);
		}

}

