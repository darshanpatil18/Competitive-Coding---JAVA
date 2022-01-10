import java.util.*;
class MyCalculator
{
    public long power (int n, int p) throws Exception
    {
        if (n<0 || p<0)
        {
            throw new Exception("n and p should not be negative");
        }
        else if (n==0 && p==0)
        {
            throw new Exception("n and p should not be be zero");
        }
        else
        {
            return ((long)Math.pow(n,p));
        }
    }
}
class Calci
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("INPUT THE FIRST NUMBER: ");
        int n = in.nextInt();
        System.out.print("INPUT THE SECOND NUMBER: ");
        int p = in.nextInt();
        MyCalculator c = new MyCalculator();
        try 
        {
        long ans = c.power(n, p);
        System.out.println(n+"^"+p+"="+ans);
        }
        catch (Exception e) 
        {
        System.out.println(e);
        }
    }
}