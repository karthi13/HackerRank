package hackerRank.thirtyDay;

import java.util.*;

public class Day16 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String S = in.next();
        
        try{
        	Integer num = Integer.parseInt(S);
        	System.out.println(num);
        }
        catch(RuntimeException  e){
        	System.out.println("Bad String");
        }
        in.close();
	}

}
