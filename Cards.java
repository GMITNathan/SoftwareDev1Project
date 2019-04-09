public class Cards {
    public static void main(String[] args) {
        String[] TYPES = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] NUMBERS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        //Create the deck
        int n = TYPES.length * NUMBERS.length;
        String[] deck = new String[n];
        for (int i = 0; i < NUMBERS.length; i++) {
            for (int j = 0; j < TYPES.length; j++) {
                deck[TYPES.length*i + j] = NUMBERS[i] + " of " + TYPES[j];
            	}
            }
        //Shuffle the deck
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        //Shuffled deck printed out
        for (int i = 0; i < n; i++) {
            System.out.println(deck[i]);
		}
	Index.main(null);
	}
}
