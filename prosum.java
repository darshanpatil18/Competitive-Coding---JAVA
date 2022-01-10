import java.io.*;
class prosum{
	
	int n,sum;
	void get(){
		try{
			InputStreamReader irs=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(irs);
			System.out.println("Enter no.");
			String s=br.readLine();
			n=Integer.parseInt(s);
			 
		}
		catch(IOException i){
			System.out.println("Exception"+i);
		}
	}
	void find(){
		for(int i=0;i<=n;i++)
		sum=sum+(i*i);
		System.out.println(sum);	
	}
	public static void main(String args[]){
		prosum p=new prosum();
		p.get();
		p.find(); 
	}

}