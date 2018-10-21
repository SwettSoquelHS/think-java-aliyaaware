import java.util.Arrays;

public class TestCh7Ex8 extends TUtils {
    public static void main(String[] args){
        WEB_RUN = false;
        /*
        Write a method named areFactors that takes an integer 
        n and an array of integers, and that returns true if 
        the numbers in the array are all factors of n 
        (which is to say that n is divisible by all of them).
        */

        runTests();
        dumpReport();
    }

/*
   Write a method called sieve that takes an integer parameter, n, 
   and returns a boolean array that indicates, for each number 
   from 0 to n - 1, whether the number is prime
*/
    public static void runTests(){
        startTest("Chapter7, Exercise8.isAnagram()");
        String s1, s2;

        s1 = "stop";
        s2 = "mots";
        tryTest(s1, s2, false);

        s1 = "stop";
        s2 = "pots";
        tryTest(s1, s2, true);
        
        s1 = "allen downey";
        s2 = "well annoyed";
        tryTest(s1, s2, true);


        s1 = "flip";
        s2 = "flop";
        tryTest(s1, s2, false);


        s1 = "ooooooh boy";
        s2 = "oooooo hboy";
        tryTest(s1, s2, true);

        s1 = "ooooooh boy";
        s2 = "oooooo hboy";
        tryTest(s2, s1, true);


        s1 = "now";
        s2 = "won";
        tryTest(s1, s2, true);


        s1 = "larp test";
        s2 = "lightning bolt";
        tryTest(s1, s2, false);

        
        endTest();
    }

    public static boolean tryTest(String s1, String s2, boolean expectedResult){
        try {
            boolean gotBack = Exercise8.isAnagram(s1, s2);
            //public static void addResult(String methodTested, String argument, String received, String expected, boolean passed){
            addResult("Exercise8.isAnagram", s1 + ", " + s2 , String.valueOf(gotBack), 
                String.valueOf(expectedResult), gotBack == expectedResult);
            return gotBack == expectedResult;
        } catch (Exception e) {
            deduct(0.1);
            //addResult(String methodTested, String argument, String received, String expected, boolean passed){
            addResult("Exercise8.isAnagram", s1 + ", " + s2 , 
                "Exception Thrown", String.valueOf(expectedResult), false);
            return false;            
        }

    }
}