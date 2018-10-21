public class Exercise5{
    public static void main(String[] args){
        int n =  8;
        int[] array = new int[]{1, 4, 12, 10, 6, 8};
        System.out.print(areFactors(n, array));

    }
    public static boolean areFactors(int n, int[] array){
        int i =0;
        while (array[i] > 0)
        {
            if (array[i]%n==0)
            { 
                return false;
            }else
            {
                return true;
            }

        }
        return false;
    }
}



/*Write a method named areFactors that takes an integer n 
and an array of integers, and that returns true if the numbers 
in the array are all factors of n (which is to say that n is divisible by all of them).*/