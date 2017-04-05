package hackerRank.thirtyDay;

import java.util.Scanner;

public class Daay7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i < arr.length; i++){
            System.out.println(arr.length - i);    
            //System.out.print(arr[arr.length] + " ");
        }
        
        in.close();
    }

}
