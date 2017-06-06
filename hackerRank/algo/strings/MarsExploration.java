package hackerRank.algo.strings;

import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        for(int i=0;i<S.length();i=i+3){
        	for(int j=i;j<i+3;j++){
        		if(j%3 == 0 && S.charAt(j)=='S'
        	       ||j%3 == 1 && S.charAt(j)=='O'
        	       ||j%3 == 2 && S.charAt(j)=='S'){
        			continue;
        		}
        		else 
        			count++;
        	}
        }
        System.out.println("count : "+count);
        in.close();
    }
}
