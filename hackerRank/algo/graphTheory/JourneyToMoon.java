package hackerRank.algo.graphTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class JourneyToMoon {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int[] getPairs(){
		int[] pair = new int[2];
		System.out.println("Enter a pair  : ");
		for(int i=0;i<2;i++){
			pair[i] = sc.nextInt();
		}
		return pair;
	}
	

	public static void main(String[] args) {
		System.out.println("Enter two numbers with white between them : ");
		
		int N = sc.nextInt();
		int P = sc.nextInt();
		int[][] pairs = new int[P][2];
		//System.out.println("Now enter the pair of numbers");		
		for(int i=0;i<P;i++){
			pairs[i] =  getPairs();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0,(Integer) pairs[0][0]);
		list.add(1,(Integer) pairs[0][1]);
		for(int[] p : pairs){
			System.out.println("{" + p[0] + " " + p[1] + "}");
			if(list.get(0) == p[0] || list.get(0) == p[1]){
				
			}
			else{
				
			}
		}
		
		sc.close();
	}
}
