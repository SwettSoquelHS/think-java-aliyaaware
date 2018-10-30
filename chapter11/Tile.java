public class Tile{
	

	public static void main (String[] args){
		int value = 7;
		char letter = 'a';
		Tile t  = new Tile(value, letter);
		System.out.println("Test: " + t.letter + t.value);
	}

	class Tile(char letter, int value){
		this.letter= letter;
		this.value = value;
	}

	class printTile(){
		System.out.println("letter = " + letter);
		System.out.println("value o it  " + value);
	}
	void setLetter(char character){

	}
	char getLetter(){

	}
	void setValue(int value){

	}
	int getValue(){
		
	}

	char letter;
	int value;
}