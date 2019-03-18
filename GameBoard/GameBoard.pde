Board theBoard;
BoardItem item1;
Sticky stickGuy;

int[][] layer = {
              {0, 255, 125, 144, 1444, 543, 234},
              {100, 100, 100, 9},
              {0,0,0}
              };

void setup() {
  size(1200, 800);
  int cellSize = 40;
  int boardCols = (width-500/cellSize);
  int boardRows = (width-500/cellSize);
  theBoard = new Board(20,20,height, width, cellSize);
  
  item1 = new BoardItem(2,5);
  int[][] itemData = {{255,0,255}, 
                      {0,  0,  0}, 
                      {255,0,255}
                     };
  item1.setData(itemData);
  theBoard.addItem(item1);
  theBoard.addLayer( layer);
  
  stickGuy = new Sticky(15,15);
  theBoard.addItem(stickGuy);
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
