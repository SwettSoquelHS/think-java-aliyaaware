public class Tile{
	

	public static void main (String[] args){
		int value = 1;
		char letter = 'a';
		Tile t  = new Tile(value, letter);


		printTile(letter);
	}
	char letter;
	int value;

	public Tile(char letter, int value){
		this.letter= letter;
		this.value = value;
	}

	static void printTile(Tile t){
		System.out.println(t.letter + " - "+ t.value);
	}

	static void testTile(Tile t){

	}

	public String toString(Tile m){
		System.out.println("letter = " + letter);
		System.out.println("value o it " + value);
	}
	// void setLetter(char character){

	// }
	// char getLetter(){

	// }
	// void setValue(int value){

	// }
	// int getValue(){

	// }

}