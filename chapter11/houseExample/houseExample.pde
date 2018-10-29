//declare variables
House myHouse;
House myNewHouse;

void setup(){
  size (500,400);
  background(255);
  
  myHouse = new House(width/2, height/2);
  myNewHouse = new House(width/5, height/4);
}

void draw(){
  background (255);
  myHouse.show();
  myNewHouse.show();
  
}

void mousePressed(){
  myHouse.toggleLight();
  println("my new house lights are on? " + myNewHouse.lightOn);
}

class House{
  int x_pos,  y_pos;
  boolean lightOn;
  
  House(int x, int y){
    x_pos=x;
    y_pos=y;
    lightOn = false;
  }
  
  void toggleLight(){
    lightOn = !lightOn;
  }
  
  void show(){
  pushMatrix();
  translate(x_pos, y_pos);
  //do the draw work here
  fill(128);
  rect(0,-100,160,100);
  
  //house door
  fill(50);
  rect(40,-40,20,40);
  
  //window work
  if (lightOn){
    fill(255);
  }else{
    fill(0);
  }
 
  rect(100, -40, 30,30);
  
  popMatrix();
  }
}
