package com.java.searching;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearSearch linearSearch = new LinearSearch();
		BinarySearch binarySearch = new BinarySearch();
		
		int arr[] = {10,11,15,31,44,75,90,324};
		
		int key = 3240;
		
	//	int position = linearSearch.performLinearSearch(arr, key);
		int position = binarySearch.performBinarySearch(arr, key);
		
		if(position == -1) {
			System.out.println(" Element is not present ");
		}
		
		else
			System.out.println("element found at index "+position);
		
	}

}
