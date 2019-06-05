Board theBoard;
BoardItem item1;
Pacman pac;
Maze maze;
Pellets pellet;
ArrayList<BoardItem> items =new ArrayList<BoardItem>();
  int direction = 1;
  int direction2 = 0;
  int x = 250; 
  int y = 250; 
color blue;

//int[][] layer = {
//  {0, 255, 125, 9, 2, 15, 24, 45, 150}, 
//  {100, 100, 100, 9}, 
//  {0, 0, 0}, 
//  {#8F2CB7}
//};

int[][] mazeLayout= {
  /*1= wall
  8 = pellet
  50 = super pellet
  0 = blank
  */
    //1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},//1
     {1, 8, 8, 8, 8,8,8,8,8,8,8,8,8,1,1,8,8,8,8,8,8,8,8,8,8,8,8,1},//2
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
     {1,3,3,3,3,3,8,8,8,8,1,1,1,1,1,1,1,1,8,8,8,8,3,3,3,3,3,1},//15
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1},//16
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1},//17
     {1,1,1,1,1,1,8,1,1,8,8,8,8,8,8,8,8,8,8,1,1,8,1,1,1,1,1,1},//18
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1},//19
     {1,1,1,1,1,1,8,1,1,8,1,1,1,1,1,1,1,1,8,8,1,8,1,1,1,1,1,1},//20
     {1,8,8,8,8,8,8,8,8,8,8,8,8,1,1,8,8,8,8,8,8,8,8,8,8,8,8,1},//21p     {1,8,1,1,1,1,8,1,1,1,1,1,8,1,1,8,1,1,1,1,1,8,1,1,1,1,8,1},//28
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
  theBoard = new Board(50, 50, 30, 28, cellSize);
  
  item1 = new BoardItem(2, 5);
  int[][] item1Data = 
   {{-1, 0, -1}, 
    { 0, 0, 0}, 
    {-1, 0, -1}};
  item1.setData(item1Data);
  //theBoard.addItem( item1 );
  pellet = new Pellets(x, y);
  item1.setData(item1Data);
  
  //drawing them maze
  colorMode(RGB, 360, 100, 100);
  blue = color(0, 50, 255);
  //int wall =0;
  //for(int row=0; row < mazeLayout.length; row++){
  //    for (int col = 0; col< mazeLayout[row].length; col++){
  //      if(pac.getLayerInfo(row, col)==pellet.getLayerInfo(row, col)){
  //        items.remove(pellet);
  //      }
  //      if(mazeLayout[row][col]==1){
  //        mazeLayout[row][col]= blue;
  //      }else if(mazeLayout[row][col]==8){
  //        pellet.show(row, col, 0);
  //        mazeLayout[row][col]= 0;
  //        //theBoard.addItem(pellet);
  //      }else if(mazeLayout[row][col]==3){
  //        mazeLayout[row][col]= 0;
  //      }
  //      fill(#8F2CB7);
    //  }
    //}
  theBoard.addLayer( mazeLayout );
  //if(pac.getLayerInfo(rows, cols)==pellet.getLayerInfo(rows, cols)){
  //  items.remove(pellet);
  //}
  
  //drawing 
  pac = new Pacman(1,1);
  pac.setData(item1Data);
  theBoard.addItem(pac);
}

void draw() {
  background(255);
  theBoard.show();
  
  
}

    
void keyPressed(){
  if (key == CODED) {
    if (keyCode == LEFT) {
      int r =pac.row();
      int i = pac.col()-1;
      int lInfo = theBoard.getLayerInfo(r,i);
      if(lInfo!=1){
        MOVE_LEFT = true;
        direction= -1;
        direction2 = 0;
        item1.updateCol(-1);
        pac.updateCol(direction);
        mazeLayout[r][i]=7;
      }
        
    } else if ( keyCode == RIGHT ) {
      int r =pac.row();
      int i = pac.col()+1;
      int lInfo = theBoard.getLayerInfo(r,i);
      if(lInfo!=1){
        MOVE_RIGHT = true;
        direction = 1;
        direction2 = 0;
        item1.updateCol(1);
        pac.updateCol(direction);
        mazeLayout[r][i]=7;
      }
         
    } else if (keyCode == UP) {
      int r =pac.row()-1;
      int i = pac.col();
      int lInfo = theBoard.getLayerInfo(r,i);
      println("get" + lInfo);
      if(lInfo!=1){
        MOVE_UP = true;
        direction = 0;
        direction2 = -1;
        item1.updateRow(-1);
        pac.updateRow(direction2);
        mazeLayout[r][i]=7;
      }
      MOVE_UP = false;
    } else if (keyCode == DOWN) {
      int r =pac.row()+1;
      int i = pac.col();
      int lInfo = theBoard.getLayerInfo(r,i);
      if(lInfo!=1){
        MOVE_DOWN = true;
        direction = 0;
        direction2 = 1;
        item1.updateRow(1);
        pac.updateRow(direction2);
        mazeLayout[r][i]=7;
      }  
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
