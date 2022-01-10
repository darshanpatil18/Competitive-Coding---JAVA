import java.io.*;
class Comm{
	double co;
	public void findC(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("ENTER THE SALES");
		String Sales=br.readLine();
		int sale=Integer.parseInt(Sales);
		
		if(sale>=100000){
			co=(sale*25)/100;
			System.out.println("Commission = "+co);

		}
		else if(sale>80000 && sale<100000){
			co=(sale*22.5)/100;
			System.out.println("Commission = "+co);
		}
		else if(sale>60000 && sale<79999){
			co=(sale*20)/100;
			System.out.println("Commission = "+co);
		}
		else if(sale>40000 && sale<59999){
			co=(sale*15)/100;
			System.out.println("Commission = "+co);	
		}
		else{
		
			co=(sale*12.5)/100;
			System.out.println("Commission = "+co);	
		}
		}
	catch(IOException io){}

	}
	public static void main(String args[]){
		Comm ob=new Comm();
		ob.findC();
	}



}