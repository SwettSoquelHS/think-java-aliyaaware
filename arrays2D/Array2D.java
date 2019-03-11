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

        print2DArray2(arr3);

       System.out.println( " min number in the matrix is: " + smallest(arr3));

       // System.out.print("add up rows in array " + largestRow(arr3));

       // System.out.println("add up columns");
        System.out.println("The highest column sum is in Column # " +largestCol(arr3));

        System.out.println("max row sum is in row: " + largestRow(arr3));

        // "I just want to smell the peanut butter but i cant eat it"
        // you smush the banana in tiny pices
        // then she stares at the food she could be eating
        System.out.println("New 2d array: " + print2DArray(make2d(2, 2, 3)));

    }

    public static int[][] print2DArray(int[][] matrix)
    {
    	for(int j=0; j<matrix.length; j++)
    	{
    		for(int i=0; i < matrix[j].length; i++)
    		{
    			System.out.print(matrix[j][i]+ " ");
    		}
    		System.out.println();
    	}
        return matrix;

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

    public static int smallest(int[][] matrix){
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
	   return min;
    }

    public static int largestRow(int[][] matrix){
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
        return maxRowNum;
    }



    public static int largestCol(int[][] matrix){
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
    return maxColNum;

    }
    

    public static int[][] make2d(int numRows, int numCols, int value){
    	int[][] newArray = new int[numRows][numCols];
    	for (int i =0; i < newArray[0].length; i++){
    		for (int j=0; j < newArray.length; j++){
    			newArray[i][j]= value;
    		}
    	}
    	//newArray[numRows][numCols] = value;
    	return newArray;
    }

}

/* 

[4] Create a static method named make2d, which takes three integer parameters named numRows, 
numCols, default value. The method will create a new 2d array with the specified dimensions 
of numRows by numCols and fill it the default.

Eg. make2d(2,3, -1) would create an array
-1 -1 -1
-1 -1 -1
*/