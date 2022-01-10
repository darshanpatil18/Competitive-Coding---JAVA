import java.util.*; 
interface Sum
{

public static void print(int n) { int sum=0;
for(int i=1; i<=n;i++) { sum+=i;
}
System.out.println("Sum of first "+n+" natural numbers = "+sum);
}
}

interface Fact
 
{
public static void print(int n) { int fact=1;
for(int i=1; i<=n;i++) { fact*=i;
}
System.out.println("Factorial of "+n+" is: "+fact);
}
}

public class MultipleInheritance implements Sum,Fact
{

public void print(int n)
{

Sum.print(n); Fact.print(n);
}
public static void main(String[] args) { MultipleInheritance ob = new MultipleInheritance(); Scanner in = new Scanner(System.in); System.out.print("Enter value of n : ");
int n = in.nextInt(); ob.print(n);
in.close();
}
}
