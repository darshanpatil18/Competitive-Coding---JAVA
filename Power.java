import java.io.*;
class Power{
	public void calS(){	
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Number");
		String s=br.readLine();
		int sum=Integer.parseInt(s);
		
		if(sum%2==0){
			Double Sum=Math.pow(sum,2);
			System.out.println("Power of Even Number "+Sum);
		}
		
		else{
			System.out.println("ENTERED VALUE IS NOT EVEN");
		}




	}
	catch(IOException io){}	


	}
	public static void main(String args[]){
		Power ob=new Power();
		ob.calS();


	}



}