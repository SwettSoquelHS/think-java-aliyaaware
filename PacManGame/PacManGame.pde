// pac man
import java.util.ArrayList;
Maze theMaze;
Board theBoard;
BoardItem item1;
//ActiveCells activeCell; 

int radius = 12;
int direction = 1;
int direction2 = 0;
 
float x = 250;
float y = 250;

void setup() {
  size(800, 900);
  int cellSize = 26;
  //int boardCols = (width-100)/cellSize; //27 columns
  //int boardRows = (height-100)/cellSize; //30 rows
  theMaze = new Maze(50, 50, 30, 26, cellSize);
 

  item1 = new BoardItem(7, 7);
  int[][] item1Data = 
   {{-1, 0, -1}, 
    { 0, 0, 0}, 
    {-1, 0, -1}};
  item1.setData(item1Data);
  theMaze.addItem( item1 );
}  


void draw() {
  background(255);
  theMaze.show();
  smooth();
  noStroke();
  render();
}

//void mousePressed() {
//  //mouseX, mouseY
//  println(theBoard.getCell(mouseX, mouseY));
//  item1.updateCol(1);
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


 
void render() {
  for ( int i=-1; i < 2; i++) {
    for ( int j=-1; j < 2; j++) {
      pushMatrix();
      translate(x + (i * width), y + (j*height));
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
}
