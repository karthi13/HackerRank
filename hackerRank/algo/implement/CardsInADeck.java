package hackerRank.algo.implement;

public class CardsInADeck {

	public static void main(String[] args) {

		int testcase = 1;

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[][] deck = new String[4][13];

		int[] shuffle1 = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 52,
				51 };

		int[] shuffle2 = { 52, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51,
				1 };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				deck[i][j] = suits[i] + " of " + cards[j];
			}
		}

		int numberOfShuffle = 2;
		for (int i = 0; i < testcase; i++) {
			for (int j = 0; j < numberOfShuffle; j++) {
				if (j == 0) {
					for (int l = 0; l < 52; l++) {
						int RHSpos =(shuffle1[l] - 1); 
						if (l != RHSpos && RHSpos !=0 ) {
							System.out.println("l = " + (l) + " shufle = " + (shuffle1[l]-1));
							if (l >= 0 && l < 13) {
								String temp = deck[0][l%13];
								deck[0][l%13] = deck[RHSpos/13][RHSpos % 13];
								deck[RHSpos/13][RHSpos % 13] = temp;
							} else if (l >= 13 && l < 26) {
								String temp = deck[1][l%13];
								deck[1][l%13] = deck[RHSpos/13][RHSpos % 13];
								deck[RHSpos/13][RHSpos % 13] = temp;
							} else if (l >= 26 && l < 39) {
								String temp = deck[2][l%13];
								deck[2][l%13] = deck[RHSpos/13][RHSpos % 13];
								deck[RHSpos/13][RHSpos % 13] = temp;
							} else if (l >= 39 && l < 52) {
								String temp = deck[3][l%13];
								deck[3][l%13] = deck[RHSpos/13][RHSpos % 13];
								deck[RHSpos/13][RHSpos % 13] = temp;
							}

							int tmp = shuffle1[RHSpos];
							shuffle1[RHSpos] = shuffle1[l];
							shuffle1[l] = tmp;
						}
					}
				} else if (j == 1) {
					for (int l = 0; l < 52; l++) {
						int RHSpos =(shuffle2[l] - 1); 
						if (l != RHSpos && RHSpos !=0 ) {
							System.out.println("l = " + (l) + " shufle = " + (shuffle2[l]-1));
							if (l >= 0 && l < 13) {
								String temp = deck[0][l%13];
								deck[0][l%13] = deck[RHSpos/13][RHSpos % 13];
								deck[RHSpos/13][RHSpos % 13] = temp;
							} else if (l >= 13 && l < 26) {
								String temp = deck[1][l%13];
								deck[1][l%13] = deck[RHSpos/13][RHSpos % 13];
								deck[RHSpos/13][RHSpos % 13] = temp;
							} else if (l >= 26 && l < 39) {
								String temp = deck[2][l%13];
								deck[2][l%13] = deck[RHSpos/13][RHSpos % 13];
								deck[RHSpos/13][RHSpos % 13] = temp;
							} else if (l >= 39 && l < 52) {
								String temp = deck[3][l%13];
								deck[3][l%13] = deck[RHSpos/13][RHSpos % 13];
								deck[RHSpos/13][RHSpos % 13] = temp;
							}

							int tmp = shuffle2[RHSpos];
							shuffle2[RHSpos] = shuffle2[l];
							shuffle2[l] = tmp;
						}
					}
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				// deck[i][j] = cards[j]+ " of " + suits[i];
				System.out.println(deck[i][j]);
			}
		}
	}

}
