import java.util.Scanner;

public class Assignment2_1
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in); 
		double n,r,guess;
		System.out.println("Enter the number:");
		n=input.nextDouble();
		guess=n/2;

		for(double i=0;i<5;i++)
		{
			r=n/guess;
			guess=(guess+r)/2;
		}

		System.out.printf("The guess for the square root of"+n+"\n"+"is"+"%.2f.%n",guess);
	}
}
