import java.util.*;
class DivThree
{
	public static void main(String[] args)
	{
		int i,sum=0;
		for (i=10;i<=50;i++)
		{
			if(i%3==0)
			sum+=i;
		}
		System.out.println("Sum of all numbers between 10 and 50, which are divisible by 3 is:"+sum);
	}
}
