//Fibonacci series
public class FibonacciSeries{
	public static void main(String[] args)
	{
		int firstnum=0, secondnum=1;
		int num,i;
		System.out.println("The fibonacci series are: "+firstnum+" "+secondnum);
		
		for(i=1;i<20;i++)
		{
			while(secondnum<100)
			{
			num=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=num;
			System.out.println(" "+firstnum);
			}
			
		}
	}
}