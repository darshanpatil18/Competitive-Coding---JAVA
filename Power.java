import java.util.*;
class Power
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,p;
		System.out.println("Enter the Number:");
		n=in.nextInt();
		System.out.println("Enter the Power:");
		p=in.nextInt();
		double res=Math.pow(n,p);
		System.out.println("Value of "+n+"^"+p+" = "+String.format("%.0f",res));
	}
}

		