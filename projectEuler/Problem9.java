package projectEuler;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 2;
		long startTime = System.nanoTime();
		
		

		for(long l = 2000000;l > 2;l--){
			 if(Prime.isPrime(l)){
				 sum+=l;
				 System.out.println(l);
			 }
		}
		System.out.println(sum);
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println((duration/1000000)/1000);
	}

}
