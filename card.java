//pg.94
import java.io.*;
class card{
	double disamt,finalamt,cost;
	int car;
	void get(){
		try{
			InputStreamReader irs=new InputStreamReader(System.in);
			BufferedReader r=new BufferedReader(irs);
			System.out.println("Enter amount");
			String val=r.readLine();
			cost=Double.parseDouble(val);
		
			System.out.println("Press 1 for Platinum card::");
			System.out.println("Press 2 for Gold card::");
			System.out.println("Press 3 for Silver card::");
			System.out.println("ENTER YOUR CARD");
			String cd=r.readLine();
			car=Integer.parseInt(cd);
				
		}
		catch(IOException io){
			System.out.println("Wrong Input");
			}
	}
	void proce(){
		
			switch(car){
			
			case 1:if(cost<25000){
				disamt=cost*(0.20);
				finalamt=cost-disamt;
				System.out.println("Amount to be paid is::"+finalamt);
				break;
				}
				else{
				disamt=cost*(0.25);
				finalamt=cost-disamt;
				System.out.println("Amount to be paid is::"+finalamt);
				break;
				}
			case 2:
				if(cost<25000){
				disamt=cost*(0.15);
				finalamt=cost-disamt;
				System.out.println("Amount to be paid is::"+finalamt);
				break;
				}
				else{
				disamt=cost*(0.20);
				finalamt=cost-disamt;
				System.out.println("Amount to be paid is::"+finalamt);
				break;
				}
			case 3:
				if(cost<25000){
				disamt=cost*(0.10);
				finalamt=cost-disamt;
				System.out.println("Amount to be paid is::"+finalamt);
				break;
				}
				else{
				disamt=cost*(0.15);
				finalamt=cost-disamt;
				System.out.println("Amount to be paid is::"+finalamt);
				break;			
				}
			}
		
		

	}
	public static void main(String args[]){
		card ob=new card();
		ob.get();
		ob.proce();
	}

}