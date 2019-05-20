Board theBoard;
BoardItem item1;
Pacman pac;
Maze maze;

int[][] layer = {
  {0, 255, 125, 9, 10, 15, 24, 45, 150}, 
  {100, 100, 100, 9}, 
  {0, 0, 0}, 
  {#8F2CB7}
};

void setup() {
  size(800, 900);
  int cellSize = 26;
  theBoard = new Board(50, 50, 30, 26, cellSize);

  item1 = new BoardItem(2, 5);
  int[][] item1Data = 
   {{-1, 0, -1}, 
    { 0, 0, 0}, 
    {-1, 0, -1}};
  item1.setData(item1Data);
  theBoard.addItem( item1 );
  theBoard.addLayer( layer );
  
  pac = new Pacman(7,7);
  //pac.setData(item1Data);
  theBoard.addItem(pac);
  
  //maze = new Maze(7,7);
  //theBoard.addItem(maze);
}

void draw() {
  background(255);
  theBoard.show();
}

void mousePressed() {
  //mouseX, mouseY
  println(theBoard.getCell(mouseX, mouseY));
  item1.updateCol(1);
}





// pac man
//PImage rGhost;
//import java.util.ArrayList;
//Maze theMaze;
//Pacman pac;
//Pellets pellet;
//ArrayList<Pellets> poop = new ArrayList();
//Ghost[] ghosts;

////int radius = 15;
//int direction = 1;
//int direction2 = 0;
 
//int x = 250;
//int y = 250;

//void setup() {
//  size(800, 900);
//  int cellSize = 26;
//  theMaze = new Maze(50, 50, 30, 26, cellSize);
//  pac = new Pacman(7, 7);
//  theMaze.addItem( pac );

//  pellet= new Pellets((int)random(width)*2, (int)random(height)*30);
//  theMaze.addPellet(pellet);
//  //for (int i=0; i<50; i++) {
//  //  Pellets P = new Pellets((int)random(width), (int)random(height));
//  //  poop.add(P);
//  //}
  
//}  


//void draw() {
//background(0);
//  theMaze.show();
//  smooth();
//  noStroke();
//  for (int i=0;i<poop.size();i++) {
//    Pellets Pn = (Pellets) poop.get(i);
//    Pn.show();
//    if (dist(pac.getRow(), y, Pn.x_pos, Pn.y_pos)<pac.getRadius()) {
//      poop.remove(i);
//      //radius=radius+1;
//    }
//  }
//}


void keyPressed(){
  if (key == CODED) {
    if (keyCode == LEFT) {
      MOVE_LEFT = true;
      item1.updateCol(-1);
        
    } else if ( keyCode == RIGHT ) {
      MOVE_RIGHT = true;
      item1.updateCol(1);
         
    } else if (keyCode == UP) {
      MOVE_UP = true;
      item1.updateRow(-1);
       
    } else if (keyCode == DOWN) {
      MOVE_DOWN = true;
      item1.updateRow(1);
    }
  }

  //32 is spacebar
  if (keyCode == 32) {  
    SPACE_BAR = true;
  }
}
boolean MOVE_LEFT;  //User is pressing <-
boolean MOVE_RIGHT; //User is pressing ->
boolean MOVE_UP; //User is pressing ^ arrow
boolean MOVE_DOWN;
boolean SPACE_BAR;  
