package hackerRank.thirtyDay;

import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b =  bubbleSort(a);
        System.out.println("First element: "+b[0]);
        System.out.println("Last element: "+b[b.length-1]);
        in.close();
    }
    
    public static int[] bubbleSort(int[] a){
    	int length = a.length;
    	int numberOfSwaps = 0;
    	
    	for (int i = 0; i < length; i++) {
    	    // Track number of elements swapped during a single array traversal
    	    for (int j = 0; j < length - 1; j++) {
    	        // Swap adjacent elements if they are in decreasing order
    	        if (a[j] > a[j + 1]) {
    	        	int temp = a[j]; 
    	            a[j] =  a[j + 1];
    	        	a[j + 1] = temp;
    	            numberOfSwaps++;
    	        }
    	    }
    	}
    	System.out.println("Array is sorted in " + numberOfSwaps +  " swaps.");
		return a;
    }
}
