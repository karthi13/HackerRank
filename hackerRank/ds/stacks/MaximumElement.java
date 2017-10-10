package hackerRank.ds.stacks;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt(); //Get in the number of 
		for(int i=0;i<testcase;i++){
			int option = sc.nextInt(); //Get a number to choose which operation to perform
			//option 1 is to store a number in the stack 
			if(option == 1){
				int numberToStore = sc.nextInt(); //store this number on top of the stack
				stack.push((Integer)numberToStore);
			}
			//option 2 isto remove a number in the stack
			else if(option == 2){
				stack.pop();
			}
			//option 3 is to display the maximum element in the stack 
			else if(option == 3){
				Iterator<Integer> it = stack.iterator();
				int max = 0;
				while(it.hasNext()){
					int temp = it.next();
					if(temp > max){
						max = temp;
					}
				}
				System.out.println(max);
			}
				
		}
		sc.close();
	}

}
