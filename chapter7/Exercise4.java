public class Exercise4{
    public static void main(String[] args){
        int n = 1234;
        System.out.println(sieve(n));
    }
    public static boolean sieve(int x){

        while (x>0)
        {
            for (int i = 2; i <= x-1; i++) 
            {
                if ( x%i ==0)
                    return false;
            }
            return true;
        }
        return true;
    }
}
