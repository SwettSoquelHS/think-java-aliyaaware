public class Swettercise{
	public static void main(String[] args){
		System.out.println("Sweat it out!");

		String someWord = "racecar";
		System.out.println("isPalindrome: " + someWord + "? " + isPalindrome(someWord));

		someWord = "tacocat";
		System.out.println("isPalindrome: " + someWord + "? " + isPalindrome(someWord));

		someWord = "nope";
		System.out.println("isPalindrome: " + someWord + "? " + isPalindrome(someWord));
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
}