import java.util.Scanner;

public class Exercise5{
	public static void main(String[] args){
		Scanner console = new Scanner (System.in);
		
		//Take user input for word
		System.out.print("enter a word: ");
		String word = console.nextLine();

		System.out.print(isDoubloon(word));
	}

	public static boolean isDoubloon(String s){
		String l = s.toLowerCase();

		for (int j=0; j< l.length(); j++)
		{
			int count = 0;

			for (int i = 0; i < l.length(); i++){
				if(l.charAt(j)==l.charAt(i)){
					count++;
					if  (2 < count) 
					{
                		return false; // more than twice
              		} 
          		}
        	}
	        if (1 == count) 
	        {
	            return false;
			}
		}
		return true;
	}
}





