import java.util.Arrays;
public class Exercise8{

    public static void main(String[] args){
    	String a = "well done";
    	String b = "dole lewn";
    	System.out.print(isAnagram(a,b));
    }
    public static boolean isAnagram(String a, String b){
    	//compare the string lengths
    	int n1 = a.length(); 
        int n2 = b.length();
        if (n1 != n2) 
            return false;
    

    char[] chars = a.toCharArray();
       
        for(char c : chars){
            int index = b.indexOf(c);
            if(index != -1){
                b = b.substring(0,index) + b.substring(index +1, b.length());
            }else{
                return false;
            }           
        }
       
        return true;
    }

}
