public class Exercise4{
    public static void main(String[] args){
        int n = 100;
        System.out.println("The number of primes is " + sieve(n));
    }
    public static boolean sieve(int n){

        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int x = 2; x*x <= n; x++) {

            if (isPrime[x]) {
                for (int j = x; x*j <= n; j++) {
                    isPrime[x*j] = false;
                }
            }
        }
        return true;
    }
}



// Write a method called sieve that takes an integer parameter, n, and returns a 
//boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.
