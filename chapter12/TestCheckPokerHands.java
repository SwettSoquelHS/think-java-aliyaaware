import java.util.Arrays;

public class TestCheckPokerHands extends TUtils {

    public static void main(String[] args){
        WEB_RUN = false;

        doTestRoyal();
        doTestStraightFlush();
        doTestFlush();
        doTestFullHouse();
        doTestHighCard();
        
        dumpReport();
    }

    public static void doTestRoyal(){
        startTest("Chapter12, Test Royal Flush");
        int s = Card.HEARTS;
        Card[] hand = new Card[]{ c( Card.ACE, s ), c(Card.KING,s), c(Card.QUEEN, s),c(Card.JACK, s),c(10,s) };                        
        test_isRoyalFlush(hand, true, .03);

        hand = new Card[]{ c(Card.QUEEN, s), c(Card.JACK, s), c( Card.ACE, s ), c(Card.KING,s),c(10,s) };
        test_isRoyalFlush(hand, true, .03);

        hand = new Card[]{ c(Card.QUEEN, s),c(Card.QUEEN, Card.CLUBS), c( Card.ACE, s ), c(Card.KING,s),c(10,s) };
        test_isRoyalFlush(hand, false, .04);

        endTest();
    }

    public static void doTestStraightFlush(){
        startTest("Chapter12, Test Straight Flush");
        int s = Card.DIAMONDS;
        Card[] hand = new Card[]{ c( Card.ACE, s ), c(Card.KING,s), c(Card.QUEEN, s),c(Card.JACK, s),c(10,s) };                        
        test_isStraightFlush(hand, true, .02);

        hand = new Card[]{ c(Card.QUEEN, s),c(Card.JACK, s), c( Card.ACE, s ), c(Card.KING,s),c(10,s) };
        test_isStraightFlush(hand, true, .02);

        hand = new Card[]{ c(3, s),c(4, s), c( 5, s ), c(6,s),c(10,s) };
        test_isStraightFlush(hand, false, .03);

        hand = new Card[]{ c(3, s),c(4, s), c( 5, s ), c(6,s),c(7,s) };
        test_isStraightFlush(hand, true, .03);

        endTest();
        
    }

    public static void doTestFlush(){
        startTest("Chapter12, Test Flush");
        int s = Card.CLUBS;
        Card[] hand = new Card[]{ c( Card.ACE, s ), c(Card.KING,s), c(Card.QUEEN, s),c(Card.JACK, s),c(10,s) };                        
        test_isFlush(hand, true, .01);

        hand = new Card[]{ c(Card.QUEEN, s),c(Card.JACK, s), c( Card.ACE, s ), c(Card.KING,s),c(10,s) };
        test_isFlush(hand, true, .01);

        hand = new Card[]{ c(3, s),c(4, s), c( 5, s ), c(6,s),c(10,s) };
        test_isFlush(hand, true, .02);

        hand = new Card[]{ c(3, s),c(4, s), c( 10, s ), c(6,s),c(6,s) };
        test_isFlush(hand, true, .03);

        hand = new Card[]{ c(3, s),c(4, Card.HEARTS), c( 10, s ), c(6,s),c(6,s) };
        test_isFlush(hand, false, .03);

        endTest();        
    }

    public static void doTestFullHouse(){
        startTest("Chapter12, Test Full House");
        int s = Card.CLUBS;
        int s2 = Card.DIAMONDS;
        int s3 = Card.HEARTS;
        Card[] hand = new Card[]{ c( Card.ACE, s ), c(Card.ACE,s2), c(Card.QUEEN, s),c(Card.QUEEN, s2),
            c(Card.QUEEN, s3) };                        
        test_isFullHouse(hand, true, .03);

        hand = new Card[]{ c( Card.ACE, s ), c(Card.KING,s2), c(Card.QUEEN, s),c(Card.QUEEN, s2),
            c(Card.QUEEN, s3) };                        
        test_isFullHouse(hand, false, .03);

        endTest();        
    }

    public static void doTestHighCard(){
        startTest("Chapter12, Test High Card");
        int s = Card.CLUBS;
        int s2 = Card.DIAMONDS;
        int s3 = Card.HEARTS;
        Card[] hand = new Card[]{ c( Card.ACE, s ), c(Card.ACE,s2), c(Card.QUEEN, s),c(Card.QUEEN, s2),
            c(Card.QUEEN, s3) };
        test_highCard(hand, Card.ACE, .05);

        hand = new Card[]{ c( 2, s ), c(3,s2), c(2, s3),c(3, s3),
            c(2, s2) };           
        test_highCard(hand, 3, .05);
        endTest();
    } 

    public static void test_isRoyalFlush(Card[] hand, boolean expected, double deduction){
        try {
            boolean result = CheckPokerHands.isRoyalFlush(hand);
            addResult("isRoyalFlush", Arrays.toString(hand), String.valueOf(result), String.valueOf(expected),
                 result == expected);
            if(result != expected){
                deduct(deduction);
            }
        } catch( Exception e){
            deduct(deduction);
            addResult("isRoyalFlush", Arrays.toString(hand), "Exception thrown", String.valueOf(expected),
                 false);

        }
    } 

    public static void test_isStraightFlush(Card[] hand, boolean expected, double deduction){
        try {
            boolean result = CheckPokerHands.isStraightFlush(hand);
            addResult("isStraightFlush", Arrays.toString(hand), String.valueOf(result), String.valueOf(expected),
                 result == expected);
            if(result != expected){
                deduct(deduction);
            }
        } catch( Exception e){
            deduct(deduction);
            addResult("isStraightFlush", Arrays.toString(hand), "Exception thrown", String.valueOf(expected),
                 false);

        }
    }

    public static void test_isFlush(Card[] hand, boolean expected, double deduction){
        try {
            boolean result = CheckPokerHands.isFlush(hand);
            addResult("isFlush", Arrays.toString(hand), String.valueOf(result), String.valueOf(expected),
                 result == expected);
            if(result != expected){
                deduct(deduction);
            }
        } catch( Exception e){
            deduct(deduction);
            addResult("isFlush", Arrays.toString(hand), "exception thrown", String.valueOf(expected),
                 false);            
        }
    }

    public static void test_isFullHouse(Card[] hand, boolean expected, double deduction){
        try {
            boolean result = CheckPokerHands.isFullHouse(hand);
            addResult("isFullHouse", Arrays.toString(hand), String.valueOf(result), String.valueOf(expected),
                 result == expected);
            if(result != expected){
                deduct(deduction);  
            }             
        } catch( Exception e){
            e.printStackTrace();
            addResult("isFullHouse", Arrays.toString(hand), "exception thrown", String.valueOf(expected),
                 false);

            deduct(deduction);

        }
    }
    
    public static void test_highCard(Card[] hand, int expectedRank, double deduction){
        try {
            Card resultCard = CheckPokerHands.highCard(hand);
            if(resultCard != null){
                addResult("isHighCard", Arrays.toString(hand), String.valueOf(resultCard.getRank()), 
                    String.valueOf(expectedRank), resultCard.getRank() == expectedRank);            
                if(resultCard.getRank() != expectedRank){
                    deduct(deduction);
                }
            } else {
                deduct(deduction);
            }        
        } catch( Exception e){   
            deduct(deduction);
            addResult("isHighCard", Arrays.toString(hand), "Eception thrown", 
                    String.valueOf(expectedRank), false);            

        }
    }

    private static Card c(int rank, int suit){
        return new Card(rank, suit);
    }
}