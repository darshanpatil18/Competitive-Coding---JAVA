import java.io.*;
class AofT{
	public void findA(){
	try{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("ENTER BREADTH OF TRIANGLE");
		String b=br.readLine();
		int b1=Integer.parseInt(b);
		
		System.out.println("ENTER HEIGHT OF THE TRIANGLE");
		String h=br.readLine();
		int h1=Integer.parseInt(h);
		
		double A=(b1*h1)/2;
		System.out.println("AREA OF THE TRIANGLE = "+A); 
 
	}
	catch(IOException io){}

	}
	public static void main(String args[]){
		AofT ob=new AofT();
		ob.findA();

	}

}