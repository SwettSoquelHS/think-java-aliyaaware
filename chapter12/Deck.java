public class Deck{
	private Card[] theDeck;

	public Deck(){
		theDeck = new Card[52];
		int[] suits = Card.CARD_SUITS;
		int curCard =0;
		for (int suit : Card.CARD_SUITS){
			for (int rank : Card.CARD_RANKS){
				theDeck[curCard] = new Card(rank, suit);
				curCard++;
			}
		}
	} 

	public void shuffle(){
		for (int i=0; i< theDeck.length; i++){
			Card current = theDeck[i];
			int swapPosition = (int)(52* Math.random());

			// I need to remember what was in swapPosition
			Card swapCard= theDeck[swapPosition];

			theDeck[swapPosition] = current;
			theDeck[i] = swapCard;
		}
	}
	public Card topCard(){
		return theDeck[0];
	}
}