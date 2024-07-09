package com.java.searching;

public class LinearSearch {

	public int performLinearSearch(int[] array, int key) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i]==key) {
				return i;
			}
		}
		
		return -1;
	}
}
