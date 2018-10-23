public class Exercise6{
	public static void main(String[] args){
		int n = 8;
		int[] array = new int[]{2,2,2};
		System.out.print(arePrimeFactors(n, array));
	}
	public static boolean arePrimeFactors(int n, int[] array){
		int result =1;
		int j = 0;
		for (int i =2; i<n; i++){
			if(n%i==0 && array[i]*result!=n){
				return false;
			}
		}
		return true;
	}
}

/*Write a method named arePrimegitFactors that takes an integer n 
and an array of integers, and that returns true if the numbers 
in the array are all prime and their product is n.*/