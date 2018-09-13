import java.util.Scanner;

public class abecedarian{
	public static  void main(String args[])
	{
		//prompt user to enter a word
		Scanner console = new Scanner (System.in);

		System.out.print("enter a word: ");
		String word = console.nextLine();

// final test product
		System.out.println(isAbecedarian(word));
	}

	public static boolean isAbecedarian(String word)
	{
		int length=word.length();
		char last = word.charAt(length-1);
		char first = word.charAt(0);

//if only one letter return true
		if (length <= 1) {
        	return true;
    	}

		for (int i = 0; i<word.charAt(i+1); i++){
			return true;
		}
		return false;
	}
}
