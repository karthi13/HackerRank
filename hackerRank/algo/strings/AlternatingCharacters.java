package hackerRank.algo.strings;

import java.util.Scanner;

public class AlternatingCharacters {

    static int alternatingCharacters(String s){
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for(int i = 0;i<sb.length();i++){
        	if(i!=(sb.length()-1) && sb.charAt(i+1)==sb.charAt(i)){
        		count++;
        		//sb.deleteCharAt(i+1);
        	}
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        in.nextLine();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.nextLine();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
        in.close();
    }
}
