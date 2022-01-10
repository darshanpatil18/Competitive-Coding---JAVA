///pg.88
import java.io.*;
class ParkingLot{
	int vno,hours;
	double bill;
	
	void input(){
		try{
			InputStreamReader irs=new InputStreamReader(System.in);
			BufferedReader r=new BufferedReader(irs);
			System.out.println("Enter Vehicle Number::");
			String vh=r.readLine();
			vno=Integer.parseInt(vh);
			
			System.out.println("Enter Hours::");
			String h=r.readLine();
			hours=Integer.parseInt(h);
			
			
		
		}
		catch(IOException io){}
	
	}
	void calculate(){
		if(hours<=0){
			System.out.println("Wrong Input...");
			System.exit(0);
		}
		else if(hours>0 && hours<=1){
			bill=hours*3.0;
			System.out.println("Parking Charges(Rs)="+bill);
		}
		else{
			bill=3.0+(hours-1)*3;
			System.out.println("Parking Charges(Rs)="+bill);
		}

	}
	void display(){
		System.out.println("Vehicle Number::"+vno);
		System.out.println("Total Time(Hrs)::"+hours);
		System.out.println("Total bill::"+bill);
	}
	public static void main(String args[]){
		ParkingLot PL=new ParkingLot();
		PL.input();
		PL.calculate();
		PL.display();
	}

}