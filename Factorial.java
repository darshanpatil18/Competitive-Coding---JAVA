import java.util.*;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a,i,fact=1;
		System.out.println("Enter a number to find the factorial:");
		a=in.nextInt();
		for (i=2;i<=a;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+a+" = "+fact);
	}
}
