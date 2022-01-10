import java.util.*;
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,i,a=0,b=1,c=0;
		System.out.println("Enter the number of terms in the Fibonacci Series:");
		n=in.nextInt();
		System.out.println("Fibonacci Series upto "+n+" terms:");
		if (n==1)
		System.out.println(a);
		else
		System.out.print(a+" "+b+" ");
		for (i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
		