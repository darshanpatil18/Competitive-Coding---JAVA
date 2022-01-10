import java.util.*;
class Consecutive_Letters{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s,w="";
	int i,j,f,c=0;
	char x,y;
	System.out.println("Enter 10 names:");
	for(i=0;i<10;i++)
	{
		s=sc.nextLine();
		s=s.toLowerCase();
		f=0;
		for(j=0;j<s.length()-1;j++)
		{
			x=s.charAt(j);
			y=s.charAt(j+1);
			if((char)(x+1)==y)f=1;
		}
		if(f==1)c++;
		}
		System.out.println("Number of consecutive letter words="+c);
	}
}