package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */
	_01_LinearSearch linear = new _01_LinearSearch();
	
	String[] words = {"Bart", "Ally", "Dam", "Max"};
	String value = "Max";
	int index = 3;
	
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(index, linear.linearSearch(words, value));
    }
    
    _02_BinarySearch binary = new _02_BinarySearch();
    
    int[] ints

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(false, true);
    }
}
