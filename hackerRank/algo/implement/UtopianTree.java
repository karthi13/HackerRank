package hackerRank.algo.implement;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Testcase : ");
		int testCase = sc.nextInt();
		sc.nextLine();
		int spring = 2;
		int summer = 1;
		for(int i=0;i<testCase;i++){
			int initialHeight = 1;
			//System.out.println("Enter the " + (i+1) + " Testcase:");
			int cycles = sc.nextInt();
			if(cycles == 0){
				System.out.println(initialHeight);
				continue;
			}
			for(double j=1;j<=cycles;j++){
				if(j%2 == 1){
					initialHeight = initialHeight * spring;
				}
				else{
					initialHeight = initialHeight * summer;
				}
				//System.out.println( j%1 + ",");
			}
			System.out.println(initialHeight);
		}
		
		sc.close();
	}
}
