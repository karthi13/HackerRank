/*
 * Bubble Sort is an ascending sort algorithm. That is, sorting happens
 * between two adjacent elements in an array for each iteration. Here, if
 * the first element is greater than the second element we can swap them.
 * 
 * Similarly for each iteration the swapping happens if adjacent elemnts are 
 * higher and lower respectively, until there can be no more elements need to
 * changed  
 * 
 * This is also simple algorithm but becomes cumbersome for larger arrays(i.e arrays
 *  with hundreds of elements)
 * */
package hackerRank.algo.sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int[] SortedArray = bubbleSort(array);
		
		/*Printing the array sorted according to selection sort*/
		System.out.println("Printing the sorted array : ");
		for(int i=0;i<array.length;i++)
			System.out.print(SortedArray[i] + " ");
		sc.close();

	}
	
	public static int[] bubbleSort(int[] array){
		
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}

}
