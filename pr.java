import java.io.*;
class pr{
	int p=0;
	public void findP(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("ENTER YOUR NUMBER");
		String nu=br.readLine();
		int n=Integer.parseInt(nu);
		
		for(int a=2;a<n/2;++a){
			if(n%2==0){
			p++;
			}
			}
		if(p>0){
		System.out.println("Number is not prime");

		}
		else{
		System.out.println("Number is prime");
		}

	}
	catch(IOException io){}

	}
	public static void main(String args[]){
		pr ob=new pr();
		ob.findP();
	}



}