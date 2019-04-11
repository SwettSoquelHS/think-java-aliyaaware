public class Pellets{
  protected int colId, rowId;
  int radius;
  protected int maxRow, maxCol;
  
  protected int[][] glyphData;
  
  public Pellets(int rowAt, int colAt){
    this.rowId = rowAt;
    this.colId = colAt;
  }
  
  void show(){
    for ( int i=-1; i < 2; i++) {
        for ( int j=-1; j < 2; j++) {
          pushMatrix();
          fill(0);
          ellipse(rowId,colId, 100,100);
          popMatrix();
          // mouth movement //
        }
      }
  }
  
  public void setBounds(int rows, int cols){
    maxRow = rows;
    maxCol = cols;
  }
  
  public void setData(int[][] data){
     glyphData = data; 
  }
  
  public int row(){ return rowId; }
  
  public int col(){ return colId; }
  
}
