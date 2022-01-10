import java.io.*;
class Nine{
	int row=1;
	public void mult(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Number");
		String m=br.readLine();
		int mu=Integer.parseInt(m);
		System.out.println("Multiplication of "+mu+" is");
		while(row<=10){
		int Mult=mu*row;
		System.out.println(mu+" * "+row+" = "+Mult);
		++row;
		
		}
		



	}
	catch(IOException io){}
	
	}
	public static void main(String args[]){
		Nine ob=new Nine();
		ob.mult();
	}


}