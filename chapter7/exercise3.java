public class exercise3{

	public static void main(String[] args){
		int largeArray[] = new int[]{1, 3, 4, 56, 5};
		int max=largeArray[0];
		int index =0;
		for (int i=0; i<largeArray.length; i++){
			if (max< largeArray[i]){
					max= largeArray[i];
					index = i;
				}					
		}

			System.out.println("Index position of the Maximum value of the array is:  " + index);
	}
}




/*Write a method called indexOfMax that takes an array of integers and returns 
	the index of the largest element. Can you write this method using an enhanced
	for loop? Why or why not?


	No you cannot use an enhanced for loop because it asks for specific index value*/
	