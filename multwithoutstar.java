import java.io.*;
import java.util.*;
class multwithoutstar{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the 1st number");
int a=sc.nextInt();
System.out.println("Enter the 2nd number");
int b=sc.nextInt();
 int c=0;
for(int i=0;i<b;i++)
{
c=c+a;
}
System.out.println("The Multiplication of two numbers is "+c);
}
}