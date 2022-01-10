import java.io.*;
class SOO{
	int su;
	public void findSu(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Value");
		String S=br.readLine();
		int s=Integer.parseInt(S);   
		
		while(s>0){
		   int n=s%10;
		   
		if(n%2!=0){
			su=su+n;
			n=n/10;
		}
		}
		System.out.println("THE SUM OF ODD NUMBERS OF "+s+" is "+su);	
			
	}
	catch(IOException io){}


	}
	public static void main(String args[]){
		SOO ob=new SOO();
		ob.findSu();
	}



}