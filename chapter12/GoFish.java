public class GoFish{
	
	public static void main(String[] args){
		Card clubs8 = new Card(8, Card.CLUBS );

		System.out.println("the card in my hand is: " + clubs8);

		Card heartsQueen = new Card (12, Card.HEARTS);
		System.out.println("Second card in my hand is: " + heartsQueen);


		Deck theDeck = new Deck();
		System.out.println("the top card is " + theDeck.topCard());
		theDeck.shuffle();
		System.out.println("the top card is " + theDeck.topCard());



		Card[] aHand = theDeck.dealHand(5);
		for (Card c : aHand){
			System.out.println("the card is "+ c.toString());
		}

		CheckPokerHands hand = new CheckPokerHands();
		
		System.out.println("is it a flush? " + hand.getRank());

		// Card[] straight = hand.isStraight();
		// for (Card c: straight){
		// 	System.out.println("the card is "+ straight);
		// }


		
	}
}
