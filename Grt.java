import java.io.*;
class Grt{
	int a1;
	public void findGr(){
		try{
		int g=a1;
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter 1st Number");
		String a=br.readLine();
		a1=Integer.parseInt(a);
		
		System.out.println("Enter 2nd Number");
		String b=br.readLine();
		int b1=Integer.parseInt(b);

		System.out.println("Enter 3rd Number");
		String c=br.readLine();
		int c1=Integer.parseInt(c);

		if(b1>g){
			g=b1;
		}
		if(c1>g){
			g=c1;

		}
		System.out.println("Greatest Number is:::"+g);

				
		}

		catch(IOException io){
		System.out.println("Entered Value is wrong");
		}

	}
		public static void main(String args[]){
			Grt ob=new Grt();
			ob.findGr();

		}






}