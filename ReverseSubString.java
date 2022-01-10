public class ReverseSubString
{
    public static void validate(String s,int a,int b)
    {
        if(s.length()==0)
        {
            throw new NullPointerException("Length of the String is zero");
        }
        if (a<0 || b<0)
        {
            throw new ArithmeticException("Negative numbers are not allowed");
        }
        if (a<0 || b>s.length())
        {
            throw new ArrayIndexOutOfBoundsException("The integers entered should br within the length of the string");
        }
    }
    public static void main(String[] args) throws Exception
    {
        String s=args[0];
        int a=Integer.parseInt(args[1]);
        int b=Integer.parseInt(args[2]);
        validate(s,a,b);
        String str=s.substring(a,b+1);
        String rev="";
        for (int i=0;i<str.length();i++)
        {
            rev=str.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}