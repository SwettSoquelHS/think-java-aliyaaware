public class Board {

  int x_pos, y_pos;  
  int cellSize;
  int rows, cols;
  int[][] layer;
  int[][] mazeLayout;
  ArrayList<BoardItem> items;;
  //ArrayList<Maze> mazeLayout = new ArrayList();

  public Board(int x, int y, int numRows, int numCols, int cellSize ) {
    x_pos = x;
    y_pos = y;
    this.cellSize = cellSize;
    rows = numRows;
    cols = numCols;
    layer = null;
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
   public void addItem(Maze maze){
    items.add(maze);
    maze.setBounds(rows, cols);
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
        rect(xAt, yAt, cellSize, cellSize);
        drawLayerCell(j, i, xAt, yAt);
        fill(30);
        drawMazeLayout(j, i, xAt, yAt);
      }
    }
    
    //Draw each item on the board
    for(BoardItem item: items){
        int xAt = item.col()*cellSize;
        int yAt = item.row()*cellSize;
        item.show(xAt, yAt, cellSize);      
    }
    
    //for(Maze maze: mazeLayout){
    //  maze.show();
    //}

    popMatrix();
  }  

  protected void drawLayerCell(int rowId, int colId, int xPos, int yPos) {
    if (layer != null) {
      if (layer.length > rowId) {
        if (layer[rowId].length > colId) {
          int cellColor = layer[rowId][colId];
          fill(cellColor);
          stroke(1);
          rect(xPos, yPos, cellSize, cellSize);
        }
      }
    }
  }
  
  protected void drawMazeLayout(int rowId, int colId, int xPos, int yPos){
    if (mazeLayout != null) {
      for(int row=0; row < mazeLayout.length; row++){
        for (int col = 0; col< mazeLayout[row].length; col++){
          if(mazeLayout[row][col]==1){
            fill(299);
          }
          fill(0,0,100);
        }
      }
      rect(xPos, yPos, cellSize, cellSize);
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
  public void addMazeLayer(int[][] theLayout) {
    this.mazeLayout = theLayout;
  }
}
