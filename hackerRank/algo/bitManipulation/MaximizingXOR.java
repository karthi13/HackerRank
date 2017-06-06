package hackerRank.algo.bitManipulation;

import java.util.Scanner;

public class MaximizingXOR {
   
	static int maxXor(int l, int r) {
		//int a = l,b = r;
		int maxNum=0;
		for(int i=l;i<=r;i++){
			for(int j=l;j<=r;j++){
				int temp = i^j;
				if(temp > maxNum ){
					maxNum = temp;
				}
			}	
		}
		return maxNum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
