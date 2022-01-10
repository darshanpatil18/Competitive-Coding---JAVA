import java.util.*;
public class Overload 
{
    public void sum(int[][] a)
    {
        int i,j,l,sum=0;;
        l=a.length;
        for (i=0;i<l;i++)
        {
            for (j=0;j<a[0].length;j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.println("Sum of the elements of a two dimensional array of integer numbers= "+sum);
    }
    public void sum(double[][] a)
    {
        int i,j,l;
        double sum=0.0;
        l=a.length;
        for (i=0;i<l;i++)
        {
            for (j=0;j<a[0].length;j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.println("Sum of the elements of a two dimensional array of floating point numbers= "+sum);
    }
    public static void main(String[] args)
    {
        Overload v=new Overload();
        Scanner in=new Scanner(System.in);
        int n,m,i,j;
        System.out.print("Enter the number of rows for the 2D array: ");
        n=in.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        m=in.nextInt();
        int[][] a=new int[n][m];
        double[][] b=new double[n][m];
        System.out.println("Enter the elements for the 2D integer array:");
        for (i=0;i<n;i++)
        {
            for (j=0;j<m;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the elements for the 2D floating point array:");
        for (i=0;i<n;i++)
        {
            for (j=0;j<m;j++)
            {
                b[i][j]=in.nextDouble();
            }
        }
        v.sum(a);
        v.sum(b);
    }
}
