import java.util.*;
class DivThreeFive
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter a number to check if it is divisible by 3 and 5:");
		n=in.nextInt();
		if (n%3==0 && n%5==0)
		System.out.println(n+" is divisible by both 3 and 5");
		else if (n%3==0)
		System.out.println(n+" is divisible by 3 but not by 5");
		else if (n%5==0)
		System.out.println(n+" is divisible by 5 but not by 3");
		else
		System.out.println(n+" is not divisible by both 3 and 5");
	}
}
