import java.util.Scanner;

public class Exercise2{
	public static void main(String[] args){
		
		double celcius;

		Scanner input = new Scanner(System.in);
		// prompt user input
		System.out.print("Enter a temperature in Celcius: ");
		celcius = input.nextDouble();

		// math for conversion
		double farenheit = (double) celcius*(9/5)+32;

		//print resulr
		System.out.print(farenheit + " F");


	}
}