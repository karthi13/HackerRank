package spoj;

import java.util.Scanner;

public class ReverseAString {

	public static String FirstReverse(String str) { 
		  
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	       
	       char[] arr = str.toCharArray();
	       char[] reverse = new char[str.length()];
	       for(int i=arr.length-1;i>=0;i--){
	    	   reverse[str.length()-(i+1)] = arr[i];
	       }
	       String st = String.copyValueOf(reverse);
	       return st; 
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(FirstReverse(s.nextLine())); 
	  }   

}
