//ICSE 2016:-SECTION B(QSTN 4)
import java.io.*;
class BookFair{
	String Bname;
	double price;
	
	BookFair(){
		Bname="Gullivers Travel";
		price=1500.0;
	}
	void Input(){
		try{
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			System.out.println("Enter name of book");
			Bname=br.readLine();
		
			System.out.println("Enter price");
			price=Double.parseDouble(br.readLine());

		}
		catch(IOException io){
			System.out.println("Enter correct...");

		}


	}
	void calculate(){
		if(price<=1000){
			System.out.println("Discount=2%");
			price=price-0.02*price;
		}
		else if(price>1000 && price<=3000){
			System.out.println("Discount=10%");
			price=price-0.10*price;
		}
		else{
			System.out.println("Discount=15%");
			price=price-0.15*price;
		}


	}
	void display(){

		System.out.println("Name of book:::"+Bname);
		System.out.println("Actual Price:::"+price);

	}
	public static void main(String args[]){
		BookFair bf=new BookFair();
		bf.Input();
		bf.calculate();
		bf.display();
	}


}