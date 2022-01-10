import java.util.*;
class Armstrong 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a,x,y,d,c=0,sum=0;
		System.out.println("Enter a number to check for Armstrong:");
		a=in.nextInt();
		x=a;
		y=a;
		while(x>0)
		{
			c++;
			x/=10;
		}
		while (y>0)
		{
			d=y%10;
			sum+=Math.pow(d,c);
			y/=10;
		}
		if (a==sum)
		System.out.println(a+" is an Armstrong number");
		else
		System.out.println(a+" is not an Armstrong number");
	}
}
		