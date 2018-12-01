import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TUtils {
    static List<String> results = new ArrayList<String>();
    static double deduction = 0.0;
    static boolean WEB_RUN = true;
    static int PASS_COUNT = 0;
    static int NUM_TESTS = 0;


    public static void startTest(String testPhase){
        if (WEB_RUN){
            results.add("\n<br>" + testPhase +"\n");
            results.add("<table width=\"600\" border=\"1\"><tr>"+
                "<th align=\"right\" width=\"200\"> Function Call</th><th align= \"left\"> -->Your output<--</th><th width=\"50\"> Expected Output </th>"+
                "</tr>");
        }
        else {
            results.add("Test: " + testPhase + "\n");
        }
    }

    public static void endTest(){
        if(WEB_RUN){
            results.add("</table><br>\n");
        } else {
            results.add(String.format("  TEST FINISHED, PASSED: %d/%d.\n\n", PASS_COUNT, NUM_TESTS ));
        }
        PASS_COUNT = 0;
        NUM_TESTS = 0;
    }

    public static void addResult(String methodTested, int[] argument, String received, String expected, boolean passed){
        addResult(methodTested, Arrays.toString(argument), received, expected, passed);
    }

    public static void addResult(String methodTested, String argument, String received, String expected, boolean passed){
        NUM_TESTS++;
        if(passed)
            PASS_COUNT++;

        if(WEB_RUN){
            results.add("<tr><td align=\"right\" width=\"200\">"+methodTested + "(\"" + argument + "\")  </td><td align=\"left\">" + received + "</td>");
            if (passed){
                results.add("<td width=\"50\" bgcolor=\"green\"> :) </td></tr>\n");
            } else {
                results.add("<td bgcolor=\"red\"><b>" + expected + " </b></td></tr>\n");            
            }
        } else {
            //mmethod("argument"):  PASSED
            //mmethod("argument"):  FAILED, 
            //   EXPECTED: 
            //   RECEIVED:    
            //"%15s(\"%s\")  : PASSED
            
            if (passed){
                results.add(String.format("  [PASSED] %s(\"%s\") \n",methodTested,argument));
            }
            else{
                results.add(String.format("  [   :( ] %s(\"%s\"): \n",methodTested,argument));
                results.add(String.format("\t\tEXPECTED: %s\n",expected));
                results.add(String.format("\t\tRECEIVED: %s\n",received));
            }
        }
    }

    public static void deduct(double deduct){
        deduction += deduct;        
    }

    public static void dumpReport(){
        String dump = "";
        for(String s: results){
            System.out.print(s);
        }
            //dump = dump + s;
        //System.out.print(dump);
        System.out.println("[deductions="+deduction+"]\n");
    }
}