import java.io.*;
class Num{
	public void printMenu(){
		System.out.println("Enter 1 for Palindrome Number");
		System.out.println("Enter 1 for Automorphic Number");
		System.out.println("Enter 1 for Perfect Number");
		System.out.println("Enter 1 for Armstrong Number");
		findNu();

	}
	public void findNu(){
	try{
			
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Your choice");
		String Ch=br.readLine();
		int Choice=Integer.parseInt(Ch);

	}
	catch(IOException io){


	}
	}
	public static void main(String args[]){
		Num ob=new Num();
		ob.printMenu();
	}


}