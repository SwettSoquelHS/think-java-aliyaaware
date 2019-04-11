// pac man
PImage rGhost;
import java.util.ArrayList;
Maze theMaze;
Board theBoard;
Pacman item1;
Ghost[] ghosts;
 
boolean to_corners = false;
int timer_corners;
 
color[] ghost_colors = {
  color(255, 0, 0), 
  color(255, 64, 196), 
  color(0, 255, 255), 
  color(255, 128, 0), 
  color(0, 255, 0), 
};
 


void setup() {
  size(800, 900);
  int cellSize = 26;
  //int boardCols = (width-100)/cellSize; //27 columns
  //int boardRows = (height-100)/cellSize; //30 rows
  theMaze = new Maze(50, 50, 30, 26, cellSize);
  
  //rGhost = loadImage("download.png");
  
  item1 = new Pacman(7, 7);
  theMaze.addItem( item1 );
  
  
}  


void draw() {
background(255);
  theMaze.show();
  smooth();
  noStroke();
  //image(rGhost,0,0);
}


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
  
  if ( key == ' ') { 
    to_corners = !to_corners;
  }
  if ( key == 'd' )
    item1.die();
  if ( key == 'r' )
    game_reset();
}
boolean MOVE_LEFT;  //User is pressing <-
boolean MOVE_RIGHT; //User is pressing ->
boolean MOVE_UP; //User is pressing ^ arrow
boolean MOVE_DOWN;
boolean SPACE_BAR;  

void game_reset() {
  item1.die();
  //ghosts_reset();
}

//void ghosts_reset() {
//  // Could write a proper reset for the ghosts.
//  for (int i=0; i<ghosts.length; i++)
//    ghosts[i] = new Ghost(i);
//}
 
