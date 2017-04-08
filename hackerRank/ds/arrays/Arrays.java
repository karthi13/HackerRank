package hackerRank.ds.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int temp[] = reverseArr(arr);
        for(int arr_i=0; arr_i < n; arr_i++){
            System.out.print(temp[arr_i]+" ");
        }
        in.close();
        
    }
    public static int[] reverseArr(int[] arr){
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[(arr.length-1)-i];
        }
        return temp;
    }
}
