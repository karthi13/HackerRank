package hackerRank.algo.strings;

import java.util.HashSet;
import java.util.Scanner;


public class Pangram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(isPangram(str) == 27){
			System.out.println("Pangram");
		}
		else{
			System.out.println("Not Pangram");
		}
		sc.close();
	}
	
	public static int isPangram(String buf){
		
		 HashSet<Character> hash = new HashSet<>();
		 buf = buf.toUpperCase();
		 for (int i = 0; i < buf.length(); i++){
			 System.out.println("->" + buf.charAt(i));
			 hash.add(buf.charAt(i));
		 }
		 System.out.println("size = " + hash.toString());
		 return hash.size();
	}

}
