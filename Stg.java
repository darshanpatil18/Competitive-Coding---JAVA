import java.util.*;
class Stg{
	String s="Hi";
	void find(){	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String val=sc.next();
		StringBuffer b=new StringBuffer(val);
		StringBuffer rev=new StringBuffer();
		rev=b.reverse();
		System.out.println(rev);

		String c=val.toUpperCase();
		System.out.println(c);	
		
		if(s.equals(val)){
			System.out.println("Entered strings are equal..");
		}
	}
	public static void main(String args[]){
		Stg o=new Stg();
		o.find();
	}
}