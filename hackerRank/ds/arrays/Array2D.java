package hackerRank.ds.arrays;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = {{-1, -1, 0, -9, -2, -2},
        			   {-2 ,-1, -6, -8, -2, -5},
        		       {-1, -1 ,-1 ,-2 ,-3, -4},
        		       {-1, -9, -2, -4, -4 ,-5},
        		       {-7, -3, -3 ,-2, -9, -9},
        		       {-1 ,-3, -1 ,-2, -4, -5}};//new int[6][6];
        int top = 0;
        int mid = 0;
        int bottom = 0;
        int cur = 0,previous = Integer.MIN_VALUE;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < (arr.length-1); j++){
                //arr[arr_i][arr_j] = in.nextInt();
            	if(j < (arr.length-2)&&i < (arr.length-2)){
            		top = arr[i][j]+arr[i][j+1]+arr[i][j+2];
            		mid = arr[i+1][j+1];
            		bottom = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            		//System.out.println(i + " " + j);
            	}
            	cur = top + mid + bottom;
            	if(cur > previous){
            		System.out.println(cur+" "+previous);
            		previous = cur; 
            		
            	}
            	//previous = cur;
            }
            System.out.println();
        }
        System.out.println(previous);
        in.close();
    }
}
