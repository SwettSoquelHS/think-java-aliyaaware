public class Card{

	public static final int HEARTS   =1;
	public static final int CLUBS    =2;
	public static final int DIAMONDS =3;
	public static final int SPADES   =4;

	public static final int ACE     =1;
	public static final int JACK    =2;
	public static final int QUEEN   =3;
	public static final int KING    =4;


	private static final String[] SUITES = {null, "Hearts", "Clubs", "Diamonds", "Spades"};
// this initializes variables

	private static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	public static final int[] CARD_SUITES = {HEARTS, CLUBS, DIAMONDS, SPADES};
	public static final int[] CARD_RANKS = {2, 3, 4, 5, 6, 7, 8, 9 , 10, JACK, QUEEN, KING, ACE};

	public String toString(){
		return  SUITES[suite] + " of " + this.rank;
	}

	private int rank;
	private int suite;

	public Card (int rank, int suite){
		this.rank = rank;
		this.suite = suite;
	}

	public boolean equals(Card that){
		return this.rank == that.rank && this.suite == that.suite;
	}


}