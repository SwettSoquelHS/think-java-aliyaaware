public class CheckPokerHands {

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

        Card[] straight = hand.isStraight();
        for (Card x: straight){
         System.out.println("the card is "+ x.toString());
        }

        // if (straight == x)
        //     System.out.println("help " + x);
        
    }

    // which accepts an array of cards as its only parameter

public class CheckPokerHands {

    public static void main(String[] args){
        Card clubs8 = new Card(8, Card.CLUBS );
        System.out.println("the card in my hand is: " + clubs8);


        Card heartsQueen = new Card (12, Card.HEARTS);
        System.out.println("Second card in my hand is: " + heartsQueen);



     //and determines whether or 
    //   not the array of Cards represents a Royal Flush

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
        //  System.out.println("the card is "+ straight);
        // }


        
    }

    public static boolean isRoyalFlush(Card[] hand){
      
        if (isStraightFlush( hand ) && hand[0].CARD_RANKS.equals(14))
            return true;   
        return false;
    } 

    public static boolean isStraightFlush(Card[] hand){
        if ( hand.length != 5 )
            return(false);   // Make sure we have 5 cards....

        if(isStraight( hand ) && isFlush( hand ))
            return true;
        return false;
    }

    public static boolean isFlush(Card[] hand){

        if ( hand.length != 5 )
            return(false);   // Make sure we have 5 cards....

        sortBySuit(hand);      // Sort the cards by the suit values
        return( hand[0].CARD_SUITS == hand[4].CARD_SUITS);   
        //return false;
    }

    public static boolean isStraight(Card[] hand)
    {
        int i;
        int[] rank;

        if ( hand.length != 5 )
            return(false);

        sortByRank(hand);      
        //ace
        if ( hand[4].CARD_RANKS.equals(14))
        {
            boolean a = hand[0].CARD_RANKS.equals(2) && hand[1].CARD_RANKS.equals(3) &&
                        hand[2].CARD_RANKS.equals(4) && hand[3].CARD_RANKS.equals(5);
            boolean b = hand[0].CARD_RANKS.equals(10) && hand[1].CARD_RANKS.equals(11) &&        
                        hand[2].CARD_RANKS.equals(12) && hand[3].CARD_RANKS.equals(13);

            return ( a || b );
        }
        else
        {
            rank = hand[0].CARD_RANKS ; // add 1???????
            for ( i = 1; i < 5; i++ )
            {
                if ( hand[i].CARD_RANKS != rank )
                    return(false);        // Straight failed...

                //testRank++;   // Next card in hand
            }
            return true;   
        }
    }

    public static boolean isFullHouse(Card[] hand)
    {
       boolean a1, a2;

        if ( hand.length != 5 )
            return(false);

        sortByRank(hand);

        a1 = hand[0].CARD_RANKS == hand[1].CARD_RANKS &&  
            hand[1].CARD_RANKS == hand[2].CARD_RANKS &&
            hand[3].CARD_RANKS == hand[4].CARD_RANKS;

        a2 = hand[0].CARD_RANKS == hand[1].CARD_RANKS &&  
            hand[2].CARD_RANKS == hand[3].CARD_RANKS &&
            hand[3].CARD_RANKS == hand[4].CARD_RANKS;

        return( a1 || a2 );
    }
    


    public static void sortByRank( Card[] hand)
   {
      int minVal;
      for (int i = 0 ; i < hand.length ; i ++ )
      {
         minVal = i;   // Assume i (h[i]) is the minimum

         for (int j = i+1 ; j < hand.length ; j++ )
         {
            if ( j < minVal)
            {
               minVal = j;    // update minVal     
            }
         }
         // Swap a[i] and a[minVal]
         Card help = hand[i];
         hand[i] = hand[minVal];
         hand[minVal] = help;
      }
   }


    public static void sortBySuit( Card[] hand)
   {
      int minVal;
      for ( int i = 0 ; i < hand.length ; i ++ )
      {
         minVal = i;   // Assume elem i (h[i]) is the minimum
         for ( int j = i+1 ; j < hand.length ; j++ )
         {
            if ( j < minVal) 
            {
               minVal = j;    //update minVal with smaller suit  
            }
         }
       //swap crds
         Card help = hand[i];
         hand[i] = hand[minVal];
         hand[minVal] = help;
        }
    }

    private int rank;
    private int suit;

    public static Card highCard(Card[] hand)
    {
        return null;
    }
    public static Card highCard(Card card)
    {
        return null;
    }


    public String getRank() 
    {
        return "" +this.rank;
    }

    public void setRank(String rollNo) 
    {
        this.rank = rank;
    }

    public String getSuit() 
    {
        return this.suit + "yep";
    }

    public void setSuit(String name) 
    {
        this.suit = suit;
    }

    public String toString(){
        return ""+ this.suit + " and " + this.rank;
    }
}