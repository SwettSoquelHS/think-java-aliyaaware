import java.util.Arrays;

public class TestCh7Ex4 extends TUtils {
    public static void main(String[] args){
        if(args.length > 2){
            if (args[2].equalsIgnoreCase("pub")){
                WEB_RUN = true;
            }            
        } else {
            WEB_RUN = false;
        }

        runTests();
        dumpReport();
    }

    public static void runTests(){    
        startTest("Chapter7, Exercise4.indexOfMax()");
        int testVal = 2;
        tryTest(testVal, new boolean[]{false, false});

        testVal = 3;
        tryTest(testVal, new boolean[]{false, false, true});

        testVal = 4;
        tryTest(testVal, new boolean[]{false, false, true, true});

        testVal = 5;
        tryTest(testVal, new boolean[]{false, false, true, true, false});

        testVal = 6;
        tryTest(testVal, new boolean[]{false, false, true, true, false, true});

        testVal = 7;
        tryTest(testVal, new boolean[]{false, false, true, true, false, true, false});

        testVal = 8;
        tryTest(testVal, new boolean[]{false, false, true, true, false, true, false, true});

        
        endTest();
    }

    public static boolean tryTest(int n, boolean[] expectedResult){
        try {
            boolean[] gotBack = Exercise4.sieve(n);
            //public static void addResult(String methodTested, String argument, String received, String expected, boolean passed){
            String s1  = Arrays.toString(gotBack);
            String s2 = Arrays.toString(expectedResult);

            addResult("Exercise4.sieve", String.valueOf(n) , Arrays.toString(gotBack), 
                Arrays.toString(expectedResult), s2.equalsIgnoreCase(s1));
            return gotBack == expectedResult;
        } catch (Exception e) {
            deduct(0.1);
            //addResult(String methodTested, String argument, String received, String expected, boolean passed){
            addResult("Exercise4.indexOfMax", String.valueOf(n) , "Exception Thrown", Arrays.toString(expectedResult), false);
            return false;            
        }

    }
}