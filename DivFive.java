import java.util.*;
class DivFive
{
	public static void main(String[] args)
	{
		int i,sum=0;
		System.out.println("Odd numbers divisible by 5 from the range of integers 200 to 800 are:");
		for (i=201;i<800;i+=2)
		{
			if (i%5==0)
			System.out.println(i);
		}
	}
}
		