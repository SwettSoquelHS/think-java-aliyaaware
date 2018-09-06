import java.util.Scanner;

public class MakingChange{
	public static void main(String[] args){
		Scanner console = new Scanner (System.in);
		
		//Take user input for price and set it to price variable
		System.out.print("Price in cents? ");
		int price = console.nextInt();
		
		// take user input for amount paid and set it to amountPaid variable
		System.out.print("Amount paid in cents? ");
		int amountPaid = console.nextInt();

		int change = amountPaid - price;

		int dollars = change/100;
		change = change%100;

		int quarters = change/25;
		change = change%25;

		int dimes = change/10;
		change = change%10;

		int nickels = change/5;
		change = change%5;

		int pennies = change/1;


		//leave off lines with 0
		

		//this will show the output
		System.out.println("Change = " + (amountPaid - price) + " cents");

		//print dollars
		if (dollars != 0 && quarters!=1)
		{
			System.out.println(dollars + " Dollars");
		}else if (dollars==1)
		{
			System.out.println(dollars + " Dollar");
		}


		// print quarters
		if (quarters!= 0 && quarters!=1)
		{
			System.out.println(quarters + " Quarters");
		}else if (quarters==1)
		{
			System.out.println(quarters + " Quarter");
		}



		// print dimes
		if (dimes != 0 && dimes != 1)
		{
			System.out.println(dimes + " Dimes");
		}else if (dimes==1)
		{
			System.out.println(dimes + " Dime");
		}



		// print nickles
		if (nickels != 0 && nickels != 1)
		{
			System.out.println(nickels + " Nickels");
		}else if (nickels == 1)
		{
			{
				System.out.println(nickels + " Nickel");
			}
		}



		// print pennies
		if (pennies != 0 && pennies != 1)
			{
				System.out.println(pennies + " Pennies");
			}else if (pennies == 1)
			{
				{
					System.out.println(pennies + " Penny");
				}
			}
		
	}
}