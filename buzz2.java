import java.util.*;
class buzz2{
	
	buzz2()throws NumberFormatException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
			
		int rem0=num%10;
		int quo10=num%7;
		if(rem0==7 || quo10==0){
			System.out.println("Entered Number is Buzz number");
		}
		else 
			System.out.println("Entered Number is not Buzz number");
	}

	public static void main(String args[]){
		buzz2 ob=new buzz2();

	}

}