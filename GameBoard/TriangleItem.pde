public class TriangleItem extends BoardItem {

  private float rotateAngle;

  public TriangleItem(int rowAt, int colAt) {
    super(rowAt, colAt);
    rotateAngle = 0.0;
  }

  public void show(int xAt, int yAt, int cellSize) {
    for (int row = 0; row < glyphData.length; row++) {
      for (int col = 0; col < glyphData[row].length; col++) {
        int fillColor = glyphData[row][col];
        if (fillColor > -1) {
          fill(fillColor);
          int x = xAt + col*cellSize;
          int y = yAt + row*cellSize;

          //spinning triangles!
          // if x, y is the upper left corner
          // then 
          pushMatrix();
          beginShape();
          for (int i = 0; i < 3; i++) {
            float xP = x + cellSize/2.0 + cellSize/2.0*cos(radians(i*120 +rotateAngle));
            float yP = y + cellSize/2.0 + cellSize/2.0*sin(radians(i*120 +rotateAngle));
            vertex(xP, yP);
          }
          endShape();
          popMatrix();
        }
      }
    }
    rectMode(CORNER);
    rotateAngle += 2.01;
  }
}
