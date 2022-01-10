import java.io.*;
class mobike{
	int bno,phno,days,charge;
	String name;

	void input(){
		try{

			InputStreamReader irs=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(irs);
			System.out.println("Bikers number");
			String b=br.readLine();
			bno=Integer.parseInt(b);
				
			System.out.println("Phone Number");
			String p=br.readLine();
			phno=Integer.parseInt(p);
	
			System.out.println("Name");
			name=br.readLine();
		
			System.out.println("Number of days for rent");
			String d=br.readLine();
			days=Integer.parseInt(d);
				
			compute();

		}
		catch(IOException io){}

	}
	void compute(){

		if(days<=5)
			charge=days*500;
		if(days>5 && days<=10)
			charge=(days-5)*400+500*days;
		if(days>10)
			charge=(days-10)*200+5*400+500*days;
		display();
	}
	void display(){
		System.out.println("Amt::"+charge);


	}
	public static void main(String args[]){
		mobike o=new mobike();
		o.input();

	}



}