import java.util.Scanner;

public class Assignment2_2
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		double tax=0.0625;
		String[] item = new String[3];
		int[] quantity = new int[3];
		double[] price = new double[3];
		double[] itemtotal = new double[3];
		double sub=0, salestax, total;

		for(int i=0;i<3;i++)
		{
			System.out.println("Input name of item "+(i+1)+":");
			item[i]=input.nextLine();
			
			System.out.println("Input quantity of item "+(i+1)+":");
			quantity[i]=input.nextInt();
			
			System.out.println("Input price of item "+(i+1)+":");
			price[i]=input.nextDouble();
			
			input.nextLine();
			itemtotal[i] = quantity[i] * price[i];
		}
		
		for(int t=0;t<3;t++)
		{
			sub+=itemtotal[t];
		}
		
		salestax= sub*tax;
		total=sub+salestax;

		System.out.println("Your bill:");
		System.out.printf("%-30s %-10s %-10s %-10s%n", "Item", "Quantity", "Price", "Total");
		System.out.printf("%-30s %-10s %-10.2f %-10.2f%n", item[0], quantity[0], price[0], itemtotal[0]);
		System.out.printf("%-30s %-10s %-10.2f %-10.2f%n", item[1], quantity[1], price[1], itemtotal[1]);
		System.out.printf("%-30s %-10s %-10.2f %-10.2f%n", item[2], quantity[2], price[2], itemtotal[2]);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Subtotal", "", "", sub);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "6.25% sales tax", "", "", salestax);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Total", "", "", total);		
	}

}	
		