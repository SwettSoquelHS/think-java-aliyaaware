import java.util.Arrays;

public class ChangeArrays {


    public static void main(String[] args){
        /*
            Write a program to add a score of 100 to 
            the the array scores.
        */
        int[] fin =null;
        int[] scores = {88,91,80,78,95};

        System.out.println("Current scores are: " + Arrays.toString(scores));

        //TODO 1: Write code to make a new array that can hold a new
        int[] temp= new int [scores.length + 1];
        for (int i =0; i < scores.length; i ++){
            temp[i] = scores[i];
        }
        temp[temp.length-1] = 100;
        scores = temp;
        


        // ... code to add should stay above this line
        System.out.println("After 'adding' score: " + Arrays.toString(scores));



        //TODO 2: Next, write code to remove the first value from the scores
        int[] temp2 = new int[scores.length-1];
        for (int i=1; i < scores.length; i++){
            temp2[i-1] = scores[i];
        }
        scores = temp2;


        // ... code to remove should stay above this line
        System.out.println("After 'remove' scores are: " + Arrays.toString(scores));


        //TODO 3: Implement the methods below
        int[] arr2 = makeCopyOf(scores);
        //System.out.println("Copy of scores looks like: " + scores);

        int[] first_arr = new int[]{5, 6, 7 ,8};
        System.out.println("origional array = " + Arrays.toString(first_arr));

        
        fin = makeCopyOf(first_arr);
        System.out.println("copy of full array " + Arrays.toString(fin));

        first_arr =  new int[]{5, 6, 7 ,8};

        fin = addValue(first_arr, -9, 3);
        System.out.println("add one value to array " + Arrays.toString(fin));

        first_arr =  new int[]{5, 6, 7 ,8};

        fin = removeLast(first_arr);
        System.out.println("Remove first value of array " + Arrays.toString(fin));

        first_arr =  new int[]{5, 6, 7 ,8};

        fin = removeIndex(first_arr, 1);
        System.out.println("remove a value from an index (1) of the array " + Arrays.toString(fin));


    }


    public static int[] makeCopyOf(int[] arr){
        for(int i =0; i< arr.length; i++){
            arr[1] = 12;
        }
        return arr;    
    }

    public static int[] addValue(int[] arr, int val, int pos){
        val = -9;
        int[] temp = new int[arr.length+1];
        for(int i =0; i< pos; i++){
            temp[i] = arr[i];
        }
        temp[pos] = val;
        temp[4]=arr[3];
        for(int i= pos+1; i<arr.length; i++){
            temp[i]=arr[i-1];
        }

        arr = temp;
        return arr;
    }

    public static int[] removeLast(int[] arr){ 
        int[] temp = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            temp[i]=arr[i];
        }
        arr = temp;
        return arr;
    }

    public static int[] removeIndex(int[] arr, int pos){
        int[] temp = new int[arr.length-1];
        for (int i=0; i < arr.length-1; i++){
            temp[i]=arr[i];
        }
        temp[2] = arr[3];
        for(int i=pos+1; i<arr.length-1; i++){
            temp[pos]=arr[i];
        }
        arr = temp;
        return arr;
    }
}

