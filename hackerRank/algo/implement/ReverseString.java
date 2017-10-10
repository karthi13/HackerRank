package hackerRank.algo.implement;

import java.util.ArrayList;

public class ReverseString {
	public static void main(String[] args) {
	    ArrayList<String> strings = new ArrayList<String>();
	    strings.add("Hello, World!");
	    strings.add("Welcome to CoderPad.");
	    strings.add("This pad is running Java 8.");

	    for (String string : strings) {
	      System.out.println(string);
	      char[] arr = string.toCharArray();
	      String reverse = "";
	      for(int i=0;i<arr.length;i++){
	    	  if(arr[i] == ' ' ){
	              char[] ch = reverse.toCharArray();
	              for(int j=(reverse.length()-1);j>=0;j--){
	                System.out.print(ch[j]);
	              }
	              System.out.print(arr[i]);
	              reverse = "";
	           }
	    	  else if (i==arr.length-1){
	    		  char[] ch = reverse.toCharArray();
	    		  System.out.print(arr[i]);
	              for(int j=(reverse.length()-1);j>=0;j--){
	                System.out.print(ch[j]);
	              }
	              
	              reverse = "";
	    	  }
	           else{
	              reverse =reverse + arr[i];
	           }
	      }
	      System.out.println();
 	    }
	    
	    
	  }
}
