public class BoardItem{
  private int colId, rowId;
  private int maxRow, maxCol;
  
  private int[][] glyphData;
  
  public BoardItem(int rowAt, int colAt){
    this.rowId = rowAt;
    this.colId = colAt;
  }
  
  public void setData(int [][] data){
    glyphData = data;
  }
  
  public int row(){
    return rowId;
  }
  public int col(){
    return colId;
  }
  
  public void show(int xAt, int yAt, int cellSize){
    for (int row=0; row< glyphData.length; row++){
      for(int col =0; col < glyphData[row].length; col++){
          int fillColor  = glyphData[row][col];
          fill(fillColor);
          
          int x = xAt + col*cellSize;
          int y = yAt + row*cellSize;
          rect(x, y, cellSize, cellSize);
      }
    }
  }
  
  public void updateCol(int by){
    if(colId + by <= maxCol-glyphData[0].length && colId +by >=0)
      colId+=by;
  }
  
  
  public void updateRow(int by){    
    if(rowId + by <= maxRow-glyphData.length && rowId + by>=0)
      rowId+=by;

  }
  
  public void setBounds(int rows, int cols){
    maxRow = rows;
    maxCol = cols;
  }
  
}
