import java.util.List;
import java.util.ArrayList;

public class ScrambledWord{
	public static void main(String[] args){
		String[] words = {"CAN", "ABRACADABRA", "WHOA",
                        "AARDVARK", "EGGS", "A", ""};
      for (String word : words)
         System.out.println(word + " becomes " + scrambleWord(word));

     //System.out.println(scrambleOrRemove(words));
	}



	public static String scrambleWord(String str){
		char[] arr = str.toCharArray();
		for(int i=1; i<arr.length; i++){
			if(arr[i]== str.indexOf("A") && !(arr[i+1]==str.indexOf("A"))){
				arr =  arr[i-1] + arr[i+1] +arr[i];
				i++;
			}
		}
		return str;
		// for(int i=1; i<str.length(); i++){
		// 	if(str.substring(i-1, i).equals("A") && !str.substring(i, i+1).equals("A")){
		// 		str =  str.substring(0, i-1) + str.substring(i, i+1) + str.substring(i-1, i) + str.substring(i+1);
		// 		i++;
		// 	}
		// }

		// return str;
	}

	// public static ArrayList scrambleOrRemove(String[] wordList){
	// 	ArrayList copy = new ArrayList<String>();
	// 	for (String word: wordList){
	// 		copy.add(scrambleWord(word));
	// 		// char[] chars = word.toCharArray();
	// 		// char[] oldChar = word.copyValueOf(chars);
	// 		// if (chars.equals(word.copyValueOf(word))){
	// 		// 	copy.remove(word);
	// 		// }
	// 	}

	// 	//String[] copy = wordList.copyValueOf(scrambleWord(wordList));
	// 	return copy;
	// }

}

// Write the method scrambleOrRemove, which replaces each word in the parameter wordList 
// with its scrambled version and removes any words that are unchanged after scrambling. 
// The relative ordering of the entries in wordList remains the same as before the call to scrambleOrRemove. 