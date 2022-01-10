import java.io.*;
class perfect{
	int s,a=0;
	public void findP(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Number");
		String a1=br.readLine();
		int Num=Integer.parseInt(a1);
		
		for(a=1;a<Num;a++){
			if(Num%a==0)
			s=s+a;

		}
		if(s==Num){
			System.out.println("Entered Number is perfect number");
		}
		else{
		System.out.println("Entered Number is not perfect number");
		}

	}
	catch(IOException io){}

	}

	public static void main(String args[]){
		perfect o=new perfect();
		o.findP();

	}






}