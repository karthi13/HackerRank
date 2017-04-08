import java.util.concurrent.ThreadLocalRandom;

class TestSolution {
	

	public static void main(String[] args) {
		int steps = ThreadLocalRandom.current().nextInt(10, 20 + 1);      //Number of trails Randomly generated between(10-20) 
		int currentState = ThreadLocalRandom.current().nextInt(0, 0 + 1); //Represent the initial state either 0 or 1
		int previousState = currentState ;                                
		System.out.println("steps = " + steps /*+ " previous state = " + previousState*/);
		
		//Probability Transistion matrix
		double[][] transition = new double[2][2];
		transition[0][0] = Math.round(Math.random()*100)/100D;
		transition[0][1] = 1.0 - transition[0][0];
		transition[1][1] = Math.round(Math.random()*100)/100D;
		transition[1][0] = 1.0 - transition[1][1];
		
		//double[][] transition = {{0.6,0.4},{0.2,0.8}};
		
		System.out.println("Transistion matrix");
		System.out.println(transition[0][0] + " " + transition[0][1]);
		System.out.println(transition[1][0] + " " + transition[1][1]);
		System.out.println("==========================");
		
		/*
		 * CONDITON
		 * Step 1 --> check the previous sample, if it is 0(bad) and the generated random number is equal or less than transistion[0][1], 
		 *            next sample of the chain is going to be 1(good); otherwise will be 0(bad).
		 * Step 2 --> check the previous sample, if it is 1(good) and the generated random number is equal or less than transistion[1][0], 
		 *            next sample of the chain is going to be 0(bad); otherwise will be 1(good). 
		 * */
		while(steps > 0)
		{
			double rand = Math.round(Math.random()*100)/100D; 
			//System.out.println("Random = "+rand);
			if(previousState == 0)
			{
				if(rand <= transition[0][1]){
					currentState = 1;
					System.out.print(currentState);
				}
				else{
					currentState = 0;
					System.out.print(currentState);					
				}
			}
			else if(previousState == 1){
				if(rand <= transition[1][0]){
					currentState = 0;
					System.out.print(currentState);
				}
				else{
					currentState = 1;
					System.out.print(currentState);					
				}
			}
			previousState = currentState;   
			steps--;
		}
	}

}
