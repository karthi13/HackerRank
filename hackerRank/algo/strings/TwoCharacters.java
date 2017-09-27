package hackerRank.algo.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		ArrayList<Character> distinct = new ArrayList<Character>();
		for(int i=0;i<ch.length;i++){
			if(i == 0){
				distinct.add(ch[i]);
			}
			for(int j=0;j<ch.length;j++){
				if(ch[i] == ch[j] && (i!=j)){
					distinct.add(ch[i]);
				}
						
			}
		}
			
		sc.close();
	}

	
}
