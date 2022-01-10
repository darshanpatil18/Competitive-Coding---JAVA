import java.io.*;
class primeIP{
	int p=0;
	public void calPri(){
		try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("ENTER NUMBER");
		String pri=br.readLine();
		int Pri=Integer.parseInt(pri);

		for(int i=2;i<=Pri/2;++i){
			if(Pri%2==0){		
			p++;
			}

		}
		
		if(p>0){
			System.out.println(+Pri+"is not a prime number");
	
		}
		
		else{
		System.out.println(+Pri+"is a prime number");
		}
		
		
		
		}
		catch(IOException io){

		}
	}

	public static void main(String args[]){
		primeIP ob=new primeIP();
		ob.calPri();

	}



}