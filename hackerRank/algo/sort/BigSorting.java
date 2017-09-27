package hackerRank.algo.sort;

import java.math.*;
import java.util.Scanner;

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        BigInteger[] bigInt = new BigInteger[n]; 
        // your code goes here
        for(int j = 0;j < n;j++){
            bigInt[j] = new BigInteger(unsorted[j]);
        }
        for(int i=0;i<n;i++){
            BigInteger big = null;
            for(int j=0;j<n;j++){
                if((i!=j) ){
                    if((bigInt[i].compareTo(bigInt[j]) ) == 0){
                        
                    }
                    else if((bigInt[i].compareTo(bigInt[j]) ) == 1){
                        big = bigInt[i];
                        bigInt[i] = bigInt[j];
                        bigInt[j] = big;    
                    }else{
                        continue;
                    }
                    
                }
            }
        }
        for(int j = n;j > 0;j--){
            System.out.println( bigInt[j-1] + " ");
        }
        
        in.close();
    }
}