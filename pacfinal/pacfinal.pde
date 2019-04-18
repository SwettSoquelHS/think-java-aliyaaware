// pac man
PImage rGhost;
import java.util.ArrayList;
Maze theMaze;
Pacman item1;
Pellets pellet;
//ArrayList<Pellets> poop = new ArrayList();
Ghost[] ghosts;

int radius = 15;
int direction = 1;
int direction2 = 0;
 
float x = 250;
float y = 250;

void setup() {
  size(800, 900);
  int cellSize = 26;
  theMaze = new Maze(50, 50, 30, 26, cellSize);
  item1 = new Pacman(7, 7);
  theMaze.addItem( item1 );

  pellet= new Pellets((int)random(width), (int)random(height));
  theMaze.addPellet(pellet);
  //for (int i=0; i<50; i++) {
  //  Pellets P = new Pellets((int)random(width), (int)random(height));
  //  poop.add(P);
  //}
  
}  


void draw() {
background(0);
  theMaze.show();
  smooth();
  noStroke();
  //for (int i=0;i<poop.size();i++) {
  //  Pellets Pn = (Pellets) poop.get(i);
  //  Pn.show();
  //  //if (dist(x, y, Pn.x, Pn.y)<radius) {
  //  //  poop.remove(i);
  //  //  radius=radius+1;
  //  //}
  //}
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
}
boolean MOVE_LEFT;  //User is pressing <-
boolean MOVE_RIGHT; //User is pressing ->
boolean MOVE_UP; //User is pressing ^ arrow
boolean MOVE_DOWN;
boolean SPACE_BAR;  
