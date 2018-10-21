public class Exercise6{
	public static void main(String[] args){
		int n = 3;
		int[] array = new int[]{1,2,3,4,5};
		System.out.print(arePrimeFactors(n, array));
	}
	public static boolean arePrimeFactors(int n, int[] array){
		int result =1;
		for (int i=2; i<n; i++){
			if(n%i!=0 && result*array[i]==n){
				return true;
			}
		}
		return false;
	}
}

/*Write a method named arePrimeFactors that takes an integer n 
and an array of integers, and that returns true if the numbers 
in the array are all prime and their product is n.*/