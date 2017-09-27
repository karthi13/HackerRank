package hackerRank.algo.implement;

import java.util.Scanner;

public class TurnPages {
	

    static int solve(int n, int p){
        //int turn = 0;
    	int front = 0;
        int back  = 0;
        
        if(n%2 == 1){
        	//System.out.println("odd");
        	for(int i=1;i<=n;i=i+2){
            	if(p <= i){
            		 break;
            	}
            	++front;
            }
        	for(int i=n;i>0;i = i-2){
        		//System.out.println("back  = " + back);
            	if(p%2 == 1 && p == i){
            		//System.out.println("back if ");
            		break;
            	}
            	else if(p%2 == 0 && p == i-1 ){
            		//System.out.println("back else if ");
            		break;
            	}
            	++back;
            }
        	
        }
        else{
        	//System.out.println("Even");
        	for(int i=0;i<=n;i=i+2){
            	if(p <= (i+1)){
            		 break;
            	}
            	++front;
            }
        	for(int i=n;i>=0;i = i-2){
        		System.out.println("back  = " + back);
            	if(p%2 == 0 && p == (i+1)){
            		System.out.println("back if ");
            		break;
            	}
            	else if(p%2 == 0 && p == i)
            		break;
            	else if(p%2 == 1 && p == i+1 ){
            		System.out.println("back else if ");
            		break;
            	}
            	++back;
            }
        }

		System.out.println("front = " + front + " back = " + back);
        if(front < back)
        	return front;
        else 
        	return back;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int p = in.nextInt();
        int result = solve(6,3);
        System.out.println(result);
        in.close();
    }

}
