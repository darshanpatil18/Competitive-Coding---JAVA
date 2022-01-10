import java.util.*;
class Swap
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a,b,t;
		System.out.println("Enter the first number(A):");
		a=in.nextInt();
		System.out.println("Enter the second number(B):");
		b=in.nextInt();
		System.out.println("Value of A and B before swapping = "+a+" and "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("Value of A and B after swapping = "+a+" and "+b);
	}
}
		