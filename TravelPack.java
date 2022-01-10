import java.util.*;
class Travel
{
    public int concession(int age,String sex) throws Exception
    {
        if (sex.equals("Male") && age>65)
        {
            return 15;
        }
        else if (sex.equals("Female") && age>60)
        {
            return 20;
        }
        else
        {
            throw new Exception("Sorry!!! Conditions for concession not satisfied");
        }
    }
    public int concession(int age1,int age2) throws Exception
    {
        if (age1>21 && age2>18)
        {
            return 10;
        }
        else
        {
            throw new Exception("Sorry!!! Conditions for concession not satisfied");   
        }
    }
}
public class TravelPack 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter 1 if u want to book a single ticket OR 2 if u want to book for a couple: ");
        int n=in.nextInt();
        in.nextLine();
        Travel a=new Travel();
        if (n==1)
        {
            System.out.println("Enter your gender Male or Female: ");
            String gen=in.nextLine();
            System.out.println("Enter your age: ");
            int age=in.nextInt();
            try 
            {
            int con = a.concession(age, gen);
            System.out.println("Congratulations!!! You are eligible for a concession of "+con+"%");
            }
            catch (Exception e) 
            {
            System.out.println(e);
            }
        }
        else if(n==2)
        {
            System.out.println("Enter age for the Male: ");
            int age1=in.nextInt();
            System.out.println("Enter age for the Female: ");
            int age2=in.nextInt();
            try 
            {
            int con = a.concession(age1,age2);
            System.out.println("Congratulations!!! You are eligible for a concession of "+con+"%");
            }
            catch (Exception e) 
            {
            System.out.println(e);
            }
        }
    }
}