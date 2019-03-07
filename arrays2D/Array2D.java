public class Array2D {

    public static void main(String[] args){
        // //Normal 1-dimensional array
        int[] arr1 = {2,3};

        //2-Dimensional array
        // int[][] arr2 = new int[2][2];
        // arr2[0][0]=2;
        // arr2[0][1]=3;
        // arr2[1][0]=4;
        // arr2[1][1]=5;

        // print2DArray(arr2);

        // arr2[1] = arr1;
       // print2DArray(arr2);

        int[][] arr3 = new int[2][2];
        arr3[0][0]=2;
        arr3[0][1]=3;
        arr3[1][0]=4;
        arr3[1][1]=5;

       smallest(arr3);

       // System.out.print("add up rows in array " + largestRow(arr3));

       // System.out.println("add up columns");
        largestCol(arr3);

        largestRow(arr3);

        // "I just want to smell the peanut butter but i cant eat it"
        // you smush the banana in tiny pices
        // then she stares at the food she could be eating


    }

    public static void print2DArray(int[][] matrix)
    {
    	for(int j=0; j<matrix.length; j++)
    	{
    		for(int i=0; i < matrix[j].length; i++)
    		{
    			System.out.print(matrix[j][i]+ " ");
    		}
    		System.out.println();
    	}

    }

    public static void print2DArray2(int[][] matrix)
    {
    	//advanced for to grab values out of an array list not to change values
    	for (int[] row : matrix)
    	{
    		for (int colValue: row)
    		{
				System.out.print(colValue + " ");
    		}
    		System.out.println();
    	}
    }

    public static void smallest(int[][] matrix){
    	int min = matrix[0][0];
    	for(int i=0; i < matrix[0].length; i ++){
    		for(int j =0; j < matrix.length; j++){
    			if(matrix[i][j]<min){
                    min = matrix[j][i];
                }	
    		}
    	}
    	//for (int i = 0; i < num.length; i++) {
	   // }
	   System.out.println( " min number in the matrix is: " +min);
    }

    public static void largestRow(int[][] matrix){
        int[] maxRow = new int[matrix[0].length];
    	int max = 0;
        int maxRowNum =0;
    	for(int j=0; j<matrix[0].length; j++){
    		for(int i=0; i < matrix[j].length; i++){
    			maxRow[j]+=matrix[j][i];
    		}
    	}
    	for (int i=0; i < maxRow.length; i++){
            if(max< maxRow[i]){
                max = maxRow[i];
                maxRowNum = i+1; 
            }
        }
        System.out.println("max row is row: " + maxRowNum+ " with a sum of: "+max);
    }



    public static void largestCol(int[][] matrix){
    	int[] maxColumn = new int[matrix[0].length];
    	int max =0;
    	int maxColNum =0;
    	for(int i=0; i < matrix[0].length; i ++){
    		for(int j =0; j < matrix[i].length; j++){
    			maxColumn[i]+=matrix[j][i];
    		}
    	}
    	for (int j = 0; j < maxColumn.length; j++) {
	        if (max < maxColumn[j]) {
	            max = maxColumn[j];
	            maxColNum = j+1; // column number will associate with its array column starting with 0
	        }
	    }
    System.out.println("The highest column sum is Column #"+maxColNum+" with a sum of "+max);

    }
    

    public static void make2d(int numRows, int numCols, int value){
    	
    }

}


/* 
Create a static method named smallest, which should take as a parameter a 2D array of ints 
named matrix and return the smallest value in the matrix

Eg, for example the following matrix would yield -8:
12  3    5
1    -8  9
20  15  9
0    18  -2



[4] Create a static method named make2d, which takes three integer parameters named numRows, 
numCols, default value. The method will create a new 2d array with the specified dimensions 
of numRows by numCols and fill it the default.

Eg. make2d(2,3, -1) would create an array
-1 -1 -1
-1 -1 -1
*/