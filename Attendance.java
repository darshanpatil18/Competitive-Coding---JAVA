import java.util.*;
public class Attendance
{
public static void main(String[] args)
{
    int i,j;
    double c=0.0,total=0.0,percent;
    Scanner in=new Scanner(System.in);
    int[][] arr=new int[3][];
    arr[0]=new int[12];
    arr[1]=new int[10];
    arr[2]=new int[8];
    System.out.println("Enter 1 for Present and 0 for Absent");
    for (i=0;i<3;i++)
    {
        System.out.print("Enter attendance for "+arr[i].length+" instructional days: ");
        for (j=0;j<arr[i].length;j++)
        {
            arr[i][j]=in.nextInt();
        }
    }
    for (int[] arr1D:arr)
    {
        for (int a:arr1D)
        {
            if (a==1)
            c++;
        }
    }
    System.out.println("Number of days present= "+c);
    total =12+10+8;
    System.out.println("Total number of days= "+total);
    percent=(c/total);
    System.out.println("Attendance Percentage= "+(percent*100)+"%");
}
}