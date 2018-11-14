public class Movie{

	public static void main(String[] args){
		System.out.println("Welome to the movie app!");
		Movie[] catalog = new Movie[100];

		// Movie object instances
		Movie starWars = new Movie("Star Wars", 1977);
		Movie sWars = new Movie("Star Wars", 1977);

		//Move bladeRunner = new Movie("Blade Runner", 1929);
		if(starWars == sWars){
			System.out.println("Zuh?");
		} else {
			System.out.println("Same idea but different references.");
		}

		if (starWars.equals(sWars)){
			System.out.println("they are the same");
		}

		System.out.println(starWars);
		int a =7;
		mungeMovie(starWars, a);
		// a will still be 7 after this call
		System.out.println(starWars);
		
	}

	public static void mungeMovie(Movie m, int i){
		// both of these are changing the parameters
		m.year = 1978;
		i = 10;
	}
	//member or instance variables
	String movieTitle;
	int year;

	//movie constructor
	public Movie(String title, int year){
		movieTitle = title;
		this.year = year;
	}

	public boolean equals(Movie m){
		if(this.year == m.year && movieTitle.equals(m.movieTitle))
			return true;
		return false;
	}

	public String toString(){
		return "[" + movieTitle + ", " + year +"]";
	}

}
 