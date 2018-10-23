public class Exercise4{
    public static void main(String[] args){
        int n = 1234;
        System.out.println(sieve(n));
    }
    public static boolean[] sieve(int x){
        bool[] arr = new bool[x];
        for (int i = 0; i < arr.length; i++) 
        {
            if(isPrime(arr[i])){
                return true;
            }
            return false;
        }
        return arr;
    }

    public static boolean isPrime(int x){
        for(int i=2;i<x;i++) {
            if(x%i==0)
                return false;
        }
        return true;
        
    }
}
