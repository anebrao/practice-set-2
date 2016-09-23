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
		assertTrue(1==1);
	}
	@Test
	public void testiEven() {
		MyInteger i = new MyInteger(4);
		assertTrue(i.isEven());
	}
	
	@Test
	public void testisOdd(){
		MyInteger i = new MyInteger(5);
		assertTrue(i.isOdd());
	}
	
	@Test
	public void testisPrime(){
		MyInteger i = new MyInteger(7);
		assertTrue(i.isPrime());
	}
	
	@Test
	public void testsisEven1(){
		assertTrue(MyInteger.isEven(4));
	}
	
	@Test
	public void testsisOdd1(){
		assertTrue(MyInteger.isOdd(3));
	}
	
	@Test
	public void testsisPrime1(){
		assertTrue(MyInteger.isPrime(7));
	}
	
	@Test
	public void testsisEven(){
		assertTrue(MyInteger.isEven(new MyInteger(4)));
	}
	
	@Test
	public void testsisOdd(){
		assertTrue(MyInteger.isOdd(new MyInteger(5)));
	}
	
	@Test
	public void testsisPrime(){
		assertTrue(MyInteger.isPrime(new MyInteger(7)));
	}
	
	@Test
	public void testequals1(){
		MyInteger a = new MyInteger(4);
		MyInteger b = new MyInteger(4);
		assertTrue(a.equals(b));
	}
	
	@Test
	public void testequals(){
		MyInteger a = new MyInteger(4);
		int b = 4;
		assertTrue(a.equals(b));
	}

}
