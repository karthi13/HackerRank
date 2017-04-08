package hackerRank.ds.arrays;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array "+ n +" numbers" );
        for(int i = 0;i<arr.length;i++){
        	arr[i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0;i<d;i++){
        	int  first= arr[0];
        	while( count < n-1){
        		arr[count] = arr[count+1];
        		count++;
        	}
        	arr[arr.length-1] = first;
        	count =0;
        }
        for(int i = 0;i<arr.length;i++){
        	System.out.println(arr[i]);
        }
        in.close();
    }
}
