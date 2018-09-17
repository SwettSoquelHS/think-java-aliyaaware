
public class abecedarian{
	public static  void main(String args[])
	{
// final test product
		String word = "abecedarian";
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

		for (int i = 0; i<word.length(); i++){
			char[] = i;
			System.out.println("Char at i: " + i );
		}
		return false;
	}
}
