import java.util.*;
class sumofdig
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b,d,sum=0;
		System.out.println("Enter a 4 digit number:");
		a=in.nextInt();
		b=a;
		while(a>0)
		{
			d=a%10;
			sum+=d;
			a/=10;
		}
		System.out.println("Sum of the digits of the number "+b+" = "+sum);
	}
}