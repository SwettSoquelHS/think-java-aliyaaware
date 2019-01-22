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


        fin = makeCopyOf(scores);
        System.out.println("copy of full array " + Arrays.toString(fin));

        fin = addValue(scores, 2);
        System.out.println("add one value to array " + Arrays.toString(fin));

        fin = removeLast(scores);
        System.out.println("Remove first value of array " + Arrays.toString(fin));

        fin = removeIndex(scores, 2);
        System.out.println("remove a value from an index (2) of the array " + Arrays.toString(fin));


    }


    public static int[] makeCopyOf(int[] arr){
        return Arrays.copyOf(arr, arr.length);
        // int[] temp = new int[arr.length];
        // System.arraycopy(arr, 0, temp, 0, arr.length);
        // return temp;
    }


    public static int[] addValue(int[] arr, int val){
        int[] tempArr = new int[arr.length+ 1];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);
        
        for(int i=0; i < arr.length; i++)
            tempArr[i] = arr[i];
        tempArr[tempArr.length-1] = val;
        return tempArr;
    }

    public static int[] removeLast(int[] arr){ 
        int[] tempArr = new int[arr.length-1];
        System.arraycopy(arr, 0, tempArr, 0, arr.length-1);

        for (int i=1; i < arr.length; i++){
            tempArr[i-1] = arr[i];
        }       
        return tempArr;
    }

    public static int[] removeIndex(int[] arr, int index){
        int[] tempArr = new int[arr.length];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);

       for(var i = arr.length - 1; i >= 0; i--)
        /*for( int i = 0; i < arr.length-1; i++)*/{ 
           if ( arr[i] == index) {
             arr.splice(i, 1); 
           }
       }

        return arr;
        
    }
}