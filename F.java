import java.io.*;
class F{
	int fact;
	public void findFact(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter value");
		String f=br.readLine();
		int f1=Integer.parseInt(f);
		
		for(int a=1;f1<25;a++){
			fact=fact*a;
		}
			System.out.println("Factorial = "+fact);

		
	}
	catch(IOException io){}	

	}
	
		public static void main(String args[]){
		F ob=new F();
		ob.findFact();

	}



}