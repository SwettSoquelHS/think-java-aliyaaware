public class Swettercise1{
	public static void main(String[] args){
		System.out.println("Sweat it out!");

		String someWord = "racecar";
		System.out.println("isPalindrome: " + someWord + "? " + isPalindrome(someWord));
		System.out.println(" is printed backwards, " + reverseStr(someWord));

		someWord = "tacocat";
		System.out.println("isPalindrome: " + someWord + "? " + isPalindrome(someWord));
		System.out.println(" is printed backwards, " + reverseStr(someWord));

		someWord = "I haz win?";
		System.out.println("isPalindrome: " + someWord + "? " + isPalindrome(someWord));
		System.out.println(someWord + " is printed backwards, " + reverseStr(someWord));

		int num = 12;
		System.out.println(num + " is a prime number, "+isPrime(num));


		int nums = 12;
		System.out.println(collatzThis(nums));

	}
	public static boolean isPalindrome(String theWord){
		theWord = theWord.toLowerCase();
		for (int i=0; i<theWord.length()/2; i++){
			char leftChar = theWord.charAt(i);
			char rightChar = theWord.charAt(theWord.length()-1-i);
			if (leftChar != rightChar){
				return false;
			}
		}

		return true;
	}

	public static String reverseStr( String str){
		//this method is supposed to return a string, 
		//so you can build one up on the fly as you are looping over your string.
		String backwards="";

		for (int i=str.length()-1; i>= 0; i--){
			//char character = str.charAt(str.length()-1-i);
			backwards = backwards + str.charAt(i);
		}
		return backwards;

	}


	public static boolean isPrime(int x){
		for(int i=2;i<x;i++) {
        	if(x%i==0)
            	return false;
    	}
   		return true;
		
	}

	public static String collatzThis(int x){
		String str="";
		while (x != 1) 
	    {
	    	System.out.print(x+ ", ");
	    	if (x%2==0){
	    		x=x/2;
	    	}else{
	    		x = 3*x + 1;
	    	}
	
	    }
	    if (x==1){
	    	System.out.print(x + str);
	    }
	    return str;
	  
	}
}