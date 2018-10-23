public class Exercise5{
    public static void main(String[] args){
        int n = 13;
        int[] array = new int[]{1, 12, 99};
        System.out.print(areFactors(n, array));

    }
    public static boolean areFactors(int n, int[] array){
        for (int i =0; i<array.length; i++){
            if (n%array[i]==0)
                return true;
        }
        return false;
    }
}



/*Write a method named areFactors that takes an integer n 
and an array of integers, and that returns true if the numbers 
in the array are all factors of n (which is to say that n is divisible by all of them).*/