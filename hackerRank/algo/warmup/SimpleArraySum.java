package hackerRank.algo.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int arr[] = new int[n];
	    for(int arr_i=0; arr_i < n; arr_i++){
	        arr[arr_i] = in.nextInt();
	    }
	    System.out.println(sumArray(arr));    
	    in.close();
	}
	public static int sumArray(int[] arr){
		int sum = 0;
		for(int i =0;i<arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
}
