package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */
	
	String[] words = {"Bart", "Ally", "Dam", "Max"};
	String value1 = "Max";
	int index1 = 3;
	
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(index1, _01_LinearSearch.linearSearch(words, value1));
    }
    
    int[] ints = {1, 2, 3, 4, 5};
    int value2 = 3;
    int index2 = 2;
    

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(index2, _02_BinarySearch.binarySearch(ints, 1, 4, value2));
    }
}
