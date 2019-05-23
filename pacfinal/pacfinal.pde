Board theBoard;
BoardItem item1;
Pacman pac;
Maze maze;
  int direction = 1;
  int direction2 = 0;
  int x = 250; 
  int y = 250; 

int[][] layer = {
  {0, 255, 125, 9, 2, 15, 24, 45, 150}, 
  {100, 100, 100, 9}, 
  {0, 0, 0}, 
  {#8F2CB7}
};

int[][] mazeLayout= {
  /*1= wall
  8 = pellet
  50 = super pellet
  0 = blank
  */
    //1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},//1
     {1,8,8,8,8,8,8,8,8,8,8,8,8,1,1,8,8,8,8,8,8,8,8,8,8,8,8,1},//2
     {1,8,1,1,1,1,8,1,1,1,1,1,8,1,1,8,1,1,1,1,1,8,1,1,1,1,8,1},//3
     {1,50,1,1,1,1,8,1,1,1,1,1,8,1,1,8,1,1,1,1,1,8,1,1,1,1,50,1},//4
     {1,8,1,1,1,1,8,1,1,1,1,1,8,1,1,8,1,1,1,1,1,8,1,1,1,1,8,1},//5
     {1,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,1},//6
     {1,8,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,8,1},//7
     {1,8,1,1,1,1,8,1,1,8,8,8,8,1,1,8,8,8,8,1,1,8,1,1,1,1,8,1},//8
     {1,8,8,8,8,8,8,1,1,8,8,8,8,1,1,8,8,8,8,1,1,8,8,8,8,8,8,1},//9
     {1,1,1,1,1,1,8,1,1,1,1,1,8,1,1,8,1,1,1,1,1,8,1,1,1,1,1,1},//10
     {1,1,1,1,1,1,8,1,1,1,1,1,8,1,1,8,1,1,1,1,1,8,1,1,1,1,1,1},//11
     {1,1,1,1,1,1,8,1,1,8,8,8,8,8,8,8,8,8,8,1,1,8,1,1,1,1,1,1},//12
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1},//13
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1},//14
     {3,3,3,3,3,3,3,3,8,8,1,1,1,1,1,1,1,1,8,8,8,3,3,3,3,3,3,3},//15
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1},//16
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1},//17
     {1,1,1,1,1,1,8,1,1,8,8,8,8,8,8,8,8,8,8,1,1,8,1,1,1,1,1,1},//18
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1},//19
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,8,1,8,1,1,1,1,1,1},//20
     {1,8,8,8,8,8,8,8,8,8,8,8,8,1,1,8,8,8,8,8,8,8,8,8,8,8,8,1},//21
     {1,8,1,1,1,1,8,1,1,1,1,1,8,1,1,8,1,1,1,1,1,8,1,1,1,1,8,1},//28
     {1,8,1,1,1,1,8,1,1,1,1,1,8,1,1,8,1,1,1,1,1,8,1,1,1,1,8,1},//23
     {1,50,8,8,1,1,8,8,8,8,8,8,8,1,1,8,8,8,8,8,8,8,1,1,8,8,50,1},//24
     {1,1,1,8,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,8,1,1,1},//25
     {1,1,1,8,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,8,1,1,1},//26
     {1,8,8,8,8,8,8,1,1,8,8,8,8,1,1,8,8,8,8,1,1,8,8,8,8,8,8,1},//27
     {1,8,1,1,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,1,1,8,1},//28
     {1,8,1,1,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,1,1,8,1},//29
     {1,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,1},//30
     {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},//31

};

void setup() {
  size(800, 900);
  int cellSize = 26;
  theBoard = new Board(50, 50, 31, 28, cellSize);

  item1 = new BoardItem(2, 5);
  int[][] item1Data = 
   {{-1, 0, -1}, 
    { 0, 0, 0}, 
    {-1, 0, -1}};
  item1.setData(item1Data);
  theBoard.addItem( item1 );
  theBoard.addLayer( layer );
  //theBoard.addLayer( mazeLayout );
  
  pac = new Pacman(7,7);
  pac.setData(item1Data);
  theBoard.addItem(pac);
  
  //maze = new Maze(7,7);
  //theBoard.addItem(maze);
}

void draw() {
  background(255);
  theBoard.show();
}

    
void keyPressed(){
  if (key == CODED) {
    if (keyCode == LEFT) {
      MOVE_LEFT = true;
      direction= -1;
      direction2 = 0;
      item1.updateCol(-1);
      pac.updateCol(direction);
        
    } else if ( keyCode == RIGHT ) {
      MOVE_RIGHT = true;
      direction = 1;
      direction2 = 0;
      item1.updateCol(1);
      pac.updateCol(direction);
         
    } else if (keyCode == UP) {
      MOVE_UP = true;
      direction = 0;
      direction2 = -1;
      item1.updateRow(-1);
      pac.updateRow(direction2); 
       
    } else if (keyCode == DOWN) {
      MOVE_DOWN = true;
      direction = 0;
      direction2 = 1;
      item1.updateRow(1);
      pac.updateRow(direction2);
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
    
