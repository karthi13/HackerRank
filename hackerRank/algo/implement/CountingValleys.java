package hackerRank.algo.implement;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int steps = sc.nextInt();
      sc.nextLine();
      String str = sc.nextLine();
      //System.out.println("Print");
      int valley = getValleys(str);
      System.out.println(valley);
      sc.close();
    	
    }
    
    public static int getValleys(String str){
    	char[] arr = str.toCharArray();
    	int seaLevel = 0;
    	int valleys = 0;
    	boolean inValley = false;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i] == 'U'){
    			seaLevel++;
    		}
    		else{
    			seaLevel--;
    		}
    		
    		if(!inValley && seaLevel < 0){
    			valleys++;
    			inValley = true;
    		}
    		if(seaLevel >= 0){
    			inValley = false;
    		}
       	}
    	return valleys;
    }
}
