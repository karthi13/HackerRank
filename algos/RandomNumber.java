/* Program to generate n random numbers 
 * 
 * This was extracted from http://algs4.cs.princeton.edu 
 * Using it only for educational purpose
 * 
 * */
package algos;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class RandomNumber {

	private RandomNumber(){};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // command-line arguments
        int n = Integer.parseInt(args[0]);

        // for backward compatibility with Intro to Programming in Java version of RandomSeq
        if (args.length == 1) {
            // generate and print n numbers between 0.0 and 1.0
            for (int i = 0; i < n; i++) {
                double x = StdRandom.uniform();
                StdOut.printf("%.2f\n",x);
            }
        }

        else if (args.length == 3) {
            double lo = Double.parseDouble(args[1]);
            double hi = Double.parseDouble(args[2]);

            // generate and print n numbers between lo and hi
            for (int i = 0; i < n; i++) {
                double x = StdRandom.uniform(lo, hi);
                StdOut.printf("%.2f\n", x);
            }
        }

        else {
            throw new IllegalArgumentException("Invalid number of arguments");
        }

	}

}
