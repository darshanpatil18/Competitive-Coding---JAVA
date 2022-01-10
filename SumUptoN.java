import java.util.*;
class SumUptoN
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,i,sum=0;
		System.out.println("Enter the value of n:");
		n=in.nextInt();
		for (i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of numbers upto "+n+" = "+sum);
	}
}
		