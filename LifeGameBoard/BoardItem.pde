public class BoardItem {
  
  //Where the board item upper left/right corner lives
  protected int colId, rowId;
  
  //TODO: This might not be the best way to track
  //but we need to know when we are out of bounds
  protected int maxRow, maxCol;
  
  protected int[][] glyphData;
  
  public BoardItem(int rowAt, int colAt){
     this.rowId = rowAt;
     this.colId = colAt;
  }
  
  public void setData(int[][] data){
     glyphData = data; 
  }
  
  public int row(){ return rowId; }
  
  public int col(){ return colId; }
  
  public void show(int xAt, int yAt, int cellSize){    
    for(int row = 0; row < glyphData.length; row++){
       for(int col = 0; col < glyphData[row].length; col++){
          int fillColor = glyphData[row][col];
          if(fillColor > -1){
            fill(fillColor);
            int x = xAt + col*cellSize;
            int y = yAt + row*cellSize;
            rect(x,y,cellSize,cellSize);
          }
       }
    }
  }
  
  public void setBounds(int rows, int cols){
    maxRow = rows;
    maxCol = cols;
  }
  
  public void updateCol(int by){
    if(colId + by <= maxCol - glyphData[0].length && colId + by >= 0)
       colId += by; 
  }
  
  public void updateRow(int by){
     if(rowId + by <= maxRow - glyphData.length  && rowId + by >= 0)
       rowId += by;
  }
  
  
  
}
