public class Tile {
	
	public static void main(String[] args) 
	{
		Tile t = new Tile(10, 'p');
	    System.out.println(t); 
	}
  private int value;
  private char letter;
  
  public Tile(int value, char letter) {
    this.letter = letter;
    this.value = value;
  }
   
  public void setLetter(char letter){
    this.letter = letter;
  }
  
  public char getLetter(){
    return this.letter;
  }
  
  public void setValue(int value){
    this.value = value;
  }
  
  public int getValue(){
    return this.value;
  }
  
  public static void printTile(Tile t){
    System.out.println("Tile (letter: " + t.letter + ", value: " + t.value + ")");
    
  }
  public static Tile testTile(){
    return new Tile(10, 'z');
  }
  
  public boolean equals(Object o) {
    Tile that = (Tile) o;
    return this.letter == that.letter && this.value == that.value;
  }

  public String toString(){
      return "" + this.value + "-" + this.letter;
  }

}

