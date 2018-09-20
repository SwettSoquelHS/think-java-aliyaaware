public class Swettercise{
	public static void main(String[] args){
		System.out.println("Sweat it out!");

		String someWord = "racecar";
		System.out.println("isPalindrome: " + someWord + "? " + isPalindrome(someWord));
		System.out.println(" is printed backwards, " + reverseStr(someWord));

		someWord = "tacocat";
		System.out.println("isPalindrome: " + someWord + "? " + isPalindrome(someWord));
		System.out.println(" is printed backwards, " + reverseStr(someWord));

		someWord = "nope";
		System.out.println("isPalindrome: " + someWord + "? " + isPalindrome(someWord));
		System.out.println(" is printed backwards, " + reverseStr(someWord));

		int num = 35;
		System.out.println(num + " is a prime number, "+isPrime(num));


		int nums = 45;
		System.out.println(nums + " collatzed is " + collatzThis(nums));

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

	public static boolean reverseStr( String str){
		str = str.toLowerCase();
		for (int i=0; i< str.length(); i++){
			char character = str.charAt(str.length()-1-i);
			System.out.print(character);
		}
		return true;
	}

	public static boolean isPrime(int x){
		int number = x;
		if(x<=0){
			return false;
		}else{
			number = x/2;
			x--;	
		}	

		return true;
		
	}

	public static int collatzThis(int x){
		if(x == 1){
            System.out.println(x);
        }else if (x % 2 == 0) {
        	System.out.println(x);
            collatzThis((x / 2));
        } else{
        	System.out.println(x);
            collatzThis((x * 3)+1);
        }
        return x;
	}

}