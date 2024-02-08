package Assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	public MathUtils testobj;
	
	@BeforeEach
	public  void setup() {
		 testobj = new MathUtils();
		
	}
	
	@AfterEach
	public void afterEachTest() {
		testobj = null;
		System.out.println("Cleaing the obj after each test case");
	}
	
	
	@Test
	void MathUtilsTest() {
		
		
		
		
		assertEquals("THe sum check for single value", 3, testobj.add(2, 1));
		assertEquals("THe substract check for single value", 3, testobj.substract(4, 1));

		assertEquals("THe multiply check for single value", 3, testobj.multiply(3, 1));

		assertEquals(2.0f, testobj.divide(5, 2), 0.001);

		assertEquals(-1.0f , testobj.divide(5, 0),0.001);
	}

}
