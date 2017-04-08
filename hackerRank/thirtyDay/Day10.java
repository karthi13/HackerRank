package hackerRank.thirtyDay;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
    	System.out.println("Enter a number : ");
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 1 ;
        char[] arr; 
        String s = (Integer.toBinaryString(n));
        arr = s.toCharArray();
        System.out.println((Integer.toBinaryString(n)));
        
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i] == arr[i+1])
        	{
        		max += 1; 
        	}
        }
        System.out.println(max);
        in.close();
    }
}
