package hackerRank.algo.implement;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        if(x2>x1 && v2>v1){
            System.out.println("NO");
        }
        else{
            int jump1 = (x1+v1);
            int jump2 = (x2+v2);
            for(int i=0;i<10000;i++){
                if(jump1 == jump2){
                    System.out.println("YES");
                    return;
                }
                jump1 += v1;
                jump2 += v2;
            }
            System.out.println("NO");
        }
	}

}
