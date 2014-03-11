import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest{
	static Calculator cal = new Calculator();
	
	@Test
	public void addMethodWithNegPosNumber() {
		assertEquals(5, cal.add(-2, 7));
	} // end Method addMethodWithNegPosNumbers
	
	@Test
	public void Dividebyzero() {
		try {
			assertError(1, cal.divide(2, 0));
			fail("Should get error");
		} catch(Exception e) {
			assertTrue(true);
		}
	}
	
	private void assertError(int i, long add) {
		// TODO Auto-generated method stub
	}

	@Test
	public void subtractMethodWithNegPosNumber() {
		assertEquals(-25, cal.subtract(-10, 15));
	}
	
	@Test
	public void multiplyMethodWithNegPosNumber() {
		assertEquals(-24, cal.multiply(6, -4));
	}
	
	@Test
	public void divideMethodWithNegPosNumber() {
		assertEquals(5, cal.divide(-50, -10));
	}
}
