import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.*;

public class MyHashMapTest {
	
	private FileReader filereader;
	private DefaultMap<Integer, Student> testMap; // use this for basic tests

	@Before
	public void setUp() {
		filereader = new FileReader("src/input.txt");
	}


	@Test
	public void test_getMaxScoreinput() {
		// You don't have to use array list 
		// This test will work with any object that implements List
		filereader.createHeap();
		assertEquals(94.0, filereader.getMaxOfSection('A').marks, 0.05);
		assertEquals(88.0, filereader.getMaxOfSection('B').marks, 0.05);
		assertEquals(70.0, filereader.getMaxOfSection('C').marks, 0.05);
		assertEquals(null, filereader.getMaxOfSection('D'));
	}
	
	/* Add more of your tests below */
	
}