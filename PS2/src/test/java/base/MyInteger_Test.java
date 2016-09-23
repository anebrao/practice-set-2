package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1 == 1);
	}
	@Test
	public void testiEven() {
		MyInteger a = new MyInteger(4);
		MyInteger b = new MyInteger(5);
		MyInteger c = new MyInteger(19);
		assertTrue(a.isEven());		
		assertFalse(b.isEven());
		assertFalse(c.isEven());
	}
	
	@Test
	public void testisOdd(){
		MyInteger i = new MyInteger(5);
		MyInteger b = new MyInteger(8);
		assertTrue(i.isOdd());
		assertFalse(b.isOdd());
		
	}
	
	@Test
	public void testisPrime(){
		MyInteger i = new MyInteger(7);
		MyInteger b = new MyInteger(8);
		assertTrue(i.isPrime());
		assertFalse(b.isPrime());
	}
	
	@Test
	public void testsisEven1(){
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(3));
	}
	
	@Test
	public void testsisOdd1(){
		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(8));
	}
	
	@Test
	public void testsisPrime1(){
		assertTrue(MyInteger.isPrime(7));
		assertFalse(MyInteger.isPrime(6));
	}
	
	@Test
	public void testsisEven(){
		assertTrue(MyInteger.isEven(new MyInteger(4)));
		assertFalse(MyInteger.isEven(new MyInteger(9)));
	}
	
	@Test
	public void testsisOdd(){
		assertTrue(MyInteger.isOdd(new MyInteger(5)));
		assertFalse(MyInteger.isOdd(new MyInteger(8)));
	}
	
	@Test
	public void testsisPrime(){
		assertTrue(MyInteger.isPrime(new MyInteger(7)));
		assertFalse(MyInteger.isPrime(new MyInteger(8)));
	}
	
	@Test
	public void testequals1(){
		MyInteger a = new MyInteger(4);
		MyInteger b = new MyInteger(4);
		MyInteger c = new MyInteger(5);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}
	
	@Test
	public void testequals(){
		MyInteger a = new MyInteger(4);
		MyInteger b = new MyInteger(7);
		int c = 4;
		assertTrue(a.equals(c));
		assertFalse(b.equals(c));
	}

}
