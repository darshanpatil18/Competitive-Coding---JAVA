import java.io.*;
class G{
	int g=0;
	int a1;
	public void findGrt(){
	try{		
		
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
		
		if(a1>g){
			g=a1;

		}
		else if(b1>g){
			g=b1;
		
		}
		else if(c1>g){
			g=c1;
		}
		System.out.println("Greatest number is::: "+g);

	}
	catch(IOException io){}	

	}
	public static void main(String args[]){
		G ob=new G();
		ob.findGrt();

	}




}