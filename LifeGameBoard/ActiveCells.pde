public class ActiveCells extends BoardItem{
  Boolean[][] curGen = new Boolean[row][col];
  
  ActiveCells(int rowAt, int colAt){
    super(rowAt, colAt);
  }
  
  public void show(int xAt, int yAt, int cellSize){

  }
  
  public void cells(){
    while (true) {
      curGen = countNextGen(curGen, boardRows, boardCols);
      for (int row = 0; row < boardRows; row++) {
        for (int col = 0; col < boardCols; col++) {
            if (curGen[row][col] == true) {
                StdDraw.point(col, row);
            }
        }
      }
     }
  }
  
}


//If the cell is "alive," there are three rules:
  //If the cell has fewer than two live neighbors, it dies--as if by under-population.
  //If the cell has more than three live neighbors, it dies--as if by over-population.
  //If a cell has exactly two or three live neighbors, it survives to the next generation.
//If the cell is "dead," the following rule applies:
  //If a dead cell has exactly three live neighbors, it becomes alive in the next generation, as if by reproduction.
