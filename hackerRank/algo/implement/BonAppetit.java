package hackerRank.algo.implement;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int k = in.nextInt();
	     	     int[] ar = new int[n];
	     for(int i=0;i<n;i++){
	    	 ar[i]=in.nextInt(); 
	     }
	     int b_char = in.nextInt();
	     int b_both =0;
	     for(int i=0;i<n;i++){
	    	 if(i != k){
	    		 b_both += ar[i];
	    	 }
	     }
	     int b_actual = b_both/2;
	     System.out.println("b_actual = "+b_both);
	     if(b_actual == b_char){
	    	 System.out.println("Bon Appetit");
	     }
	     else{
	    	 System.out.println(b_char - b_actual);
	     }
	    	 
	     in.close();
	}
	
	

}
