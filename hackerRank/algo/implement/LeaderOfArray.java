package hackerRank.algo.implement;

public class LeaderOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {16,17,4,3,5,2};
		
		for(int i=0;i<arr.length;i++){
			int count = 0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					count++;
				}
			}
			if(count == ((arr.length-1)-i)){
				System.out.println("count = "+ count + " " +arr[i] + ",");
			}
		}

	}

}
