package hackerRank.algo.strings;

import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a = 0; a < q; a++){
            String s = in.next();
            // your code goes here
            String test = "hackerrank";
            int count = 0;
            for(int i=0;i<s.length();i++){
            	/*for(int j=0;j<s.length();j++){
            		if(test.charAt(i) == s.charAt(j)){
            			System.out.println(s.charAt(j));
            			count++;
            			break;
            		}
            	}*/
            	if(test.charAt(count) == s.charAt(i)){
            		if(count == 9){
            			System.out.println(s.charAt(i));
            			System.out.println("YES");
            			break;
            		}
            		System.out.println("count = " + count);
            		count++;
            	}
            	if(i == s.length()-1)
            		System.out.println("NO");
            }
            
        }
        in.close();
	}

}
