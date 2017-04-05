package hackerRank.algo.warmup;

import java.util.Scanner;

public class Cake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int n = 10;
        int height[] = {18,90,90,13,90,75,90,8,90,43};
        //int height[] = new int[n];
        /*for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }*/
        int max = height[0];
        int count = 0;
        for(int height_i=0; height_i < n; height_i++){
            //System.out.print(height[height_i] + " ");
            if(max == height[height_i]){
            	count++;
            }
            else if(height[height_i] > max ){
            	System.out.println(height_i);
            	max = height[height_i];
            	count = 1;
            	//count++;
            }
            else
            	continue;
        }
        System.out.println("Max = " + max + " Count = " + count);
        
        in.close();
	}

}
