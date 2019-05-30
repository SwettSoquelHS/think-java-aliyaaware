import java.util.List;
import java.util.ArrayList;

public class ScrambledWord{
	public static void main(String[] args){
		String[] words = {"CAN", "ABRACADABRA", "WHOA",
                        "AARDVARK", "EGGS", "A", ""};
      for (String word : words)
         System.out.println(word + " becomes " + scrambleWord(word));

     List<String> list2 = new ArrayList<>(List.of("CAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS"));
     System.out.println(scrambleOrRemove(list2));
	}


	public static String scrambleWord(String word){
		int current = 0;
		String result="";
		while (current < word.length()-1)
		{
			if (word.substring(current,current+1).equals("A") && !word.substring(current+1,current+2).equals("A"))
			{
				result += word.substring(current+1,current+2);
				result += "A";
				current += 2;
			}else 
			{
				result += word.substring(current,current+1);
				current++;
			}
		}
		if (current < word.length()){
			result += word.substring(current);
		}
		return result;
	}


	public static List scrambleOrRemove(List<String> wordList){
		//ArrayList copy = new ArrayList<String>();
		int index = 0;
		while (index < wordList.size()){
			String word=wordList.get(index);
			String scrambled=scrambleWord(word);
			if (word.equals(scrambled)){
				wordList.remove(index);
			}
			else {
				wordList.set(index,scrambled);
				index++;
			}
		}
		return wordList;
	}

}

// Write the method scrambleOrRemove, which replaces each word in the parameter wordList 
// with its scrambled version and removes any words that are unchanged after scrambling. 
// The relative ordering of the entries in wordList remains the same as before the call to scrambleOrRemove. 