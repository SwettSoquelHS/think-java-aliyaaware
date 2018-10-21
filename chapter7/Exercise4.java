public class Exercise4{
    public static void main(String[] args){
        int n = 3;
        System.out.println("The number is prime? " + sieve(n));
    }
    public static boolean sieve(int n){

        if (n>=1)
        {
            for (int i = 2; i <= n-1; i++) 
            {
                if ( n%i ==0)
                    return false;
            }
            return true;
        }
        return true;
    }
}




// Write a method called sieve that takes an integer parameter, n, and returns a 
//boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.
