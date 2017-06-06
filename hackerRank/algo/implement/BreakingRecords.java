package hackerRank.algo.implement;

import java.util.Scanner;

public class BreakingRecords {
    static int[] getRecord(int[] s){
        // Complete this function
        int max = s[0];
        int low = s[0];
        int max_count = 0;
        int low_count = 0;
        int[] result = new int[2];
        for(Integer val : s ){
        	if(val > max){
        		max = val;
        		max_count++;
        	}
        	if(val < low){
        		low = val;
        		low_count++;
        	}
        }
        result[0] = max_count;
        result[1] = low_count;
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
