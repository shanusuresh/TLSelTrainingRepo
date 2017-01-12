import java.util.Scanner;

public class ArmstrongNumber{
	public static void main(String[] args)
	{
		int n, a,c=0,temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to check Armstrong or not: ");
		n=scan.nextInt();
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(c==temp)
		{
			System.out.println("The number is armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
	}
}