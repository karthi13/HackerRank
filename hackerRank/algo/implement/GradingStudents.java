package hackerRank.algo.implement;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            if(grade < 38){
            	System.out.println(grade);
            }
            else if(grade%5 > 2){
            	if(grade%5 == 3){
            		System.out.println(grade+2);
            	}
            	else if(grade%5 == 4){
            		System.out.println(grade+1);
            	}
            	//int roundVal = grade % 5;
            	
            }
            else
            	System.out.println(grade);
        }
        in.close();
}
}

