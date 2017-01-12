//Write Java program to find the second smallest number without sorting
/*pseudocode:
1. Define an array with values as {10,1,3,11}
2. Find the size of the array and store it in a variable
3. Iterate - for(int i=0;i<n;i++)
4. Store first number(a[i] in temp1 and second number a[i+1] in temp2
5. If (temp1<temp2) stpre temp1 as

*/

public class SecondSmallestNumber{
	public static void main(String[] args)
	{
		int[] numArr={10,1,3,2};
		int temp1,temp2;
		int smallnum=numArr[0];
		for(int i=0;i<numArr.length;i++)
		{
			
			if(numArr[i]<smallnum)
			{
				smallnum=numArr[i];
			}
		}
		
		int sec_smallnum=numArr[0];
		for(int i=0;i<numArr.length;i++)
		{
			if(numArr[i]<sec_smallnum && numArr[i]!=smallnum)
			{
				sec_smallnum=numArr[i];
			}
		}
		
		System.out.println("Smallest number is:" + sec_smallnum);
	}
}