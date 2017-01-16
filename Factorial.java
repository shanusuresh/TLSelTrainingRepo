//Factorial
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial for: ");
		int facNum=scan.nextInt();
		int facResult=1;
		for(int i=1;i<=facNum;i++)
		{
			facResult=facResult*i;
		}
		System.out.println("The factorial of "+ facNum+" is "+facResult);
	}
}