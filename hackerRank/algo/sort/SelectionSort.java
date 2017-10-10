/*
 * Selection Sort is kind sorting to swap element in ascending order in an array.
 * 
 * It works in two sets of array, namely sorted part and unsorted part.
 * i.e On the first iteration first element is compared with the entire array, if any 
 * element less than this current element then it is swapped and this is called the sorted
 * part of the array. Similarly the iterations are performed to move the lowest element in
 * to the sorted part from the unsorted part.
 * 
 * This is one of the easiest sorting algorithm, but the algorithm will not perform better
 * or optimal if the array size is larger.
 * */
package hackerRank.algo.sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be stored in a array");
		int numberOfElements = sc.nextInt(); 
		int []array = new int[numberOfElements];
		
		/*User input all the elements inside the array*/
		for(int i=0;i<array.length;i++){
			array[i] = sc.nextInt();
		}
		
		/*Printing the array before selection sort*/
		System.out.println("Array to be sorted : ");
		for(int i=0;i<array.length;i++)
			System.out.print(array[i] + " ");
		System.out.println();
		
		/*Array is sent to selectionSort function to be sorted*/
		int[] SortedArray = selectionSort(array);
		
		/*Printing the array sorted according to selection sort*/
		System.out.println("Printing the sorted array : ");
		for(int i=0;i<array.length;i++)
			System.out.print(SortedArray[i] + " ");
		sc.close();
	}
	
	public static int[] selectionSort(int[] array){
		for(int i=0;i<array.length-1;i++){
			// Here we are assigning j = i+1 because we dont want to compare 
			// the least value that has already been compared.
			int min = i;
			for(int j=i+1;j<array.length;j++){
				
				if(array[j] < array[min]){
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return array;
	}

}
