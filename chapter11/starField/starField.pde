Star s1;
Star[] stars;

void setup(){
  size (800,600);
  background(0);
  frameRate(4);
  stars = new Star[1000];
  for (int i=0; i < stars.length; i++){
    int x =(int)(2*width*Math.random());
    int y=(int)(2*height*Math.random());
    int r =(int)(5*Math.random())+2;
    stars[i] = new Star(x,y,r);
  }


  s1 = new Star(width/2, height/2,3);
}

void draw(){
  s1.show();
  
  for (int i=0; i < stars.length; i++){
    stars[i].show();
  }
}


class Star{
  float x_pos;
  float y_pos;
  float radius;
  
 public Star(float x, float y, float radius){
    x_pos = x;
    y_pos =y;
    this.radius = radius;
  }
  
  void show(){
    pushMatrix();
    translate(x_pos, y_pos);
    fill(251,255,227);
    ellipse(0,0,radius,radius);
    
    popMatrix();
  }

}
