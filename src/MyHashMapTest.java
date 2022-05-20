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
		
		//Write testcase for checking max score of 2 sections
	}
	
	/* Add more of your tests below */
	
}
