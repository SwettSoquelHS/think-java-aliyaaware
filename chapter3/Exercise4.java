import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in); 

    	System.out.println("Im thinking of a number between 1-100, can you guess it?");

    	System.out.print("Type a number : ");
    	int guess = in.nextInt();

    	System.out.println("Your Guess is " + guess);


        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("THe number I was thinkin of is: " + number);

        System.out.println("You were off by: " + (Math.abs(number-guess)));
    }
}