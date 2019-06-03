public class Board {

  int x_pos, y_pos;  
  int cellSize;
  int rows, cols;
  //int[][] layer;
  color blue;
  int[][] mazeLayout;
  ArrayList<BoardItem> items;
  //ArrayList<Maze> mazeLayout = new ArrayList();

  public Board(int x, int y, int numRows, int numCols, int cellSize ) {
    x_pos = x;
    y_pos = y;
    this.cellSize = cellSize;
    rows = numRows;
    cols = numCols;
    //layer = null;
    mazeLayout = null;
    items = new ArrayList<BoardItem>();
  }

  public void addItem(BoardItem item){
    items.add(item); 
    item.setBounds(rows, cols);
  }
  public void addItem(Pacman pacman){
    items.add(pacman);
    pacman.setBounds(rows+2, cols+2);
  }  
  public void addItem(Pellets pellet){
    items.add(pellet);
    pellet.setBounds(rows, cols);
    //if(pac.getLayerInfo(rows, cols)==pellet.getLayerInfo(rows, cols)){
    //  items.remove(pellet);
    //}
  }
 
  public void show() {
    pushMatrix();
    translate(x_pos, y_pos);
    for (int j=0; j< rows; j++) {
      for (int i=0; i < cols; i++) {
        int xAt = i*cellSize;
        int yAt = j*cellSize;

        //todo: think about what color we want
        //fill( ? )
        //stroke( ? ) //border color
        //strokeWeight( ? ) // thickness of cell border
      //  fill(255);
        //noStroke();
        rect(xAt, yAt, cellSize, cellSize);
        drawLayerCell(j, i, xAt, yAt);
        //fill(30);
        
      }
    }
    
    //Draw each item on the board
    for(BoardItem item: items){
        int xAt = item.col()*cellSize;
        int yAt = item.row()*cellSize;
        item.show(xAt, yAt, cellSize);
        //if(pac.getLayerInfo(rows, cols)==pellet.getLayerInfo(rows, cols)){
        //  items.remove(pellet);
        //}
    }

    popMatrix();
  }  

  protected void drawLayerCell(int rowId, int colId, int xPos, int yPos) {
    colorMode(RGB, 360, 100, 100);
    blue = color(0, 50, 255);
    Pellets pellet = new Pellets(rowId, colId);
    
    if (mazeLayout != null) {
      if (mazeLayout.length > rowId) {
        if (mazeLayout[rowId].length > colId) {
      //for( rowId=0; rowId < mazeLayout.length; rowId++){
      //  for ( colId = 0; colId< mazeLayout[rowId].length; colId++){
          int cellColor = mazeLayout[rowId][colId];
          if(cellColor == 8){
            cellColor = blue;
            rect(xPos, yPos, cellSize, cellSize);
          }else if(cellColor==1){
            cellColor=0;
            rect(xPos, yPos, cellSize, cellSize);
          }else if(cellColor==3){
            cellColor = blue;
            rect(xPos, yPos, cellSize, cellSize);
          }else if(cellColor==50){
            cellColor = blue;
            rect(xPos, yPos, cellSize, cellSize);
          }
          fill(cellColor);
          rect(xPos, yPos, cellSize, cellSize);
          
          if(cellColor== blue){
            fill(255);
            pellet.show(xPos, yPos);
            //ellipse(xPos+12, yPos+10, 10, 10);
          }           
        }
      }
    }
    
    //change 8 to 7 when pac man enters
    
    
    //rect(xPos, yPos, cellSize, cellSize);
    
    
    
    //if (layer != null) {
    //  if (layer.length > rowId) {
    //    if (layer[rowId].length > colId) {
    //      int cellColor = layer[rowId][colId];
    //      if(cellColor == 8){
    //         //fill black
    //         fill(0);
    //         rect(xPos, yPos, cellSize, cellSize);
    //        // fill(yellowishcololr)
    //        //ellipse()
    //      } else if (cellColor == 1){
    //         //fill(mazeColorValue)
    //         rect(xPos, yPos, cellSize, cellSize);
            
    //      } else if (cellColor == 50){
            
    //      }
    //      fill(cellColor);
    //      stroke(1);
    //      rect(xPos, yPos, cellSize, cellSize);
    //    }
    //  }
    //}
  }
  
  public int getLayerInfo(int row, int col){ //<>//
      return mazeLayout[row][col];
  }

  public Cell getCell(int xClicked, int yClicked) {
    xClicked = xClicked - x_pos;
    yClicked = yClicked - y_pos;

    int xAt = xClicked/cellSize;
    int yAt = yClicked/cellSize;

    return new Cell(yAt, xAt);
  }

  public void addLayer(int[][] theLayer) {
    this.mazeLayout = theLayer;
  }
}
