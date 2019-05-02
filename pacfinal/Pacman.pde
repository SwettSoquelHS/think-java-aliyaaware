class Pacman{
  int radius = 50;
  int direction = 1;
  int direction2 = 0;
  int x_pos, y_pos;
  //int x = 250;
  //int y = 250; 

  public int getRadius(){ return radius; }
  
  protected int colId, rowId;
  
  //TODO: This might not be the best way to track
  //but we need to know when we are out of bounds
  protected int maxRow, maxCol;
  
  protected int[][] glyphData;

  public Pacman(int rowAt, int colAt){
     this.rowId = rowAt;
     this.colId = colAt;
  } 

  
  public void setData(int[][] data){
     glyphData = data; 
  }
  
  public int row(){ return rowId; }
  
  public int col(){ return colId; }
  
  public void x(){ x_pos= rowId; }
  
  public int y(){y_pos=colId; return y_pos; }
  
  
  
  public void show(int xAt, int yAt){    
    //for(int row = 0; row < glyphData.length; row++){
    //   for(int col = 0; col < glyphData[row].length; col++){
    //      int fillColor = glyphData[row][col];
    //      if(fillColor > -1){
            fill(#FFFF33);
            noStroke();
    //        int x = xAt + col*cellSize;
    //        int y = yAt + row*cellSize;
    //        rect(x,y,cellSize,cellSize);
            //ellipse(xAt, yAt, 50, 50);
           // render(xAt, yAt);
    //      }
    //   }
    //}
      for ( int i=-1; i < 2; i++) {
        for ( int j=-1; j < 2; j++) {
          pushMatrix();
          translate(xAt + (i * width), yAt + (j*height));
          if ( direction == -1) { 
            rotate(PI);
          }
          if ( direction2 == 1) { 
            rotate(HALF_PI);
          }
          if ( direction2 == -1) { 
            rotate( PI + HALF_PI );
          }
          arc(0, 0, radius, radius, map((millis() % 500), 0, 500, 0, 0.52), map((millis() % 500), 0, 500, TWO_PI, 5.76) );
          popMatrix();
          // mouth movement //
        }
      }
      
      if (keyCode == LEFT) {
      x = x - 10;
      direction= -1;
      direction2 = 0;
    }
    else if (keyCode == RIGHT) {  
      x = x + 10;
      direction = 1;
      direction2 = 0;
    }
    else if (keyCode == UP) {
      y = y - 10;
      direction = 0;
      direction2 = -1;
    }
    else if (keyCode == DOWN) { 
      y = y + 10;
      direction = 0;
      direction2 = 1;
    }
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
