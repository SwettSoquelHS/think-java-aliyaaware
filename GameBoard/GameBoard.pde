Board theBoard;
BoardItem item1;
TriangleItem tItem1;
Sticky stickGuy;

int[][] layer = {
  {0, 255, 125, 9, 10, 15, 24, 45, 150}, 
  {100, 100, 100, 9}, 
  {0, 0, 0}, 
  {#8F2CB7}
};

void setup() {
  size(1200, 800);
  int cellSize = 10;
  int boardCols = (width-100)/cellSize;
  int boardRows = (height-100)/cellSize;
  theBoard = new Board(50, 50, boardRows, boardCols, cellSize);

  item1 = new BoardItem(2, 5);
  int[][] item1Data = 
   {{-1, 0, -1}, 
    { 0, 0, 0}, 
    {-1, 0, -1}};
  item1.setData(item1Data);
  theBoard.addItem( item1 );
  theBoard.addLayer( layer );
  
  tItem1 = new TriangleItem(1,1);
  tItem1.setData(item1Data);
  theBoard.addItem(tItem1);
  
  stickGuy = new Sticky(7,7);
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


//void keyPressed(){
//  if (key == CODED) {
//    if (keyCode == LEFT) {
//      MOVE_LEFT = true;
//      item1.updateCol(-1);
//    } else if ( keyCode == RIGHT ) {
//      MOVE_RIGHT = true;
//      item1.updateCol(1);
//    } else if (keyCode == UP) {
//      MOVE_UP = true;
//      item1.updateRow(-1);
//    } else if (keyCode == DOWN) {
//      MOVE_DOWN = true;
//      item1.updateRow(1);
//      println(tItem1.getVanguard(1,2));
//    }
//  }

//  //32 is spacebar
//  if (keyCode == 32) {  
//    SPACE_BAR = true;
//  }
//}
//boolean MOVE_LEFT;  //User is pressing <-
//boolean MOVE_RIGHT; //User is pressing ->
//boolean MOVE_UP; //User is pressing ^ arrow
//boolean MOVE_DOWN;
//boolean SPACE_BAR;  


void keyPressed() {
  
  if (key == CODED) {
    if (keyCode == UP) {
      doUpKey();
       println(tItem1.getVanguard('u'));
    } else if (keyCode == DOWN) {
      doDownKey();
      println(tItem1.getVanguard('d'));
    } else if (keyCode == LEFT) {
      doLeftKey();
      println(tItem1.getVanguard('l'));
    } else if (keyCode == RIGHT) {
      doRightKey();
      println(tItem1.getVanguard('r'));
    }
  }
}

void doUpKey(){
  item1.updateRow(-1);
  tItem1.updateRow(-1);
}

void doDownKey(){
  item1.updateRow(1);
  tItem1.updateRow(1);
}

void doLeftKey(){
  item1.updateCol(-1);
  tItem1.updateCol(-1);
}

void doRightKey(){
  item1.updateCol(1);
  tItem1.updateCol(1);
}
