package hackerRank.algo.implement;

import java.util.Scanner;

public class DivisibleSumPairs {
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        // write your code here
	        int count = 0;
	        for(int a_i=0; a_i < n; a_i++){
	        	for(int a_j=0;a_j < n;a_j++){
	        		if(a_i < a_j){
	        			int sum = a[a_i]+a[a_j];
	        			if(sum == k || sum % k == 0){
	        				count++;
	        			}
	        		}
	        	}
	        }
	        System.out.println(count);
	    }
}
