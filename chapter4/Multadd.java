

public class Multadd
{

	//this is what all of my values in main will run through
	public static double multadd(double a, double b, double c)
	{
		return (a * b + c);
	}

	//this should take values and run multadd through it?
	public static double expSum(double x)
	{
		double a = x;
		double b = Math.exp(-x);
		double c = Math.sqrt(1-b);
		double help = multadd(a,b,c);
		return help;

		//x e−x + √1 − e−x
	}

	public static void main(String[] args)
	{
		// practice trial
		double hi = multadd(1.0, 2.0, 3.0);
		System.out.println(hi);

		// adding the sin and cos problems
		double x = Math.cos(Math.PI/4.0);
		double y = 0.5;
		double z = Math.sin(Math.PI/4.0);
		double complexHi = multadd(x, y, z);
		System.out.println(complexHi);

		// adding logs 
		double m= 1;
		double n = Math.log(10);
		double o = Math.log(20);
		double logadder = multadd(m, n, o);
		System.out.println(logadder);


		//this is expsum printer
		double help = expSum(5.0);
		System.out.println(help);
	
	}

}