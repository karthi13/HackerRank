package hackerRank.algo.implement;
//import java.io.*;
import java.util.*;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
    	int[] temp = ar;
        int count = 0;
        for(int i=0;i<n;i++){
        	if(ar[i] == 0){
        		System.out.println(" i = " + i);
        		continue;
        	}
            for(int j=0;j<n;j++){
				if ((i != j) && ar[i] == ar[j] && ar[i] != 0 ) {
					count++;
					System.out.println("i = " + i + " " + " j = " + j + " " + ar[i] + " " + ar[j]);
					ar[i] = 0;
					ar[j] = 0;

				}
            }
        }
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
