public class MethodExample{
	public static void main(String[] args){
		printMsg("Method Examples");
		printMsg("Good morning... ");
		newLine();
		printMsg("Goodbye. ");

		addInts(1, 3);
		int foo = 7;
		int result = addInts(foo, foo);
		System.out.println("Result is: " + result);
		System.out.println("foo id: " + foo);


		String currMonth = "September";
		String currDay = "Tue";
		int currMonthDay = 4;
		int currYear = 2018;
		printAmerican(currDay, currMonth, currMonthDay, currYear);
	}




// prints a new line

	public static void newLine(){
		System.out.println("");

	} // End of newLine

	/* 
		printMsg Prints a message to teh console
	*/

	public static void printMsg(String theMessage){
		System.out.println(theMessage);
	}


	public static int addInts(int a, int b){
		a = 6;
		b = -1;
		return a + b;
	}

	public static void printAmerican(String day, String month, 
		int monthDay, int year){


		System.out.println(day + ", " + month + " " +monthDay + ", " + year);
	}
}


