package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	Random rand = new Random();
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {    	
    	for(int i = 0; i < array.length;) {
    		for(int j = 0; j < array.length-1; j++) {
    			if(array[j] > array[j+1]) {
    				int random1 = rand.nextInt(array.length);
    				int random2 = rand.nextInt(array.length);
    				
    				int temp = array[random1];
    				array[random1] = array[random2];
    				array[random2] = temp;
    			}
    			display.updateDisplay();
    		}
    	}
    }
}
