import java.util.*;
public class Jagged {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,j;
        double t;
        int[][] arr=new int[4][];
        for(i = 0; i < arr.length; i++)
        {
            System.out.print("Enter number of students for batch " + (i+1) + ": ");
            t = in.nextDouble();
            int k=(int)Math.ceil(t/4);
            arr[i] = new int[k];
            for(j = 0; j < arr[i].length; j++,t-=4)
            {
                if(t >= 4)
                arr[i][j] = 4;
                else
                arr[i][j]=(int)t;
            }
        }
            int c = 0;
            System.out.println("Contents of 2D Jagged Array: "); 
            for (i = 0; i < arr.length; i++) 
            { 
                for (j = 0; j < arr[i].length; j++) 
                {
                    System.out.print(arr[i][j] + " ");
                    if(arr[i][j] == 4)
                    c++;
                }
            System.out.println(); 
            }
            System.out.println("Number of TUTORS with 4 students each are: " + c );           
    }
}
