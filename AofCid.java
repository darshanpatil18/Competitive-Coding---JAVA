import java.io.*;
class AofCid{
	public void find(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Length of cuboid");
		String l=br.readLine();
		int l1=Integer.parseInt(l);
		
		System.out.println("Enter Breadth of cuboid");
		String b=br.readLine();
		int b1=Integer.parseInt(b);
	
		System.out.println("Enter Height of cuboid");
		String h=br.readLine();
		int h1=Integer.parseInt(h);
		
		double Ar=2*(l1*b1+b1*h1+l1*h1);
		System.out.println("Total Surface area of the Cuboid = "+Ar);

	}
	catch(IOException io){}

	}
	public static void main(String args[]){
		AofCid ob=new AofCid();
		ob.find();
	}



}