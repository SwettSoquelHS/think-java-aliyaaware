public class Exercise4{
	public static void main(String[] args){
    	int n = 100;
        // initially assume all integers are prime
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int x = 2; x*x <= n; x++) {

            // if x is prime, then mark multiples of x as nonprime
            if (isPrime[x]) {
                for (int j = x; x*j <= n; j++) {
                    isPrime[x*j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes++;
        }
        System.out.println("The number of primes > or = to " + n + " is " + primes);
	}
}



// Write a method called sieve that takes an integer parameter, n, and returns a 
//boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.


/*Input: an integer n > 1.
 
 Let A be an array of Boolean values, indexed by integers 2 to n,
 initially all set to true.
 
 for i = 2, 3, 4, ..., not exceeding √n:
   if A[i] is true:
     for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n:
       A[j] := false.
 
 Output: all i such that A[i] is true.*/