public class Exercise4{
	public static  void main(String args[])
	{
// final test product
		String word = "abcd";
		System.out.println(isAbecedarian(word));
	}

	public static boolean isAbecedarian(String word)
	{
		int index = 0;
		char c = 'a'; 
		while (index < word.length()) {
			if (c > word.charAt(index)) {
				return false;
			}
			c = word.charAt(index); 
			index = index + 1;
			
		}
		return true;

	}
}