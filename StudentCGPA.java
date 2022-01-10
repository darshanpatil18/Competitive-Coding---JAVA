import java.io.*;
import java.util.*;
class Student implements Serializable
{
    String regno,name,proctor;
    double cgpa;
    Student(String regno, String name, double cgpa, String proctor)
    {
        this.regno=regno;
        this.name = name;
        this.cgpa = cgpa;
        this.proctor = proctor;
    }
    public void display()
    {
        System.out.println("Student Registration No: "+regno+"\nName : " + name + "\nCGPA :" + cgpa + "\nProctor : " + proctor);
    }
}
public class StudentCGPA
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        int n=in.nextInt();
        in.nextLine();
        Student students[] = new Student[n];
        String regno,name,proctor;
        double cgpa;
        int a=0,b=0,c=0;
        for(int i=0;i<n;i++) 
        {
            System.out.print("Enter Registration No of Student "+(i+1)+" : ");
            regno=in.nextLine();
            System.out.print("Enter Name of Student "+(i+1)+" : ");
            name=in.nextLine();
            System.out.print("Enter CGPA of Student "+(i+1)+" : ");
            cgpa=in.nextDouble();
            in.nextLine();
            System.out.print("Enter Proctor of Student "+(i+1)+" : ");
            proctor=in.nextLine();
            students[i] = new Student(regno,name,cgpa,proctor);
            System.out.println();
        }
        String filename = "Students_Data.txt";
        try
        {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student[] savedStudents = (Student[])ois.readObject();
            fis.close();
            ois.close();
            for(Student d: savedStudents)
            {
                d.display();
                if(d.cgpa*10 >=90)
                {
                    System.out.println("Grade : A");
                    a++;
                }
                else if(d.cgpa*10 >=70 && d.cgpa*10 <90)
                {
                    System.out.println("Grade : B");
                    b++;
                }
                else if(d.cgpa*10 >=50 && d.cgpa*10 <70)
                {
                    System.out.println("Grade : C");
                    c++;
                }
                System.out.println();
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Number of Students in A grade category : "+a);
        System.out.println("Number of Students in B grade category : "+b);
        System.out.println("Number of Students in C grade category : "+c);
    }
}