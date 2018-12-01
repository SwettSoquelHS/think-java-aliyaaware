
	// FarmAnimal is the base case (or super class)
	// for all animals that can live on a farm.

public class FarmAnimal{

	protected String name;
	
	public FarmAnimal(String name){
		this.name = name;
	}

	public void makeSound(){
		System.out.println("I don't know what to say yet. ");
	}

	public void feedMe(){
		System.out.println("I have been fed.");
	}

	public String whatAmI(){

		return this.getClass().getName();
	}

	public String gerrName(){
		return name;
	}
}