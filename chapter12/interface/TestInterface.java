public class TestInterface{ 
	public static void main(String[] args){
		Animal a = new Animal();

		Animal dog = new BullDog("Fido");
		Breed someAnimal = (Breed) new BullDog("spot");

		System.out.println(dog);
		printBreed((Breed)dog);

		LockJaw lockjaw = new LockJaw("lockjaw");
		System.out.println(lockjaw); 

		if (lockjaw instanceof Mythical){
			Mythical m = (Mythical) lockjaw;
			System.out.println("Origin: " + m.getOrigin());
			System.out.println("Desc: " + m.getDesc());
		}
	
	}

	public static void printBreed(Breed aBreed){
		System.out.println(aBreed.getBreed() );
	}

}