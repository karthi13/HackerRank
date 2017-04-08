package hackerRank.algo.bitManipulation;

import java.util.Scanner;

public class LonelyInt {
	private static int lonelyInteger(int[] a) {
        //int[] temp = new int[a.length];
        if(a.length == 1)
             return a[0];
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i != j){
                    if(a[i] != a[j]){
                       count++;
                       if(count == (a.length-1)){
                            return a[i];
                        }
                        continue;
                    }
                    else{
                        break;
                    }
                }
                else
                     continue;
            }
            count = 0; 
        }
        return 0; 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
        in.close();
    }
}
