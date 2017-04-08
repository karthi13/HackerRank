package hackerRank.thirtyDay;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = {{1,1,1,0,0,0},
        		       {0,1,0,0,0,0},
        		       {1,1,1,0,0,0},
        		       {0,0,2,4,4,0},
        		       {0,0,0,2,0,0},
        		       {0,0,1,2,4,0}
        		       };
        
            int current =0,previous =0;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
            	
            		current = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
            		arr[i+1][j+1]+
            		arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            		//current = top+ mid + bottom;
            		if(current > previous)
                       previous = current;
  
            	}
        }
        System.out.println(previous);
        
        in.close();
    }

}
