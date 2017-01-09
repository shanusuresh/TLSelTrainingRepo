//Program to find whether the given number is odd or even
/*
Pseudocode:
1. Get the user input and store it in an int variable 'var'
2. If (var%2==0) then print the given input is even number
3. Else print the given input is odd number
4. Put a try catch block to handle the exception if a string is passed

*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class OddOrEven{
	
	public static void main(String[] args)
	{
		//int a=111;
		Scanner scan=new Scanner(System.in);
		try{
		System.out.println("Enter a number");
		int var=scan.nextInt();
		
		if(var%2==0)
		{
			System.out.println("The given value: "+var+ "is a even number");
		}
		else
		{
			System.out.println("The given value: "+var+ " is a odd number");
		}
		}
		catch(Exception e){
			System.out.println("The given value is a not a number");
		}
	}
}

