package projectEuler;

public class Prime {

	public static void main(String[] args) {
		int count = 0;
		long l = 2;
		while(count != 10001){
			if(isPrime(l)){
				count++;
				System.out.println(count + " " + l);
				
			}			
			l++;
		}
	}

	public static boolean isPrime(long number){
		boolean isPrime = true;
		 for (long i = (long) Math.sqrt((double)number); i > 1; i--) {
		     if (number % i == 0) {
		         isPrime = false;
		         break;
		     }
		 }
		 return isPrime;
	}
}
