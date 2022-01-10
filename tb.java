import java.io.*;
class tb{
	int f;
	char g='a';
	void pt(){
		try{
		InputStreamReader irs=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(irs);
		String s=br.readLine();
		f=Integer.parseInt(s);
		++f;
		System.out.println("Static value::"+f);	
		System.out.println("Static value::"+f);
	
		}
		catch(IOException io){

		}
		if(Character.isLowerCase(g)==true){
			System.out.println("HI");
			System.out.println(Character.toUpperCase(g));
		}

	
	}
	public static void main(String args[]){
		tb t=new tb();
		t.pt();
	}
}