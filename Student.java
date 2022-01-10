import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.print("Enter the number of students: \n");
        n=in.nextInt();
        in.nextLine();
        String[] regno=new String[n];
        String[] name=new String[n];
        Double[] cgpa=new Double[n];
        String[] prog=new String[n];
        String[] scl=new String[n];
        String[] proc=new String[n];
        System.out.println("Enter the Student Details: ");
        for (i=0;i<n;i++)
        {
            System.out.print("Enter Registration Number of Student "+(i+1)+" : ");
            regno[i]=in.nextLine();
            System.out.print("Enter Name of Student "+(i+1)+" : ");
            name[i]=in.nextLine();
            System.out.print("Enter CGPA of Student "+(i+1)+" : ");
            cgpa[i]=in.nextDouble();
            in.nextLine();
            System.out.print("Enter Programme Name of Student "+(i+1)+" : ");
            prog[i]=in.nextLine();
            System.out.print("Enter School Name of Student "+(i+1)+" : ");
            scl[i]=in.nextLine();
            System.out.print("Enter Procter Name of Student "+(i+1)+" : ");
            proc[i]=in.nextLine();
            System.out.println("\n");

        }
        System.out.println("\n");
        System.out.println("Display the Student Details: ");
        for (i=0;i<n;i++)
        {
            System.out.println("Registration Number of Student "+(i+1)+" : "+regno[i]);
            System.out.println("Name of Student "+(i+1)+" : "+name[i]);
            System.out.println("CGPA of Student "+(i+1)+" : "+cgpa[i]);
            System.out.println("Programme Name of Student "+(i+1)+" : "+prog[i]);
            System.out.println("School Name of Student "+(i+1)+" : "+scl[i]);
            System.out.println("Procter Name of Student "+(i+1)+" : "+proc[i]);
        }
    }
}
