package hackerRank.algo.implement;

import java.util.Scanner;

public class BirthDayChocolate {
    static int solve(int n, int[] s, int d, int m){
        // Complete this function
    	int count=0;
    	for(int i=0;i<s.length;i++){
    		if(i<s.length-m +1|| s.length == 1){
    	    	int sum = 0;
    	    	int tmp = i;
    			for(int j=0;j<m;j++){
    				System.out.print(s[tmp]+"+");
    				sum += s[tmp++];
    			}
    			System.out.println("="+sum);
    			if(sum == d){
    				count++;
    			}
    		}
    	}
    	return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
        in.close();
        
    }
}
