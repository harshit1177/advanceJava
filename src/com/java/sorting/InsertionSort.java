package com.java.sorting;

public class InsertionSort {

	public int[] peformInsertionSortAsc(int arr[]) {
		
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int element = arr[i];
			int j= i-1;
			
			while((j>-1)&&arr[j]>element) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]= element;
		}
		return arr;
	}
	
public int[] peformInsertionSortDesc(int arr[]) {
		
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int element = arr[i];
			int j= i-1;
			
			while((j>-1)&&arr[j]<element) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]= element;
		}
		return arr;
	}
	
}
