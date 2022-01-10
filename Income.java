//pg.84
import java.io.*;
class Income{
	
	public void get(){
		try{
			InputStreamReader irs=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(irs);
			System.out.println("Enter age");
			String a=br.readLine();
			int age=Integer.parseInt(a);
		
		
			System.out.println("Taxable Income:::");
			String t=br.readLine();
			double TI=Double.parseDouble(t);
			
			System.out.println("Enter Choice(M/F)");
			String a1=br.readLine();
			char ch=a1.charAt(0);
				
			switch(ch){
			case 'M':
				if(age<=65 && TI<160000){
					System.out.println("Tax amount=Nil");

				}
			else if(age<=65 && TI<=500000 && TI>160000){
				System.out.println("Tax amount="+(TI-160000*0.1));

			}
			else if(age<=65 && TI>500000 && TI<=800000){
				System.out.println("Tax amount="+(TI-500000*0.2)+34000);
			
			}
			else if(age<=65 && TI>800000){
				System.out.println("Tax amount="+(TI-800000*0.3)+94000);

			}
			break;
			case 'F':
				if(age>65){

				System.out.println("Wrong category");
				}
				break;
			}
		}
		catch(IOException io){}


	}
	public static void main(String args[]){
		Income ob=new Income();
		ob.get();

	}



}