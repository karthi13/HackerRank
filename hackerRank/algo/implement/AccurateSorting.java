package hackerRank.algo.implement;

import java.util.Scanner;

public class AccurateSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            // Write Your Code Here
            int temp = 0;
            for(int a_i=0; a_i < n-1; a_i++){
               if(Math.abs(a[a_i] - a[a_i + 1]) == 1 && a[a_i] > a[a_i + 1]){
            	   temp = a[a_i];
            	   a[a_i] = a[a_i + 1];
            	   a[a_i + 1] = temp;
               }
               
            }
            int count = 0;
            for(int a_i=0; a_i < n-1; a_i++){
                System.out.print(a[a_i] + " ");
            	if(a[a_i] < a[a_i + 1]){
            		continue;
            	}
            	else{
            		count++;
            	}
            }
            if(count > 0)
            {
            	System.out.println("No");
            }
            else{
            	System.out.println("Yes");
            }
        }
        
        
        in.close();
    }
}
