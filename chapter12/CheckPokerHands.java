import java.util.Arrays;
import java.util.ArrayList;

class CheckPokerHands {

    public static void main(String[] args){

        Card[] cards = {new Card (12, Card.HEARTS), new Card (12, Card.HEARTS), new Card (12, Card.HEARTS), new Card (12, Card.HEARTS), new Card (12, Card.HEARTS)};
        Card[] hi = {new Card (1, Card.CLUBS), new Card (1, Card.DIAMONDS), new Card (3, Card.CLUBS), new Card (3, Card.DIAMONDS), new Card (3, Card.HEARTS)};


        System.out.println("is it a flush? " + isFlush(cards));
        System.out.println("is it a royalflush? " + isRoyalFlush(cards));
        System.out.println("is it a isStraight? " + isStraight(hi));
        System.out.println("is it a isStraightFlush? " + isStraightFlush(cards));
        System.out.println("is it a isFullHouse? " + isFullHouse(cards));
        System.out.println("is it a highCard? " + highCard(cards));
    } 

    public static boolean isStraightFlush(Card[] hand){

        return isStraight( hand ) && isFlush( hand );
         
    }

    public static boolean isFlush(Card[] hand){
        if ( hand.length != 5 )
            return false;   // Make sure we have 5 cards....

        int suit = hand[0].getSuit();
        for (Card card : hand){
          if(card.getSuit() != suit){
            return false;
          }
        }
        return true;
    }

    public static boolean isStraight(Card[] hand)
    {
      int[] special = {1,10,11,12,13};
      int[] ranks= new int[5];
      for (Card card : hand){
       ranks= card.CARD_RANKS;
     }
      Arrays.sort(ranks);
      if(ranks.equals(special)){
        return true;
      }
      for (int i =0; i< ranks.length; i++){
        if (ranks[i] == ranks[i+1]-1)
          return true;
      }
      return false;
      // int firstRank = ranks[0];
      // for(int index =1; index< ranks.length; index++){
      //     if (ranks[index] != firstRank+index){
      //       return false;
      //     }
      // }
      // return true;
    }

    public static boolean isRoyal(Card[] hand){
      int[] ranks= new int[5];
      for (Card c : hand){
        ranks=c.CARD_RANKS;
      }

      int[] special = {1,10,11,12,13};
      Arrays.sort(ranks);
      if(ranks.equals(special)){
        return true;
      }
      return false;
    }

    public static boolean isRoyalFlush(Card[] hand){
      return true;
      //return isRoyal(hand) && isFlush(hand);
    }

    public static boolean isFullHouse(Card[] hand)
    {
      int[] ranks = new int[5];
      for (Card card : hand){
        ranks = card.CARD_RANKS;
     }
    
      Arrays.sort(ranks);
      if(ranks[0] == ranks[1] && ranks[0] == ranks[2])
      {
        return ranks[3] == ranks[4];
      }else if (ranks[2]== ranks[3] && ranks[3]== ranks[4]){
        return ranks[0]==ranks[1];
      }
      return false;
        
        //return ranks[2] == ranks[3] && ranks[2] == ranks[4];   

    }

    private int rank;
    private int suit;

    // private Card[] hand;

    public static Card highCard(Card[] hand)
    {
      return null;
    }
    public static Card HighCard(Card[] card)
    {
        return null;
    }
    // public static Card getHand(){
    //   return this.hand;
    // }
    // public void setHand(Card[] hand){
    //     this.hand=hand;
    // }

    // public static String getRank(Card[] cards) 
    // {
    //     return "";
    // }

    // public void setRank(String rank) 
    // {
    //     this.rank = rank;
    // }

    // public String getSuit() 
    // {
    //     return this.suit;
    // }

    // public void setSuit(String suit) 
    // {
    //     this.suit = suit;
    // }

    // public String toString(){
    //     return ""+ this.suit + " and " + this.rank;
    // }
  
}
