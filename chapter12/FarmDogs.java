public class FarmDogs extends FarmAnimal{
	public FarmDogs(String name){
		super(name);
	}

	public void makeSound(){
		System.out.println("Woof. ");
	}

	public void feedMe(){
		super.feedMe();
		System.out.println(">Wags tail<");
	}
}