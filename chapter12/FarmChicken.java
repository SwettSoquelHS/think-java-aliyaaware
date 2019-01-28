public class FarmChicken extends FarmAnimal{
	public FarmChicken(String name){
		super(name);
	}

	@vOerride
	public void makeSound(){
		System.out.println("Cluck like a chicken...");

		super.makeSound();
	}

}