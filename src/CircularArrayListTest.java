import static org.junit.Assert.*;

import org.junit.*;
public class CircularArrayListTest {

	
	@Test
	public void test_baseCase() throws Exception {
		// You don't have to use array list 
		// This test will work with any object that implements List
		ArrayListADT<Integer> cal = new CircularArrayList<Integer> (10);
		cal.addFront(12);
		cal.addFront(8);
		cal.addRear(1);
		cal.addRear(2);
		cal.addFront(7);
		cal.remove();
		//5 10 1 4
		assertEquals(Integer.valueOf(12), cal.get(1));
		assertEquals(Integer.valueOf(8), cal.get(0));
		assertEquals(Integer.valueOf(1), cal.get(2));
		assertEquals(Integer.valueOf(2), cal.get(3));
	}
	
}
