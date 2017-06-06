package hackerRank.algo.implement;

import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),i;
        int[] c={0,0,0,0,0};
        int[] types = new int[n];
        for(i=0;i < n; i++){ 
            c[in.nextInt()-1]++;
        }
        int max=c[0],k=0;
        for(int j=1;j<5;j++){
            if(c[j]>max){
                k=j;
                max=c[j];}
        }

    System.out.println(k+1);
    }
}
