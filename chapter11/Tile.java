public class Tile{
	

	public static void main (String[] args){
		//int value = 7;
		//char letter = 'a';
		Tile t2 = testTile();
		t2.setValue(20);
		printTile(t2);		
		System.out.println(t2.equals(testTile()) +" "+t2.getLetter());
	}
	private char letter;
	private int value;

	public Tile(char letter, int value){
		this.letter= letter;
		this.value = value;
	}

	public static void printTile(Tile t){
		System.out.println("letter = " + t.letter + "value of it  " + t.value);
	}
	public static Tile testTile(){
		Tile t  = new Tile('z', 10);
		printTile(t);
		return t;
	}
	public String toString(){
      return "A tile with "+this.letter+" and "+this.value;
   }
   public boolean equals(Tile that){
      return this.letter == that.letter && this.value == that.value;
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

}