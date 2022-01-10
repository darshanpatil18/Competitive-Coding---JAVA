import java.util.*; 
import Pack1.Words;
import Pack1.Pack2.Length; 
public class Main
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in); System.out.print("Enter a text: "); String n=in.nextLine();
Length b=new Length(); int l=b.strLength(n);
System.out.println("Total length of the text = "+l); Words a=new Words();
int w=a.countNumWords(n);
System.out.println("Number of Words in the Text = "+w);
}
}
