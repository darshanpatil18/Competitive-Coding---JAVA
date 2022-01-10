import java.io.*;
class Ly{
	public void findYear(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Year");
		String Y=br.readLine();
		int Yr=Integer.parseInt(Y);
	
		if(Yr%4==0){
			System.out.println("The year is leap Year");

		}
		else{
		System.out.println("The year is not a leap Year");
	

		}


	}
	catch(IOException io){

	}

	}

	public static void main(String args[]){
		Ly ob=new Ly();
		ob.findYear();

	}


}