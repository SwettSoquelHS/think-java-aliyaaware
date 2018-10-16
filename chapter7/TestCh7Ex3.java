public class TestCh7Ex3 extends TUtils {
    public static void main(String[] args){
        runTests();
        dumpReport();
    }

    public static void runTests(){
        startTest("Chapter7, Exercise4.indexOfMax()");
        int[] testVal = new int[] { 33, 12, 1 };
        tryTest(testVal, 0);

        testVal = new int[] { 98, 12, 99 };
        tryTest(testVal, 2);

        testVal = new int[] { 99, 100, 98, 5,4,3,2,1 };
        tryTest(testVal, 1);

        testVal = new int[] { 100000, 100, 98, 5,4,3,2,1 };
        tryTest(testVal, 0);

        testVal = new int[] { 0, 1, 2, 3, 4, 5 };
        tryTest(testVal, 5);

        testVal = new int[] { 0, 4, 3, 5, 2, 7 };
        tryTest(testVal, 5);

        testVal = new int[] { -5, 0};
        tryTest(testVal, 1);

        testVal = new int[] { 0, -1};
        tryTest(testVal, 0);


        
        endTest();
    }

    public static boolean tryTest(int[] someInts, int expectedResult){
        try {
            int gotBack = Exercise3.indexOfMax(someInts);
            //public static void addResult(String methodTested, String argument, String received, String expected, boolean passed){
            addResult("Exercise4.indexOfMax", someInts , String.valueOf(gotBack), 
                String.valueOf(expectedResult), gotBack == expectedResult);
            return gotBack == expectedResult;
        } catch (Exception e) {
            deduct(0.1);
            //addResult(String methodTested, String argument, String received, String expected, boolean passed){
            addResult("Exercise4.indexOfMax", someInts , "Exception Thrown", String.valueOf(expectedResult), false);
            return false;            
        }

    }
}