public class Exercise6
{
	public static void main(String[] args)
	{
		int n = 8;
		int[] array = new int[]{2,2,2};
		System.out.print(arePrimeFactors(n, array));
	}
	public static boolean arePrimeFactors(int n, int[] array)
	{
		int result =1; 
        for (int i = 0; i < array.length; i++){   
            result = result * array[i]; 
    	}

		if(isPrime(array) && result==n){
			return true;
		}
		return false;
		
	}

	public static boolean isPrime(int[] x)
	{

        for(int j=2;j<x.length;j++) 
        {
            if(x[j]%j==0)
                return false;
        }
        return true;
        
    }
}

/*Write a method named arePrimegitFactors that takes an integer n 
and an array of integers, and that returns true if the numbers 
in the array are all prime and their product is n.*/