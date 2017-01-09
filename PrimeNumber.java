/*1. Find whether the given number is prime or not. {30-45}
Tips : 
int i = 17;
a) Loop from 2 to n-1 -> for(int i=2; i <n;i++)
b) Check if it is divisible by the number (i) using mod (%)
c) if the remainder is 0, then comeout (break)
d) if no breaks, then it is prime
*/
import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args)
	{
		int n;
		boolean isPrimeNum;		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to verify prime or not:");
		n=scan.nextInt();
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0){
				isPrimeNum=false;
				break;
			}
			else
			{
				isPrimeNum=true;
			}
			
		}
		if(isPrimeNum)
		{
			System.out.println("The number is prime");
		}
		else{
			
			System.out.println("The number is not prime number");
		}
		
	}
}
