package hackerRank.algo.sort;

import java.util.Scanner;

public class InsertionSort {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
    	int temp = ar[ar.length-1];
        for(int i=ar.length-2;i>=0;i--){
        	if(ar[i] > temp){
        		ar[i+1] = ar[i];
        		//printArray(ar);
        		if(i==0){
        			ar[i] = temp;
        			printArray(ar);
        		}
        	}
        	else{
        		ar[i+1] = temp;
        		printArray(ar); 
        		break;
        	}
        	
        }
           
    }

    public static void insertionSort(int[] a){
    	
    	for(int i=1;i<a.length;i++){
    		int temp = a[i];
    		for(int j=i;j>=0;j--){
    			if(a[j] > temp){
    				a[j+1] = a[j];
    				if(j == 0){
    					a[j] = temp;
    				}
    			}
    			else{
    				a[j+1] = temp;
    				printArray(a);
    				break;
    			}
    		}
    		printArray(a);
    	}
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        //insertIntoSorted(ar);
        insertionSort(ar);
        in.close();
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
