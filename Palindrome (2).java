import java.io.*;
class Palindrome{
	int d,p,r=0;
	public void findP(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Number to be Checked");
		String a=br.readLine();
		int Num=Integer.parseInt(a);
		p=Num;
		do{	
			d=Num%10;
			r=r*10+d;
			Num=Num/10;
		}
		while(Num!=0);
		if(r==p){
		System.out.println("Entered Number is Palindrome number");
		}
		else{

		System.out.println("Entered Number is not Palindrome number");
		}
		
	}
	catch(IOException io){}
		
	

	}


	public static void main(String args[]){
		Palindrome ob=new Palindrome();
		ob.findP();
	
}
}