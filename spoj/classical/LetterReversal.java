package spoj.classical;

import java.util.Scanner;

public class LetterReversal {
	public static String LetterChanges(String str) { 
		  
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	       
	       char[] arr = str.toCharArray();
	       char[] reverse = new char[str.length()];
	
//	       for(int i=arr.length-1;i>=0;i--){
//	    	   reverse[str.length()-(i+1)] = arr[i];
//	       }
	       for(int i=0;i<arr.length;i++){
	    	   if(arr[i] >= 97 && arr[i] <= 122){
	    		   if(arr[i]==122){
	    			   reverse[i] = (char) (arr[i]-25);
	    			   System.out.println("adding z char = " + reverse[i]);
	    		   }
	    		   reverse[i] = (char) (arr[i] + 1);
    			   System.out.println("adding normal char = " + reverse[i]);
	    		   
	    		   if(reverse[i] == 97 ||  reverse[i] == 105 || reverse[i] == 111 || reverse[i] ==117 || reverse[i] ==101){
	    			   reverse[i] = (char) ((reverse[i] - 32)) ;
	    			   System.out.println("adding vowel char = " + reverse[i]);
	    		   }
	    	   }
	    	   else{
	    		   reverse[i] = arr[i];
	    	   }
	       }
	       String st = String.copyValueOf(reverse);
	       System.out.println("st = " + st);
	       return st; 
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(LetterChanges(s.nextLine())); 
	    s.close();
	  }   
}
