//Version 1.0
/*COMPLETE*/

import java.util.Scanner;

public class Calculator
{
	/*Most of the variables are defined right here this makes it so these are accessable by any type of class.
	* I also set the code to permanently modify each variable for the current session running. So what you type in will
	*cause one of these to change.
	*/
	public static long result = 0;
	public static int NumberOne = 0;
	public static int NumberTwo = 0;
	public static String Choose = "";
	public static void FirstNumber()
	{
		Scanner OneEnt = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		NumberOne = OneEnt.nextInt();
	}
	public static void SecondNumber()
	{
		Scanner TwoEnt = new Scanner(System.in);
		System.out.print("Please enter your second number: ");
		NumberTwo = TwoEnt.nextInt();
		System.out.println("Second Number");
	}
	public static void MASD()
	{
		Scanner MASD = new Scanner(System.in);
		System.out.print("Declare if you want to (M)ultiply, (S)ubtract, (A)dd, or (D)ivide: ");
		//System.out.print("M, A, S, or D?: ");
		String chosen = "";
		chosen = MASD.nextLine();
		Choose = chosen.toUpperCase();
		switch (Choose)
		{
		case "M":
			result = NumberOne * NumberTwo;
			break;

		case "A":
			result = NumberOne + NumberTwo;
			break;

		case "S":
			result = NumberOne - NumberTwo;
			break;

		case "D":
			result = NumberOne / NumberTwo;
			//These will not return a decimal they will only return the whole number.
			break;
		}
		System.out.println(result);
	}
	public static void main(String[] args)
	{
		FirstNumber();
		SecondNumber();
		MASD();
	}
}
