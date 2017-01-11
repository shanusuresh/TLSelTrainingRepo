/*even numbers between 100 to 200

for(i=100;i<=200;i++)
if (i%2==0) then print the number as even
*/

public class EvenNumbers{
	
	public static void main(String[] args)
	{
		int num;
		System.out.println("Even numbers between 100 and 200 are: ");
		for(int i=100;i<=200;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}
}

