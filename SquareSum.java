import java.util.*;
class SquareSum
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,i,sum=0;
		System.out.println("Enter the value of n:");
		n=in.nextInt();
		for (i=1;i<=n;i++)
		{
			sum+=(i*i);
		}
		System.out.println("Sum of Square of the numbers upto "+n+" = "+sum);
	}
}
