public class Exercise4{
    public static void main(String[] args){
        int n = 12;
        System.out.print(sieve(n));
    }
    public static boolean[] sieve(int n){
       boolean[] primes = new boolean[n + 1];
       for (int i = 2; i < primes.length; i++) {
           primes[i] = true;
       }
       int num = 2;
       while (true) {
           for (int i = 2;; i++) {
               int multiple = num * i;
               if (multiple > n) {
                   break;
               } else {
                   primes[multiple] = false;
               }
           }
           boolean nextNumFound = false;
           for (int i = num + 1; i < n + 1; i++) {
               if (primes[i]) {
                   num = i;
                   nextNumFound = true;
                   break;
               }
           }
           if (!nextNumFound) {
               break;
           }
       }
       for (int i = 0; i < primes.length; i++) {
           if (primes[i]) {
               System.out.println(i);
           }
       }
       return primes;
   }
}






// public class Exercise4{
//     public static void main(String[] args){
//         int n = 1234;
//         System.out.println(sieve(n));
//     }
//     public static boolean sieve(int x){

//         while (x>0)
//         {
//             for (int i = 2; i <= x-1; i++) 
//             {
//                 if ( x%i ==0)
//                     return false;
//             }
//             return true;
//         }
//         return true;
//     }
// }
