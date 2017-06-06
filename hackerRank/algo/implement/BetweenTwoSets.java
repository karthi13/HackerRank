package hackerRank.algo.implement;

import java.util.Scanner;

public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b){
        // Complete this function
        int x_a = a[a.length-1];
        int x_b = b[0];
        int sum = 0;
         
        for(int y=x_a;y<=x_b;y++){
        	int count = 0;
        	for(int i=0;i<a.length;i++){
        		if(y%a[i] == 0){
        			System.out.println("y = " + y + ",a[i] = " + a[i]);
        			count++;
        		}
        	}
        	for(int i=0;i<b.length;i++){
        		if(b[i]%y==0){
        			System.out.println("y = " + y + ",b[i] = " + b[i]);
        			count++;
        		}
        	}
        	if(count == (a.length+b.length)){
        		System.out.println(y);
        		sum += 1;
        	}	
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
