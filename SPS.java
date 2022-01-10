import java.io.*;
class SPS{
	double sq;
	public void calS(){
		try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("ENTER NUMBER");
		String SQ=br.readLine();
		sq=Double.parseDouble(SQ);
		
		Double Sq=Math.sqrt(sq);
		System.out.println("Square Root of Number "+sq+" is "+Sq);
		Double sQ=sq+Sq;
		System.out.println("Sum of Square Root= "+sQ);	
		}
		catch(IOException io){}
		
		}
	public static void main(String args[]){
	SPS ob=new SPS();
	ob.calS();

	
	}



}