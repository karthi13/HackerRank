package hackerRank.algo.strings;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //number of characters in the string 
        String s = in.next(); //string to be encrypted
        int k = in.nextInt(); //number of rotations to be encrypted
        
/*       char[] stringArray = s.toCharArray();
        for(int i=0;i<s.length();i++)
        	System.out.println((int)stringArray[i]);*/
 
        int[] unencrypt = new int[s.length()]; 
        for(int i=0;i<s.length();i++){
            unencrypt[i] = s.charAt(i);
            if((s.charAt(i) >= 65 && s.charAt(i) <= 90) ||
               (s.charAt(i) >= 97 && s.charAt(i) <= 122)){
            	
            	if((s.charAt(i) >= 65 && s.charAt(i) <= 90)){
            		if((unencrypt[i] + k) > 90){
            			unencrypt[i] =64+(unencrypt[i]+k -90);
            			while(unencrypt[i] > 90){
            				unencrypt[i] =64+(unencrypt[i]-90);
            			}
            			//unencrypt[i] = 64 + (unencrypt[i]+k -90);
            		}
            		else
            			unencrypt[i] += k;
            	}
            	else{
            		if((unencrypt[i] + k) > 122){
            			unencrypt[i] = 96 + (unencrypt[i]+k - 122);
            			while(unencrypt[i] > 122){
            				unencrypt[i] =96+(unencrypt[i]-122);
            			}
            		}
            		else
            			unencrypt[i] += k;
            	}
            		
            }
        }
        for(int i=0;i<n;i++){
        	System.out.print((char)unencrypt[i]);
        }
        in.close();
    }
}