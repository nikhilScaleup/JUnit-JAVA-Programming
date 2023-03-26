package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	 @Test
	    public void testPositiveDivision() {
	        JunitTesting jt = new JunitTesting();
	        double result = jt.divide(10, 2);
	        assertEquals(5.0, result, 0.0001);
	    }
	    

	    @Test
	    public void testNegativeDivision() {
	        JunitTesting jt = new JunitTesting();
	        double result = jt.divide(-10, 2);
	        assertEquals(-5.0, result, 0.0001);
	    }
	    
	    @Test
	    public void testLargeNumbers() {
	        JunitTesting jt = new JunitTesting();
	        double result = jt.divide(Integer.MAX_VALUE, 2);
	        assertEquals(1073741823.5, result, 0.0001);
	    }

}
