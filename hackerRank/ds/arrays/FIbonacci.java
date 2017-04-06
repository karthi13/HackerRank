package hackerRank.ds.arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class FIbonacci {

	public static BigInteger[] fibo(BigInteger t1,BigInteger t2,int n){
		BigInteger[] sum = new BigInteger[n];
		sum[0] = t1;
		sum[1] = t2;
		for(int i=2;i<n;i++){
			sum[i] = t1.add((t2.pow(2)));
			t1 = t2;
			t2 =  sum[ i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		Scanner scan = new Scanner(System.in);
		BigInteger t1 = scan.nextBigInteger();
		System.out.println("Enter a number : ");
		BigInteger t2 = scan.nextBigInteger();

		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		BigInteger[] fiboSeries = fibo(t1,t2,n);
		for(int i=0;i<n;i++)
			System.out.println(i +" = "+fiboSeries[i]);
		scan.close();
	}

}
