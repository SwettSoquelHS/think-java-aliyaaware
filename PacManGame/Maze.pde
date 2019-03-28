public class Maze {

  int x_pos, y_pos;  
  int cellSize;
  int rows, cols;
  int[][] layer;
  ArrayList<BoardItem> items;

  public Maze(int x, int y, int numRows, int numCols, int cellSize ) {
    x_pos = x;
    y_pos = y;
    this.cellSize = cellSize;
    rows = numRows;
    cols = numCols;
    layer = null;
    items = new ArrayList<BoardItem>();
  }

  public void addItem(BoardItem item){
    items.add(item); 
    item.setBounds(rows, cols);
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
        fill(255);
        stroke(9);
        strokeWeight(1);
        rect(xAt, yAt, cellSize, cellSize);
        drawLayerCell(j, i, xAt, yAt);
        //drawWalls();  
      }
    }
    
    //Draw each item on the board
    for(BoardItem item: items){
        int xAt = item.col()*cellSize;
        int yAt = item.row()*cellSize;
        item.show(xAt, yAt, cellSize);      
    } 
    drawWalls();
    
    popMatrix();
  }
  protected void drawWalls(){
    //top wall
    stroke(#00AD54);
    strokeWeight(4);
    beginShape();
    //leftside
    line(0, 0,0,259);
    line(157,260,0,259);
    line(157,260,157,337);
    line(157,337,0,337);
    //top wall
    line(0,0,677,0);
    //right side
    line(677, 0,677,259);
    line(520,260,677,259);
    line(520,260,520,337);
    line(520,337,677,337);
    
    // INNER WALL OF THE TOP HALF
    
    //leftside
    line(26,26,26,233);
    line(181,234,26,233);
    line(181,234,181,363);
    line(181,363,26,363);
    //top wall
    line(26,26,651,26);
    //right side
    line(651, 26,651,234);
    line(494,234,651,234);
    line(494,234,494,363);
    line(494,363,651,363);
    endShape();
    
    
    
    //BOTTOM wall
    
    beginShape();
    //leftside bottom
    line(0, 0,0,259);
    line(157,260,0,259);
    line(157,260,157,337);
    line(157,337,0,337);
    //BOTTOM wall
    line(677,677,0,677);
    //right side bottom
    line(677, 0,677,259);
    line(520,260,677,259);
    line(520,260,520,337);
    line(520,337,677,337);
    
    // INNER WALL OF THE BOTTOM HALF
    
    //leftside
    line(26,26,26,233);
    line(181,234,26,233);
    line(181,234,181,363);
    line(181,363,26,363);
    //bottom wall
    line(26,26,651,26);
    //right side
    line(651, 26,651,234);
    line(494,234,651,234);
    line(494,234,494,363);
    line(494,363,651,363);
    endShape();
  }
  

  protected void drawLayerCell(int rowId, int colId, int xPos, int yPos) {
    if (layer != null) {
      if (layer.length > rowId) {
        if (layer[rowId].length > colId) {
          int cellColor = layer[rowId][colId];
          fill(cellColor);
          rect(xPos, yPos, cellSize, cellSize);
        }
      }
    }
  }


  public Cell getCell(int xClicked, int yClicked) {
    xClicked = xClicked - x_pos;
    yClicked = yClicked - y_pos;

    int xAt = xClicked/cellSize;
    int yAt = yClicked/cellSize;

    return new Cell(yAt, xAt);
  }

  public void addLayer(int[][] theLayer) {
    this.layer = theLayer;
  }
}
