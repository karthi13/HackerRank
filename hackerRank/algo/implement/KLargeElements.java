package hackerRank.algo.implement;

import java.util.Scanner;

public class KLargeElements {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of test cases : ");
		int test_case = sc.nextInt();
		for(int i=0 ; i<test_case ; i++){
			//System.out.println("Enter the number of element in the array :");
			int arr_size = sc.nextInt();
			//sc.nextLine();
			//System.out.println("Enter the k-largest numbers to be found in the array : ");
			int k_large = sc.nextInt();
			//sc.nextLine();
			int[] arr = {1, 23, 12, 9, 30, 2, 50};
			for(int j=0;j<arr.length;j++){
				for(int m=0;m<arr.length;m++){
					int temp = 0;
					if(arr[j] > arr[m] && (j!=m)){
						//System.out.println("j = " + j + " " + " m = " + m);
						temp = arr[j];
						arr[j] = arr[m];
						arr[m] = temp;
					}
				}
			}
			for(int i1=0;i1<k_large;i1++){
				System.out.println(arr[i1] + " ");
			}
		}
		sc.close();
	}
}
