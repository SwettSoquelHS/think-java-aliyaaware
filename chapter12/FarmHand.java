public class FarmHand{
	private String name;

	public FarmHand(String name){
		this.name = name;
	}
	public void feedTheAnimals(FarmAnimal[] animalsToFeed){
		for (FarmAnimal animal: animalsToFeed){
			if (animal!= null){
				animal.feedMe();
			}
		}
	}
}