import java.util.*;
class Val{
	
	Val(){
		try{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Int val,Enter float val,String val,char");
			int n=sc.nextInt();
			float num=sc.nextFloat();
			String s=sc.next();
			System.out.println(+n+num+s);
		}
		catch(NumberFormatException io){}

	}

	public static void main(String args[]){
		Val ob=new Val();

	}
}