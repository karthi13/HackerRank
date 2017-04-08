package projectEuler;

public class Problem10 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		
		while((a+b+c) < 1000){
			int LHS = (int) Math.pow(a, 2) + (int) Math.pow(b, 2) ;
			int RHS = (int) Math.pow(c, 2);
			if(a<b && a<c && b<c && (LHS == RHS)){
				System.out.println("a = " + a + " b = " + b + " c = " + c);
				if((a+b+c) == 1000)
				{
					break;
				}
			}
			a++;
			b++;
			c++;
			System.out.println(a);
		}
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}

}
