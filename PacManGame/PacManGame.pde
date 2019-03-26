// pac man
import java.util.ArrayList;
Maze theMaze;
Board theBoard;
BoardItem item1;
//ActiveCells activeCell; 

void setup() {
  size(800, 900);
  int cellSize = 26;
  int boardCols = (width-100)/cellSize; //27 columns
  int boardRows = (height-100)/cellSize; //30 rows
  theMaze = new Maze(50, 50, boardRows,boardCols, cellSize);
 

  item1 = new BoardItem(2, 5);
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
