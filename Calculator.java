//Version 1.0
/*INCOMPLETE*/

import java.util.Scanner;

public class Calculator
{
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
