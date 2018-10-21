import java.util.Arrays;

public class TestCh7Ex6 extends TUtils {
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
        startTest("Chapter7, Exercise6.arePrimeFactors()");
        int[] testVal = new int[] { 4, 2, 1 };
        int n = 8;
        tryTest(n, testVal, false);

        testVal = new int[] { 2, 2, 2 };
        n = 8;
        tryTest(n, testVal, true);

        testVal = new int[] { 3, 5 };
        n = 15;
        tryTest(n, testVal, true);

        testVal = new int[] { 5, 7, 1 };
        n = 35;
        tryTest(n, testVal, false);

        testVal = new int[] { 2, 3, 5 };
        n = 30;
        tryTest(n, testVal, true);

        testVal = new int[] { 2, 3, 5 };
        n = 31;
        tryTest(n, testVal, false);


        testVal = new int[] { 11, 13, 17 };
        n = 2431;
        tryTest(n, testVal, true);
        
        endTest();
    }

    public static boolean tryTest(int n, int[] someInts, boolean expectedResult){
        try {
            boolean gotBack = Exercise6.arePrimeFactors(n, someInts);
            //public static void addResult(String methodTested, String argument, String received, String expected, boolean passed){
            addResult("Exercise6.arePrimeFactors", n + ", " + Arrays.toString(someInts) , String.valueOf(gotBack), 
                String.valueOf(expectedResult), gotBack == expectedResult);
            return gotBack == expectedResult;
        } catch (Exception e) {
            deduct(0.1);
            //addResult(String methodTested, String argument, String received, String expected, boolean passed){
            addResult("Exercise6.arePrimeFactors", n + ", " + Arrays.toString(someInts) , 
                "Exception Thrown", String.valueOf(expectedResult), false);
            return false;            
        }

    }
}