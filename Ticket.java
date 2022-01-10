//pg.86
import java.io.*;
class Ticket{
	public void calTc(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Your Name:::");
		String Na=br.readLine();
		
		System.out.println("Ticket Charges:::");
		String Tcc=br.readLine();
		int TCC=Integer.parseInt(Tcc);
		
		if(TCC>70000){
		System.out.println("Discount(%)=18");
		int D=(TCC*18)/100;
		int F=TCC-D;
		System.out.println("Final Payable Amount="+F);
		}
		if(TCC>=55001 && TCC<70000){
		System.out.println("Discount(%)=16");
		int DD=(TCC*16)/100;
		int FF=TCC-DD;
		System.out.println("Final Payable Amount="+FF);
		}
		if(TCC>=35001 && TCC<55000){
		System.out.println("Discount(%)=12");
		int DDD=(TCC*12)/100;
		int FFF=TCC-DDD;
		System.out.println("Final Payable Amount="+FFF);
		}
		if(TCC>=25001 && TCC<35000){
		System.out.println("Discount(%)=10");
		int DDDD=(TCC*10)/100;
		int FFFF=TCC-DDDD;
		System.out.println("Final Payable Amount="+FFFF);
		}
		if(TCC<25001){
		System.out.println("Discount(%)=2");
		int DDDDD=(TCC*2)/100;
		int FFFFF=TCC-DDDDD;
		System.out.println("Final Payable Amount="+FFFFF);
		}
		


	}
	catch(IOException io){
	}


	}

	public static void main(String args[]){
		Ticket ob =new Ticket();
		ob.calTc();
	}





}