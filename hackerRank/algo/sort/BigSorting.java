package hackerRank.algo.sort;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        BigInteger[] big = null;
        for(int i=0;i<n;i++){
        	big[i] = new BigInteger(unsorted[i]);
        }
        for(int i=0;i<n;i++){
        	for(int j=i;j<n;j++){
        		//if(big[j] < big[j+1]){
        		//	
        		//}
        		//System.out.println(big.toString());
        	}
        }
        for(int i=0;i<n;i++){
        	//System.out.println(unsorted[i]);
        }
        in.close();
    }

	private static BigInteger BigInteger(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
