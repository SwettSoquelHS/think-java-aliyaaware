public class FarmCow extends FarmAnimal{

	public FarmCow(String name){
		super(name);
	}

	public void makeSound(){
		System.out.println(name + "says mooooo.");
	}
}