import java.io.*;
class perfectno{
		int n,a,s=0;
	perfectno(){
	try{
		
		InputStreamReader irs=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(irs);
		System.out.println("Enter Number");
		String num=br.readLine();
		n=Integer.parseInt(num);

		for(a=1;a<n;a++){
			if(n%a==0)
			s=s+a;
		
		}
		if(s==n)
			System.out.println("ITS PERFECT");
		else	
			System.out.println("ITS NOT PERFECT");
	}	
	catch(IOException io){


	}
	}


	public static void main(String args[]){
		perfectno ob=new perfectno();
	
	}


}