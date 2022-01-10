import java.util.*;
class Project{
	
	public int Resp,submenuResp;
	public long Cost,Day,Lab,bill,Nurse,dis,Discount,Discount1;
	public boolean cont=false;
	
	private void drawDash(){
		for(int Dash=1;Dash<80;Dash++){
			System.out.print("-");
		}
	}
	
	private void drawEquals(){
		for(int Equals=1;Equals<80;Equals++){
			System.out.print("=");
		}
	}
	
	
	private void drawCompliment(){
		for(int Compliment=1;Compliment<80;Compliment++){
			System.out.print("~");
		}
	}	
	
		
	public void Title(){
		drawDash();
		System.out.println("\n\n\t\t\t\t HOSPITALITY");
		drawDash();
		menu();
		
	}
		
	public void menu(){
		System.out.println("\n\t\t\t =>Press 1 for Discharge Bill");
		System.out.println("\n\t\t\t =>Press 2 for Exit");
		drawCompliment();
		Calc();
	}
	private String Input(){
		Scanner sc=new Scanner(System.in);	
		String Inp=sc.next();
		return Inp;
	}
	private void Department(){
		System.out.print("\nDepartment::: ");
		Input();
		System.out.print("Days::: ");
		Day=Long.parseLong(Input());
		System.out.print("Cost=");	
		Cost=Long.parseLong(Input());	
		
		
	}
	private void PtDetails(){
	try{
		System.out.println("Please Enter Registration Number::");
		long Res=Long.parseLong(Input());
		System.out.println("\nPlease Enter Patient's name::");
		Input();
		System.out.println("\nPlease Enter Age(years):-");
		short Age=Short.parseShort(Input());
		
		System.out.println("\nPlease Enter Sex:-");
		Input();
		System.out.println("\nPlease Enter Patient's Address:-");
		Input();
		System.out.println("\nPlease Enter Contact Number:-");
		long ct=Long.parseLong(Input());
		System.out.println("\nPlease Enter Contact Person(contact Number):-");
		long ctct=Long.parseLong(Input());
		
		submenuResp=submenu();
		cont=checksubMenu(submenuResp);
		
		if(cont){
			PtDetails();
		}
		else{
			submenu();
			}		
	}
	catch(NumberFormatException nf){
		System.out.println("Please Enter Correct details...");
		PtDetails();

	}}
	private void Proceed(){
		try{
		System.out.println("\nDate Of Admission(DD/MM/YY):::");
		Input();
		System.out.println("\nReferred Doctor:::");
		Input();
		System.out.println("\nTreatment Under Doctor:::");
		Input();
		System.out.println("\nReason For Admission:::");
		Input();
		DischargeBill();		
		}
		catch(NumberFormatException nfee){
			System.out.println("Please Enter Correct Details");
			drawDash();
			Proceed();
		}
		}
	private void DischargeBill(){
		try{
		drawDash();
		System.out.println("\n\t\t\tDischarge Bill is as Follows:::");
		drawDash();

		System.out.println("\nAdmitted Room Number:::");
		long Ad=Long.parseLong(Input());
		System.out.println("\nPlease Enter Date Of Discharge(DD/MM/YY):-");
		long Discharge=Long.parseLong(Input());

		Department();
		Long Total =Cost*Day;
		System.out.println("Total cost="+Total);
		Department();
		Long Total1 =Cost*Day;
		System.out.println("Total cost="+Total1);
		Department();
		Long Total2 =Cost*Day;
		System.out.println("Total cost="+Total2);
		
		System.out.print("\nNursing Cost=");
		Nurse=Long.parseLong(Input());
		System.out.print("\nLaboratory Investigation Cost=");
		Lab=Long.parseLong(Input());
		bill=Total+Total1+Total2+Nurse+Lab;
		System.out.println("\nBill of Patient="+bill);

		System.out.print("\nDiscount(%)=");
		dis=Integer.parseInt(Input());
		Discount=(bill*dis)/100;
		Discount1=bill-Discount;
		System.out.println("\nFinal Bill="+Discount1);
		
		
		}
		catch(NumberFormatException nef){
		System.out.println("Please Enter Correct Details");
		DischargeBill();
		}
	}
	private boolean checksubMenu(int r){
		int Resp=r;
		if(Resp==1){
			Proceed();
			}
		else if(Resp==2){
			menu();
		}
		else if(Resp==3){
			drawDash();
			Greetings();
			drawDash();
			System.exit(1);
			
		}
		else{
			System.out.println("Invalid Submenu Choosed...");
			System.out.println("Please Enter Valid option");
			submenuResp=submenu();
			checksubMenu(submenuResp);
		}
		return cont;
		}
		
	private void Calc(){
		int choice;
		try{
			System.out.print("\n\t\t\tPlease Enter Choice::: ");
			choice=Integer.parseInt(Input());
			
			switch(choice){
				case 1:
				PtDetails();
				break;

				case 2:
				drawDash();
				Greetings();
				drawDash();
				System.exit(1);
				break;
			
				default:
				System.out.println("Please Enter Valid Option...");
				drawEquals();
				Calc();
				
			}
		}
		catch(NumberFormatException nfe){
			System.out.println("Please Enter valid Value Only");
			Calc();
		}
	
	}
		private int submenu(){
			drawCompliment();
			System.out.print("\n =>Press 1 to Proceed for Bill");
			System.out.print("   =>Press 2 for Main Menu");
			System.out.println("   =>Press 3 for Exit");
			drawCompliment();
			System.out.print("\n\t\t\t\tPlease Enter Option:: ");
			Resp=Integer.parseInt(Input());
			return Resp;

		}
		
		public void Greetings(){
			System.out.println("\n\t\t***(TM)DESIGNED & DEVELOPED BY STUDENT=>DARSHAN PATIL***");
			System.out.println("\n\t\t\t\tTHANK YOU FOR USING MY APP");
		}	


}
class Hospitality{
	public static void main(String args[]){
		Project Hosp=new Project();
		Hosp.Title();
		Hosp.Greetings();
	}



}