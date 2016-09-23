package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyInteger_Test {

	@Test
	public void isEvenTest() {
		MyInteger x = new MyInteger(84);
		MyInteger y = new MyInteger(37);
		assertTrue(x.isEven());
		assertFalse(y.isEven());
	}
	
	@Test
	public void isOddTest() {
		MyInteger x = new MyInteger(53);
		MyInteger y = new MyInteger(98);
		assertTrue(x.isOdd());
		assertFalse(y.isOdd());
	}
	
	@Test
	public void isPrimeTest() {
		MyInteger x = new MyInteger(671);
		MyInteger y = new MyInteger(745);
		assertTrue(x.isPrime());
		assertFalse(y.isPrime());
	}
	
	@Test
	public void isEvenIntTest() {
		assertTrue(MyInteger.isEven(54));
		assertFalse(MyInteger.isEven(51));
	}
	
	@Test
	public void isOddIntTest() {
		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(24));
	}
	
	@Test
	public void isPrimeIntTest() {
		assertTrue(MyInteger.isPrime(413));
		assertFalse(MyInteger.isPrime(632));
	}
	
	@Test
	public void isEvenMyIntegerTest() {
		MyInteger x = new MyInteger(16);
		MyInteger y = new MyInteger(27);
		assertTrue(x.isEven());
		assertFalse(y.isEven());
	}
	
	@Test
	public void isOddMyIntegerTest() {
		MyInteger x = new MyInteger(67);
		MyInteger y = new MyInteger(100);
		assertTrue(x.isOdd());
		assertFalse(y.isOdd());
	}
	
	@Test
	public void isPrimeMyIntegerTest() {
		MyInteger x = new MyInteger(617);
		MyInteger y = new MyInteger(80);
		assertTrue(x.isPrime());
		assertFalse(y.isPrime());
	}
	
	@Test
	public void equalsIntTest() {
		MyInteger num = new MyInteger(75);
		assertTrue(num.equals(75));
		assertFalse(num.equals(46));
	}
	
	@Test
	public void equalsMyIntegerTest() {
		MyInteger num1 = new MyInteger(5);
		MyInteger num2 = new MyInteger(5);
		MyInteger num3 = new MyInteger(10);
		assertTrue(num1.equals(num2));
		assertFalse(num1.equals(num3));
	}
	
}