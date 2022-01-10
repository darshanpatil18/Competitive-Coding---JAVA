import java.util.*;
import java.io.*;

class Employee {
    String empname;
    String empid;
    double salary;
    String date;
    Employee(String empname,String empid,double salary,String date)
    {
        this.empname=empname;
        this.empid=empid;
        this.salary=salary;
        this.date=date;
    }
    public static void display(Employee[] a)
    {
        int i,l;
        l=a.length;
        for (i=0;i<l;i++)
        {
            if (a[i].salary<100000)
            {
                System.out.println("Employee name: "+a[i].empname);
                System.out.println("Employee ID: "+a[i].empid);
            }
        }
    }
    public static void sort(Employee[] a)
    {
        int i,j,l;
        l=a.length;
        for  (i=0;i<l-1;i++)
        {
            for (j=0;j<l-i-1;j++)
            {
                if (a[j].salary > a[j+1].salary)
                {
                    double temp=a[j].salary;
                    a[j].salary=a[j+1].salary;
                    a[j+1].salary=temp;

                    String x=a[j].empname;
                    a[j].empname=a[j+1].empname;
                    a[j+1].empname=x;

                    String y=a[j].empid;
                    a[j].empid=a[j+1].empid;
                    a[j+1].empid=y;

                    String z=a[j].date;
                    a[j].date=a[j+1].date;
                    a[j+1].date=z;
                }
            }
        }
        System.out.println("Displaying the Employee details based on salary in ascending order: ");
        for (i=0;i<l;i++)
        {
            System.out.println(i+1+") "+a[i].empname+" "+a[i].empid+" "+a[i].salary+" "+a[i].date);
        }
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.print("Enter the number of Employees: ");
        n=in.nextInt();
        Employee[] arr=new Employee[n];
        System.out.println("Enter the employee details\n");
        in.nextLine();
        for (i=0;i<n;i++)
        {
            System.out.println("Enter the name,id,salary,date of joining for employee "+(i+1)+" : ");
            String name=in.nextLine();
            String id=in.nextLine();
            double s=in.nextDouble();
            in.nextLine();
            String d=in.nextLine();
            arr[i]=new Employee(name,id,s,d);
        }
        System.out.println("\n");
        System.out.println("Displaying the emp-name and emp-id of employees who have salary less than INR100000: ");
        Employee.display(arr);
        System.out.println("\n");
        Employee.sort(arr);
    }
}