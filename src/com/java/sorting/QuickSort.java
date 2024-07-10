package com.java.sorting;

public class QuickSort {

	public int[] performQuickSortASC(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            performQuickSortASC(array, left, partitionIndex - 1);
            performQuickSortASC(array, partitionIndex + 1, right);
        }
        return array;
    }


    public int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
