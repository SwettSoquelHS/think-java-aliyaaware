public class Farm
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Farm!");

		FarmAnimal animal = new FarmAnimal("Bessie");
		animal.makeSound();
		animal.feedMe();


		FarmCow cow = new FarmCow("Sandy");
		cow.makeSound();
		cow.feedMe();

		FarmChicken chicken = new FarmChicken("MR. W");
		chicken.makeSound();
		chicken.feedMe();

		FarmDogs dog = new FarmDogs("hello");
		dog.makeSound();
		dog.feedMe();


		FarmAnimal[] allTheAnimals = new FarmAnimal[10];
		allTheAnimals[0] = cow;
		allTheAnimals[1] = chicken;
		allTheAnimals[2] = dog;
		for (FarmAnimal a: allTheAnimals)
		{
			if(a!=null)
			{
				System.out.println("This is a: " + a.whatAmI() + "it's name is: ");
				a.feedMe();
				a.makeSound();
			}
		}
	

		FarmHand lenny = new FarmHand("Lenny");
		FarmHand george = new FarmHand("George");

		lenny.feedTheAnimals(allTheAnimals);
	}
}