package hackerRank.algo.implement;

import java.util.Scanner;

public class MagicMatrix {
	
	static int[][] matrix = {
								{8, 1, 6}, {3, 5, 7}, {4, 9, 2},
								{6, 1, 8}, {7, 5, 3}, {2, 9, 4},
								{4, 9, 2}, {3, 5, 7}, {8, 1, 6},
								{2, 9, 4}, {7, 5, 3}, {6, 1, 8},
								{8, 3, 4}, {1, 5, 9}, {6, 7, 2},
								{4, 3, 8}, {9, 5, 1}, {2, 7, 6},
								{6, 7, 2}, {1, 5, 9}, {8, 3, 4},
								{2, 7, 6}, {9, 5, 1}, {4, 3, 8}
								
            				};
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        for(int i=0; i < 3; i++){
        	int count = 0;
            for(int j=0; j < 3; j++){
            	for(int i1 = 0;i1<matrix.length;i1++){
            		for(int j1=0;j1<matrix[i1].length;j1++){
            			if(s[i][j] == matrix[i1][j1]){
            				count++;
            			}
            		}
            		if(count == 2){
            			
            		}
            	}
            	
            	
            }
        }
        
        in.close();
	}

}
