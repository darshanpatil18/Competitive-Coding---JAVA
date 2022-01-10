import java.io.*;
class buzz{
	public void findB(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("ENTER NUMBER");
		String N=br.readLine();
		int NU=Integer.parseInt(N);
		
		int re=NU%10;
		int num=NU%7;
		
		if(re==7 || num==0){
			System.out.println("ENTERED NUMBER IS BUZZ NUMBER");
	

		}
		else{
		System.out.println("ENTERED NUMBER IS NOT BUZZ NUMBER");
	
		}	
	
	}
	catch(IOException io){}
	}
	public static void main(String args[]){
		buzz ob=new buzz();
		ob.findB();
	}




}