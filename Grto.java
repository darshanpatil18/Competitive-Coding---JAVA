import java.io.*;
class Grto{
	String Inp;
	long greatest;
	private String Input(){
		try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		Inp=br.readLine();	
		}
		catch(IOException io){
			System.out.println("Enter correct...");
		}
		return Inp;
	}
	public void Get(){
		try{
			System.out.println("Enter 1st Value....");
			long fir=Long.parseLong(Input());
			System.out.println("Enter 2nd Value....");
			long sec=Long.parseLong(Input());
			System.out.println("Enter 3rd Value....");
			long thi=Long.parseLong(Input());

			greatest=fir;
			if(sec>greatest){
				System.out.println("So Entered Value "+sec+" is Big");
				greatest=sec;
				
			}
			if(thi>greatest){
				System.out.println("So Entered Value "+thi+" is Big");
				greatest=thi;

			}
			System.out.println("Greatest Number is..."+greatest);

		}
		catch(NumberFormatException nf){
			System.out.println("Dont Enter Foolish....");
		}


	}
	
	
	public static void main(String args[]){
		Grto ob=new Grto();
		ob.Get();

	}

}