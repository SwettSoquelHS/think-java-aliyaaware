public class Maze {
  PShape s;
  int x_pos, y_pos;  
  int cellSize;
  int rows, cols;
  int[][] layer;
  int radius;
  ArrayList<Pacman> pac = new ArrayList();
  //Pacman pac;
  //ArrayList<Pellets> pellet;
  ArrayList<Pellets> poop = new ArrayList();

  public Maze(int x, int y, int numRows, int numCols, int cellSize ) {
    x_pos = x;
    y_pos = y;
    this.cellSize = cellSize;
    rows = numRows;
    cols = numCols;
    layer = null;
    radius = 50;
    //pac = new ArrayList<Pacman>();
    //pellet = new ArrayList<Pellets>();
  }
  
   public int getRadius(){ return radius; }

  public void addItem(Pacman pacman){
    pac.add(pacman); 
    pacman.setBounds(rows, cols);
  }
  public void addPellet(Pellets food){
    //pellet.add(food);
    //food.setBoundsFood(rows, cols);
    for(int i=0; i<cols;i++){    
      for (int j=1; j<rows; j++) {
        food.setBoundsFood(cols, rows);
        food = new Pellets((int)random(height)*26, (int)random(width));
        poop.add(food);
      }
    }
  }
  
  public void removePellet(Pellets food){
    int pacPos = radius;
    for(int i=0; i<poop.size();i++){    
        if (dist(x, y, food.x_pos, food.y_pos)< pacPos){
          poop.remove(food);
        }
      //  poop.remove(food);
    }
  }

  public void show() {
      //Pacman pacs = (Pacman) pac.get(radius);
     for (int i=0;i<poop.size();i++) {
      Pellets Pn = (Pellets) poop.get(i);
      
      Pn.show();
      if (dist(x, y, Pn.x_pos, Pn.y_pos)==0) {
        poop.remove(i);
      }
      //Pacman pacm = (Pacman) pac.get(y_pos);
      //pacm.show(x_pos, y_pos);
      ////Pacman y = (Pacman) pac.get(y_pos);
      ////if (pacm.radius== Pn.x_pos && pacm.radius == Pn.y_pos){
      //if (dist(pacm.x_pos, pacm.y_pos, Pn.x_pos, Pn.y_pos)== 0){
      //  poop.remove(i);
      //}

    }
    
    pushMatrix();
    translate(x_pos, y_pos);
    
    //Draw each item on the board
    for(Pacman pacman: pac){
        int xAt = pacman.col()*cellSize;
        int yAt = pacman.row()*cellSize;
        pacman.show(xAt, yAt);
        //radius = pac.getRadius();
    }
    
    for(Pellets food: poop){
       food.show();
    }
      
    drawWalls();

    //shape(s, x, y);
    
    popMatrix();
  }
  protected final void drawWalls(){
    //TOP WALL
    stroke(#00AD54);
    strokeWeight(4);
    fill(0,0,10);
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
    
    // inner wall of top half
    
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
    line(cellSize*(rows-11),(rows-14)*cellSize,cellSize*cols,cellSize*(rows-14));
    line(cellSize*(rows-11),(rows-14)*cellSize,cellSize*(cols-7),cellSize*(rows-9));
    line(cellSize*(cols-7),cellSize*(rows-9),cellSize*(cols-1),cellSize*(rows-9));
    line(cellSize*(cols-1),cellSize*(rows-9), cellSize*(cols-1), cellSize*(cols+3));
    //BOTTOM wall
    line(0, cellSize*rows,cellSize*cols, cellSize*(cols+4));
    //right side bottom
    line(0, cellSize*(rows-14),cellSize*(cols-19),cellSize*(rows-14));
    line(cellSize*(cols-19),cellSize*(rows-14),cellSize*(cols-19),cellSize*(rows-9));
    line(rows -1, cellSize*(rows-9),cellSize*(cols-19),cellSize*(rows-9));
    line(rows -1, cellSize*(rows-9),rows-1, cellSize*(rows-1));
    
    // INNER WALL OF THE BOTTOM HALF
    
    //leftside
    line(cellSize*(cols), cellSize*(rows-10),cellSize*cols, cellSize*(cols+4));
    line(cellSize*(cols-6),cellSize*(rows-10),cellSize*(cols), cellSize*(rows-10));
    line(cellSize*(cols-6),cellSize*(rows-13),cellSize*(cols-6),cellSize*(rows-10));
    line(cellSize*(cols),cellSize*(rows-13),cellSize*(cols-6),cellSize*(rows-13));
    //bottom wall
    line(rows-1, cellSize*(rows-1),cellSize*(cols-1), cellSize*(cols+3));
    //right side
    line(0, cellSize*(rows-13),cellSize*(cols-20),cellSize*(rows-13));
    line(cellSize*(cols-20),cellSize*(rows-13),cellSize*(cols-20),cellSize*(rows-10));
    line(0, cellSize*(rows-10),cellSize*(cols-20),cellSize*(rows-10));
    line(0, cellSize*(rows-10),0, cellSize*(rows));
    
       
    endShape();
   
    s = createShape();
    s.beginShape();
    s.fill(0, 0, 255);
    s.noStroke();
    s.vertex(0, 0);
    s.vertex(0, 50);
    s.vertex(50, 50);
    s.vertex(50, 0);
    s.endShape(CLOSE);
       
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
