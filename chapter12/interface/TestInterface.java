public class TestInterface{ 
	public static void main(String[] args){
		Animal a = new Animal();

		Animal dog = new BullDog("Fido");

		System.out.println(dog);
		printBreed((Breed)dog);
	
	}

	public static void printBreed(Breed aBreed){
		System.out.println(aBreed.getBreed() );
	}

}