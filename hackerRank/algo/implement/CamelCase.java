package hackerrank.algo.implementation;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c > 64 && c < 91){
            	count++;
            } 
        }
        System.out.println(count+1);
        in.close();
	}

}
