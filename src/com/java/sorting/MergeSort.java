package com.java.sorting;

public class MergeSort {
	
	public int[] performMergeSortAsc(int arr[]) {
		
		if(arr.length == 0 || arr.length == 1) {
			return arr;
		}
		
		if(arr.length >1 ) {
			
			int mid = arr.length/2;
			
			//split the array into two halves 
		    int[] leftArray = new int[mid];
		    for(int i=0; i<mid;i++) {
		    	leftArray[i] = arr[i];
		    }
		    
		    //create the right Array
		    int[] rightArray = new int[arr.length - mid];
		    for(int i=mid; i<arr.length;i++) {
		    	rightArray[i-mid] = arr[i];
		    }
		    
		    performMergeSortAsc(leftArray);
		    performMergeSortAsc(rightArray);
		    
		    int i=0;
		    int j=0;
		    int k=0;
		    
		    //Merge left and right arrays
		    while(i<leftArray.length &&  j<rightArray.length) {
		    		if(leftArray[i]<rightArray[j]) {
		    			arr[k] = leftArray[i];
		    			i++;
		    		}
		    		
		    		else {
		    			arr[k]= rightArray[j];
		    			j++;
		    		}
		    		k++;
		    	}
		     while(i<leftArray.length) {
		    	 arr[k] = leftArray[i];
		    	 i++;
		    	 k++;
		     }
		     while(j<rightArray.length) {
		    	 arr[k] = rightArray[j];
		    	 j++;
		    	 k++;
		     }
		    	
		   }
		
		return arr;
	}
	
public int[] performMergeSortDesc(int arr[]) {
		
		if(arr.length == 0 || arr.length == 1) {
			return arr;
		}
		
		if(arr.length >1 ) {
			
			int mid = arr.length/2;
			
			//split the array into two halves 
		    int[] leftArray = new int[mid];
		    for(int i=0; i<mid;i++) {
		    	leftArray[i] = arr[i];
		    }
		    
		    //create the right Array
		    int[] rightArray = new int[arr.length - mid];
		    for(int i=mid; i<arr.length;i++) {
		    	rightArray[i-mid] = arr[i];
		    }
		    
		    performMergeSortDesc(leftArray);
		    performMergeSortDesc(rightArray);
		    
		    int i=0;
		    int j=0;
		    int k=0;
		    
		    //Merge left and right arrays
		    while(i<leftArray.length &&  j<rightArray.length) {
		    		if(leftArray[i]>rightArray[j]) {
		    			arr[k] = leftArray[i];
		    			i++;
		    		}
		    		
		    		else {
		    			arr[k]= rightArray[j];
		    			j++;
		    		}
		    		k++;
		    	}
		     while(i<leftArray.length) {
		    	 arr[k] = leftArray[i];
		    	 i++;
		    	 k++;
		     }
		     while(j<rightArray.length) {
		    	 arr[k] = rightArray[j];
		    	 j++;
		    	 k++;
		     }
		    	
		   }
		
		return arr;
	}

}
