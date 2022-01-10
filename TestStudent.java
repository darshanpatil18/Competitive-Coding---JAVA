import java.util.*;
abstract class Student
{
    String name;
    String status;
    String telephone;
    Student(String name,String status,String telephone)
    {
        this.name=name;
        this.status=status;
        this.telephone=telephone;
    }
    public abstract double amountPaid();
    public String display()
    {
        return ("Name of Student: "+name +"\nStatus: "+status+"\nTelephone: "+telephone);
    }
}
class FullTimeStudent extends Student
{
    FullTimeStudent(String name,String status,String telephone)
    {
        super(name, status, telephone);
    }
    public double amountPaid()
    {
        return 2000.0;
    }
    public String display()
    {
        return super.display()+"\nAmount Paid: $"+amountPaid();
    }
}
class PartTimeStudent extends Student
{
    int hours;
    PartTimeStudent(String name,String status,String telephone,int hours)
    {
        super(name, status, telephone);
        this.hours=hours;
    }
    public double amountPaid()
    {
        return 200.0*hours;
    }
    public String display()
    {
        return super.display()+"\nAmount Paid: $"+amountPaid();
    }
}
public class TestStudent 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int n=in.nextInt();
        int i;
        for (i=0;i<n;i++)
        {
            System.out.print("Enter 1 for FullTimeStudent OR 2 for PartTimeStudent: ");
            int c=in.nextInt();
            in.nextLine();
            if (c==1)
            {
                String status="FullTime";
                System.out.println("Enter name and telephone number of the student: ");
                String name=in.nextLine();
                String tele=in.nextLine();
                FullTimeStudent a1=new FullTimeStudent(name, status, tele);
                String s=a1.display();
                System.out.println("Displaying details about the student: ");
                System.out.println(s);
            }
            else if(c==2)
            {
                String status="PartTime";
                System.out.println("Enter name,telephone number and credit hours of the student: ");
                String name=in.nextLine();
                String tele=in.nextLine();
                int credit=in.nextInt();
                PartTimeStudent a2=new PartTimeStudent(name, status, tele, credit);
                String s1=a2.display();
                System.out.println("Displaying details about the student: ");
                System.out.println(s1);
            }
        }
    }
}