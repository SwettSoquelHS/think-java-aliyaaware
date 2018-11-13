public class ForExample {
	public static void main(String[] args){
		int[] someInts = {3, 2, 4, 5, 6, 5};
		String[] someStrs = {"This", " is", "some", "strs"};

		for (int anInt : someInts){
			System.out.println("The int is " + anInt);
			someInts[0]=-1;
		}

		for (String aString : someStrs){
			System.out.println("The int is " + aString);
			someInts[0] = -1;
		}
	}
}