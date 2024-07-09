package com.java.sorting;

public class SelectionSort {

	public int[] peformSelectionSortAsc(int[] arr) {

		// we have to find the largest element
		int largestElementIndex ;
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			largestElementIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[largestElementIndex]) {
					largestElementIndex = j;
				}
			}

			temp = arr[largestElementIndex];
			arr[largestElementIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	public int[] peformSelectionSortDesc(int[] arr) {

		// we have to find the largest element
		int largestElementIndex ;
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			largestElementIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[largestElementIndex]) {
					largestElementIndex = j;
				}
			}

			temp = arr[largestElementIndex];
			arr[largestElementIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
