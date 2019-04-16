//public class Pellets{
//  protected int colId, rowId;
//  int radius;
//  protected int maxRow, maxCol;
  
//  protected int[][] glyphData;
  
//  public Pellets(int rowAt, int colAt){
//    this.rowId = rowAt;
//    this.colId = colAt;
//  }
  
//  void show(){
//    for ( int i=-1; i < 2; i++) {
//        for ( int j=-1; j < 2; j++) {
//          pushMatrix();
//          fill(0);
//          ellipse(rowId,colId, 5,5);
//          popMatrix();
//          // mouth movement //
//        }
//      }
//  }
  
//  public void setBounds(int rows, int cols){
//    maxRow = rows;
//    maxCol = cols;
//  }
  
//  public void setData(int[][] data){
//     glyphData = data; 
//  }
  
//  public int row(){ return rowId; }
  
//  public int col(){ return colId; }
  
//}

class Pellets {
  int x, y;
  protected int colId, rowId;
  protected int maxRow, maxCol;
  Pellets(int x, int y) {
    this.x = x;
    this.y = y;
  }
  void show() {
    noStroke();
    fill(#FCA900);
    ellipse(x, y, 10, 10);
  }
  
  private boolean eaten = false;
  
  public void setEaten (boolean beenEaten) {
      eaten = beenEaten;
  }
  public boolean isEaten() {
     return eaten;
  }
  
  public void setBounds(int rows, int cols){
    maxRow = rows;
    maxCol = cols;
  }
  
  public void updateCol(int by){
    if(colId + by <= maxCol /*- glyphData[0].length*/ && colId + by >= 0)
       colId += by; 
  }
  
  public void updateRow(int by){
     if(rowId + by <= maxRow /*- glyphData.length*/  && rowId + by >= 0)
       rowId += by;
  }

}
