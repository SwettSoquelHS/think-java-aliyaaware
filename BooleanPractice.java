
public class BooleanPractice{
	public static void main(String[] args){

		System.out.println("Boolean practice");


		String greeting = customGreeting("name", true);
		System.out.println(greeting);

		String greeting = customGreeting("name", false);
		System.out.println(greeting);


		System.out.println("4 is even? " + isEven(4));
		boolean is7even = isEven(7);
		System.out.println("7 is even? " + isEven(7));

	}

	public static String customGreeting(String name, boolean isBirthday){
		String result;
		result = "nice to meet you " + name + ".";
		if (isBirthday){
			result = result + "Happy Birthday!";
		}else {
			result = result + "Just a boring regular day";
		}


		return result;


	}

	public static boolean isEven(int theNum){
		if (theNum%2 == 0){
			return true;
		}else{
			return false;
		}
	}


	public ststic int signOf(int theNum ){
		if (theNum < 0){
			return -1;
		}else if(theNum > 0 ){
			return +1;

		}else {
			return 0;
		}
	}
	public static int signOfv2 (int theNum){
		if (theNum > 0 ){
			return 1;
		}else {
			if ( theNum < 0){
				return -1;
			}else {
				return 0;
			}
		}
	}
	
}