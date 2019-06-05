public class Board {

  int x_pos, y_pos;  
  int cellSize;
  int rows, cols;
  //int[][] layer;
  color blue;
  color blue2;
  int count =0;
  boolean power = false;
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
    blue2 = color(0,51,255);
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
          }else if (cellColor==7|| cellColor ==10){
            cellColor = blue2;
            rect(xPos, yPos, cellSize, cellSize);
          }else if(cellColor==1){
            cellColor=0;
            rect(xPos, yPos, cellSize, cellSize);
          }else if(cellColor==3){
            cellColor = blue;
            rect(xPos, yPos, cellSize, cellSize);
          }else if(cellColor==50){
            fill(blue2);
            //ellipse(xPos+12, yPos+10, 10, 10);
            rect(xPos, yPos, cellSize, cellSize);
            power= true;
          }
          fill(cellColor);
          rect(xPos, yPos, cellSize, cellSize);
          
          if(cellColor== blue){
            pellet.show(xPos, yPos);
            //ellipse(xPos+12, yPos+10, 10, 10);
          }
          if(cellColor==50){
            fill(blue2);
            rect(xPos, yPos, cellSize, cellSize);
            fill(225);
            ellipse(xPos+12, yPos+10, 20, 20);
            //pac.is_super();
          }
          if (cellColor==7 || cellColor ==10){
            cellColor = blue;
          }
        }
      }
    } 
    //fill(0);
    //rect(100,100,100,100);
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
