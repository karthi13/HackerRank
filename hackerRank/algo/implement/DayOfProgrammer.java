package hackerRank.algo.implement;

import java.util.Scanner;

public class DayOfProgrammer {

	static int programmerDay = 256;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
        in.close();
	}
	
    static String solve(int year){	
        // Complete this function
    	int SumOfEightMonths = 243;
    	if(year > 1919){
	    	if(((year%4 == 0)&&(year%100 != 0)) || year%400 == 0){
	    		int exactDay = programmerDay -  (SumOfEightMonths+1);
	    		return exactDay+"."+"09"+"."+year;
	    	}
	    	else{
	    		int exactDay = programmerDay -  (SumOfEightMonths);
	    		return (exactDay+"."+"09"+"."+year);	
	    	}
    	}
    	else{
    		if(year == 1918){
    			int sum = 243-13;
    			int exactDay = programmerDay - sum;
    			return (exactDay+"."+"09"+"."+year);
    		}
    		else if(year%4 == 0){
    			int exactDay = programmerDay -  (SumOfEightMonths+1);
	    		return exactDay+"."+"09"+"."+year;
    		}
    		else{
	    		int exactDay = programmerDay -  (SumOfEightMonths);
	    		return (exactDay+"."+"09"+"."+year);
    		}
    	}
    	//return null;
    }

}
