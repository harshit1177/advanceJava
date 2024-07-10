package com.java.sorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int arr[] = {21,134,19,86,94,13,7};
		
		System.out.println("original array--> " + Arrays.toString(arr));
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println();
		System.out.println("Bubble Sort");
		System.out.println("sorted array ASC--> " +Arrays.toString(bubbleSort.performBubbleSortAsc(arr)));
	    System.out.println("sorted array DESC--> " +Arrays.toString(bubbleSort.performBubbleSortDesc(arr)));

	    SelectionSort selectionSort = new SelectionSort();
		System.out.println();
		System.out.println("Selection Sort");
		System.out.println("sorted array ASC--> " +Arrays.toString(selectionSort.peformSelectionSortAsc(arr)));
		System.out.println("sorted array DESC--> " +Arrays.toString(selectionSort.peformSelectionSortDesc(arr)));

		InsertionSort insertionSort = new InsertionSort();
		System.out.println();
		System.out.println("Insertion Sort");
		System.out.println("sorted array ASC--> " +Arrays.toString(insertionSort.peformInsertionSortAsc(arr)));
		System.out.println("sorted array DESC--> " +Arrays.toString(insertionSort.peformInsertionSortDesc(arr)));

		MergeSort mergeSort = new MergeSort();
		System.out.println();
		System.out.println("Merge Sort");
		System.out.println("sorted array ASC--> " +Arrays.toString(mergeSort.performMergeSortAsc(arr)));
		System.out.println("sorted array DESC--> " +Arrays.toString(mergeSort.performMergeSortDesc(arr)));

		QuickSort quickSort = new QuickSort();
		QuickSortDesc quickSortDesc = new QuickSortDesc();
		System.out.println();
		System.out.println("Quick Sort");
		System.out.println("sorted array ASC--> " +Arrays.toString(quickSort.performQuickSortASC(arr,0,arr.length-1)));
		System.out.println("sorted array DESC--> " +Arrays.toString(quickSortDesc.performQuickSortDesc(arr,0,arr.length-1)));

	}

}
