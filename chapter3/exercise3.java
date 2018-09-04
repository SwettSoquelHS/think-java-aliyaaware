import java.util.Scanner;

public class exercise3{
	public static void main(String[] args){
		int ogSeconds, seconds, minutes, hours, nSeconds;

		Scanner input = new Scanner(System.in);

		System.out.print("How many seconds do you want to convert? ");
		seconds = input.nextInt();

		ogSeconds = seconds;

		minutes = seconds/60;
		seconds = seconds%60;

		hours = minutes/60;
		seconds = seconds%60;

		nSeconds = seconds%60;

		System.out.print(ogSeconds + " seconds = " + hours + " hours, " + minutes + " minutes, " + nSeconds + " seconds"); 
	}
}