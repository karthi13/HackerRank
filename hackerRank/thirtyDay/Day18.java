package hackerRank.thirtyDay;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Day18<T> {
	Stack<T> s = new Stack<T>();
	LinkedList<T> l = new LinkedList<T>();
	
	/*
	 * This method is used to push a char into the stack
	 */
	public void pushCharacter(T ch){
		s.push(ch);
	}
	
	public void enqueueCharacter(T ch){
		l.add(ch);
	}
	
	public char popCharacter(){
		return (char) s.pop();
	}
	
	public char dequeueCharacter() {
		return (char) l.removeFirst();
		
	}
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        scan.close();

	        // Convert input String to an array of characters:
	        char[] s = input.toCharArray();

	        // Create a Solution object:
	        Day18<Character> p = new Day18<Character>();

	        // Enqueue/Push all chars to their respective data structures:
	        for (char c : s) {
	            p.pushCharacter(c);
	            p.enqueueCharacter(c);
	        }

	        // Pop/Dequeue the chars at the head of both data structures and compare them:
	        boolean isPalindrome = true;
	        for (int i = 0; i < s.length/2; i++) {
	            if (p.popCharacter() != p.dequeueCharacter()) {
	                isPalindrome = false;                
	                break;
	            }
	        }

	        //Finally, print whether string s is palindrome or not.
	        System.out.println( "The word, " + input + ", is " 
	                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	    }

}
