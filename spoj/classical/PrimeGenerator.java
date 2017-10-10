package spoj.classical;

import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for(int i=0;i<test_case;i++){
			int from = sc.nextInt();
			int to = sc.nextInt();
			primes(from,to);
		}
		sc.close();
	}
	
	public static void primes(int s1,int s2){
		 for(int i = s1; i <= s2; i++)
         {
			 int flag=0;
			 if(i==2)
				 System.out.println(i);
             for(int j = 2; j < (int) Math.sqrt(i); j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
	}

}
