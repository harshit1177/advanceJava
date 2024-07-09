package com.java.searching;

public class BinarySearch {

	public int performBinarySearch(int[] arr, int key) {
		int low = 0; 
		int high = arr.length -1 ;
		int mid = (high+low)/2;
		
		while(high>=low) {
			
			  if(arr[mid] == key) {
				  return mid;
			  }
			  
			  else if(arr[mid]>key) {
				  high = mid-1;
			  }
			  
			  else {
				  low = mid +1;
			  }
			  
			  mid = (high+low)/2;
		}
		return -1;
	}
}
