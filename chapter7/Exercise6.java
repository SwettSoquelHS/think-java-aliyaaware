public class Exercise6{
	public static void main(String[] args){
		int n = 31;
		int[] array = new int[]{2,3,5};
		System.out.print(arePrimeFactors(n, array));
	}
	public static boolean arePrimeFactors(int n, int[] array){
		int result =1;
		int j = 0;
		for (int i =2; i<n; i++){
			if(n%i==0 && result*array[j]!=n){
				return false;
			}
		}
		return true;
	}
}

/*Write a method named arePrimeFactors that takes an integer n 
and an array of integers, and that returns true if the numbers 
in the array are all prime and their product is n.*/