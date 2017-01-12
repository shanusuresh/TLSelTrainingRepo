//Print tables
import java.util.Scanner;
public class Tables{
	public static void main(String[] args)
	{
		int i,j,tableNum;
		Scanner scan=new Scanner(System.in);
		tableNum=scan.nextInt(); //Get the table number user want to print
		if(tableNum>1)
		{
		for(i=1;i<=20;i++)
		{
			j=i*tableNum;
			System.out.println(i+"*"+tableNum+"="+j);//print in format of 1*2=2
		}
		}
		else
		{
			System.out.println("Enter a positive number");
		}
		
	}	
	
	
}