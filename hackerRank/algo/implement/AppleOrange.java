package hackerRank.algo.implement;

import java.util.Scanner;

public class AppleOrange {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int appleCount=0;
        for(int i=0;i<m;i++){
            int temp = a + apple[i];
            if(temp >= s && temp <= t){
                appleCount++;
            }
        }
        int orangeCount=0;
        for(int i =0;i<n;i++){
            int temp = b + orange[i];
            if(temp >= s && temp <= t){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
        in.close();
    }
	
}
