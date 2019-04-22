public class Pellets{
  protected int colId, rowId;
  int x_pos, y_pos;
  
  //int radius;
  protected int maxRow, maxCol;
  
  protected int[][] glyphData;
  
  public Pellets(int rowAt, int colAt){
    this.rowId = rowAt;
    this.colId = colAt;
  }
  
  void show(){
    pushMatrix();
    fill(255);
    ellipse(rowId,colId, 10,10);
    popMatrix();
  }
  
  public void setBoundsFood(int rows, int cols){
    maxRow = rows;
    maxCol = cols;
  }
  
  public void setData(int[][] data){
     glyphData = data; 
  }
  
  public int row(){ return rowId; }
  
  public int col(){ return colId; }
  
  
  public int x(){ return x_pos; }
  
  public int y(){ return y_pos; }
  
  public void updateCol(int by){
    if(colId + by <= maxCol /*- glyphData[0].length*/ && colId + by >= 0)
       colId += by; 
  }
  
  public void updateRow(int by){
     if(rowId + by <= maxRow /*- glyphData.length*/  && rowId + by >= 0)
       rowId += by;
  }
  
  //void eat_dot_at(float ix, float iy) {
  //  int i = int(ix/20);
  //  poop[i][j].remove();
  //}
  
}

//class Pellets {
//  int x, y;
//  protected int colId, rowId;
//  protected int maxRow, maxCol;
//  Pellets(int x, int y) {
//    this.x = x;
//    this.y = y;
//  }
//  void show() {
//    noStroke();
//    fill(#FCA900);
//    ellipse(x, y, 10, 10);
//  }
  
//  private boolean eaten = false;
  
//  public void setEaten (boolean beenEaten) {
//      eaten = beenEaten;
//  }
//  public boolean isEaten() {
//     return eaten;
//  }
    
  
//  public void setBounds(int rows, int cols){
//    maxRow = rows;
//    maxCol = cols;
//  }
  
//  public void updateCol(int by){
//    if(colId + by <= maxCol /*- glyphData[0].length*/ && colId + by >= 0)
//       colId += by; 
//  }
  
//  public void updateRow(int by){
//     if(rowId + by <= maxRow /*- glyphData.length*/  && rowId + by >= 0)
//       rowId += by;
//  }

//}
