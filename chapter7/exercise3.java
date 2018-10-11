public class exercise3{

	public static void main(String[] args){
		int[] largeArray = new int[4];
		int min =0;
		int max = largeArray;
		largeArray[0] = 1;
		largeArray[1]= 2;
		largeArray[2]=3;
		largeArray[3]=4;
		for (int i=0; i<largeArray.length; i++){
			if (largeArray[i]>= min){
				i=max;
			}
			
			System.out.println("arrays = " + largeArray[i] + max);
		}
	}
}




/*Write a method called indexOfMax that takes an array of integers and returns 
	the index of the largest element. Can you write this method using an enhanced
	for loop? Why or why not?*/
	