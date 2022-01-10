import java.util.*;
class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner (System.in);
        double a,b;
        System.out.println("Enter two numbers to perform arithmetic opertions:");
        a=in.nextDouble();
        b=in.nextDouble();
		char ch;
		System.out.println("Enter + to perform Addition, - to perform Substraction, * to perform multiplication, / to perform division");
		System.out.println("Enter your choice:");
		ch=in.next().charAt(0);
		switch (ch)
		{
			case '+':
			a+=b;
            System.out.println("Addition of "+(a-b)+" and "+b+"= "+a);
			break;
			case '-':
			a-=b;
            System.out.println("Substraction of "+(a+b)+" and "+b+"= "+a);
			break;
			case '*':
			a*=b;
            System.out.println("Multiplication of "+(a/b)+" with "+b+"= "+a);
			break;
			case '/':
			a/=b;
            System.out.println("Division of "+(a*b)+" by "+b+"= "+a);
			break;
			default:
			System.out.println("Enter correct choice");
		}
    }
}