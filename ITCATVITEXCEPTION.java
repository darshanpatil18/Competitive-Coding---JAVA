import java.util.*;
class InvalidCatException extends Exception
{
    InvalidCatException(String s)
    {
        super(s);
    }
}
class InvalidQuizException extends Exception
{
    InvalidQuizException(String s)
    {
        super(s);
    }
}
public class ITCATVITEXCEPTION 
{
    static void validateCat(int marks) throws InvalidCatException
    {
        if (marks<0 || marks>100)
        throw new InvalidCatException("CAT marks entry Not Valid");
        else
        System.out.println("Valid CAT marks entry");
    }
    static void validateQuiz(int marks) throws InvalidCatException
    {
        if (marks<0 || marks>10)
        throw new InvalidCatException("Quiz marks entry Not Valid");
        else
        System.out.println("Valid Quiz marks entry");
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of students for whom marks is to be entered: ");
        int n=in.nextInt();
        int[] cat=new int[n];
        int[] quiz=new int[n];
        System.out.println("\nEnter the marks details");
        for (int i=0;i<n;i++)
        {
            System.out.print("\nEnter CAT marks for student "+(i+1)+" : ");
            cat[i]=in.nextInt();
            try{
                validateCat(cat[i]);
            }
            catch(Exception e)
            {
                System.out.println(e);
                System.out.println("Marks entered should be between 0 and 100");
            }
            System.out.print("Enter Quiz marks for student "+(i+1)+" : ");
            quiz[i]=in.nextInt();
            try{
                validateQuiz(quiz[i]);
            }
            catch(Exception e)
            {
                System.out.println(e);
                System.out.println("Marks entered should be between 0 and 10");
            }
        }
    }
}
