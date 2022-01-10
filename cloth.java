//pg 78
import java.io.*;
class cloth{
	double amt,disamt;
	//Use of default constructor...	
	cloth(){
		try{
			InputStreamReader irs=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(irs);
			System.out.println("Enter Cost...");
			String a=br.readLine();
			double Cost=Double.parseDouble(a);
		
			if(Cost<2000){
				System.out.println("Discount:::5%");
				disamt=Cost*(0.05);
				amt=Cost-disamt;
				System.out.println("Final Amount to be Paid:::"+amt);
			} 
			//Remaining part of the program same...
			

		}
		catch(IOException io){}

	}
	
	public static void main(String args[]){
		cloth ob=new cloth();

	}



}