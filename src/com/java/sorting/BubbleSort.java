package com.java.sorting;

public class BubbleSort {

	public int[] performBubbleSortAsc(int arr[]) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				// swap the nos
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

		return arr;
	}

	public int[] performBubbleSortDesc(int arr[]) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				// swap the nos
				if (arr[j] > arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

		return arr;
	}
}
