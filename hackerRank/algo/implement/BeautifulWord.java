package hackerRank.algo.implement;

import java.util.Scanner;

public class BeautifulWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		char[] arr = word.toCharArray();
		int count = 0;
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i] > 96 && arr[i] < 123){
				//System.out.println(arr[i]);
				if(arr[i] == arr[i+1]){
					System.out.println("No");
					return;
				}
				else if(arr[i] == 'a' || arr[i] ==  'e' || arr[i] == 'i' ||
						arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'y' ){
					if(arr[i+1] == 'a' || arr[i+1] ==  'e' || arr[i+1] == 'i' ||
					   arr[i+1] == 'o' || arr[i+1] == 'u' || arr[i+1] == 'y' ){
						System.out.println("No");
						return;
					}
					else{
						count++;
					}
				}
				else{
					
					count++;
				}
			}
			else{
				System.out.println("No");
				return;
			}		
		}
		//System.out.println(count);
		if(count == arr.length-1){
			System.out.println("Yes");
		}
		in.close();
	}

}
