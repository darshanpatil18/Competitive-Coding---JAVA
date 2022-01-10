import java.io.*;
class Celsius{
	public void printMenu(){
	System.out.println("\n\t\t\tEnter 1=>Celsius To Fahrenheit");
	System.out.println("\n\t\t\tEnter 2=>Fahrenheit To Celsius");
	System.out.println("\n\t\t\tEnter 3=>Exit");
	calC();
	}
	public void calC(){
		try{
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			System.out.print("Enter Your Choice:::");
			String ch=br.readLine();
			int cho=Integer.parseInt(ch);
			
		switch(cho){
		case 1:
			System.out.println("Enter Temperature in Celsius:::");
			String Tp=br.readLine();
			int tp=Integer.parseInt(Tp);
			double f=1.8*tp+32;
			System.out.println("Temperature In  Fahrenheit="+f);
			break;
		

		case 2:
			System.out.println("Enter Temperature in Fahrenheit:::");
			String p=br.readLine();
			int t=Integer.parseInt(p);
			double c=5/9*t-32;
			System.out.println("Temperature In  Celsius="+c);
			break;
		case 3:
			System.exit(0);
		
			default:
			System.out.println("Incorrect Choice");
			break;



		}


		}
		catch(IOException io){

		}
		


	}
	public static void main(String args[]){
		Celsius ob=new Celsius();
		ob.printMenu();
	}
	
	
	

}