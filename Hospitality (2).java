import java.io.*;
class Hospitality{
		
	public void printDots(){

		for(int a=1;a<80;a++){
		System.out.print("=");
		}
		
		printTitle();
	}
	

	public void printTitle(){
		System.out.println("\n\t\t\t\t HOSPITALITY");
			
		for(int b=1;b<80;b++){
		System.out.print("=");
		}
		
		printMenu();
	}
	
	public void printMenu(){
		System.out.println("\n\t\t\t=>Press 1 for Discharge Bill");
		System.out.println("\n\t\t\t=>Press 2 for Exit");
			
		for(int op=1;op<80;op++){
			System.out.print("=");
		}
			
		printChoice();
		
		for(int b=1;b<80;b++){
		System.out.print("=");
		}
		
	}
	
	public void printChoice(){
		try{
		
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			
			System.out.print("\n\t\t\tPlease Enter Your Choice = ");
			String a=br.readLine();
			int choice=Integer.parseInt(a);
		
			for(int oq=1;oq<80;oq++){
			System.out.print("=");
			}
		
			if(choice==1){
			
			
			System.out.println("\nPlease Enter Registration Number:-");
			String File=br.readLine();
			Long Num=Long.parseLong(File);

			System.out.println("\nPlease Enter Patient's name:-");
			String name=br.readLine();
			
			System.out.println("\nPlease Enter Age(years):-");
			String c=br.readLine();
			Byte Age=Byte.parseByte(c);
		
			System.out.println("\nPlease Enter Sex:-");
			String Sex=br.readLine();
		
			System.out.println("\nPlease Enter Patient's Address:-");
			String Address=br.readLine();
			
			System.out.println("\nPlease Enter Contact Number:-");
			String ctct=br.readLine();
			Long Contact=Long.parseLong(ctct);
			
			
			System.out.println("\nPlease Enter Contact Person:-");
			String ct=br.readLine();
			Long Contct=Long.parseLong(ct);
			}
			
			else if(choice==2){
			System.exit(0);
			}
			
			
			else{
			System.out.println("Invalid Input");
			}
			
			
			for(int m=1;m<80;m++){
			System.out.print("=");
			}	
		
			System.out.print("\n\t\t\tPlease Enter 1 To Proceed For Bill = ");
			String b=br.readLine();
			int choic=Integer.parseInt(b);
			
			for(int ol=1;ol<80;ol++){
			System.out.print("=");
			}
			
			if(choic==1){

			System.out.println("\nPlease Enter Date Of Admission(DD/MM/YY):-");
			String Daa=br.readLine();
			
			System.out.println("\nReferred Doctor:-");
			String Doct=br.readLine();
			
			System.out.println("\nTreatment Under Doctor:-");
			String Dot=br.readLine();

			System.out.println("\nReason For Admission:-");
			String Rsn=br.readLine();
			
			for(int l=1;l<80;l++){
			System.out.print("_");
			}
		
			System.out.println("\n\t\t\tDischarge Bill is as Follows");
			
			for(int n=1;n<80;n++){
			System.out.print("_");
			}

			System.out.println("\nAdmitted Room Number-:");
			String no=br.readLine();
			Long Ad=Long.parseLong(no);
			
			System.out.println("\nPlease Enter Date Of Discharge(DD/MM/YY):-");
			String Dad=br.readLine();
			
			System.out.println("\nDepartment:-");
			String Department=br.readLine();
			
			System.out.print("Days=");
			String Dy=br.readLine();
			int day=Integer.parseInt(Dy);
			
			System.out.print("Cost=");
			String ValofCasualty=br.readLine();
			int cas=Integer.parseInt(ValofCasualty);
		
			int Total =cas*day;
			System.out.println("Total cost="+Total);
					
			System.out.println("\nNext Department:-");
			String Dpt=br.readLine();
			
			System.out.print("Days=");
			String D=br.readLine();
			int Day=Integer.parseInt(D);
			
			System.out.print("Cost=");
			String VINCU=br.readLine();
			int INCU=Integer.parseInt(VINCU);
			
			int Total1=INCU*Day;
			System.out.println("Total cost="+Total1);	
			
			System.out.println("\nNext Department:-");
			String DT=br.readLine();
			
			System.out.print("Days=");
			String Da=br.readLine();
			int DA=Integer.parseInt(Da);

			System.out.print("Cost=");
			String OTs=br.readLine();
			int OT=Integer.parseInt(OTs);
			
			int Total2=OT*DA;
			System.out.println("Total cost="+Total2);
			
			System.out.println("\nNext Department:-");
			String DP=br.readLine();

			System.out.print("Days=");
			String Day2=br.readLine();
			int Day1=Integer.parseInt(Day2);
			
			System.out.print("Cost=");
			String ROOM=br.readLine();
			int ROOMS=Integer.parseInt(ROOM);
						
			int Total3=ROOMS*Day1;
			System.out.println("Total cost="+Total3);
			
			System.out.print("\nNursing Cost=");
			String Nur=br.readLine();
			int Nurse=Integer.parseInt(Nur);
			
			System.out.print("\nLaboratory and Investigation Cost=");
			String lab=br.readLine();
			int Lab=Integer.parseInt(lab);
						
			int bill=Total+Total1+Total2+Total3+Nurse+Lab;
			System.out.println("\nBill of Patient="+bill);

			System.out.print("\nDiscount(%)=");
			String di=br.readLine();
			int dis=Integer.parseInt(di);
			
			int Discount=(bill*dis)/100;
			int Discount1=bill-Discount;
			System.out.println("\nFinal Bill="+Discount1);
			
			for(int oo=1;oo<80;oo++){
			System.out.print("=");
			}
			

			}
			else{
			System.out.println("Invalid Input");
			}



		 	printTitle();
			printMenu();	
		
		}
		
		catch(IOException io){
		System.out.println("Wrong Input");
		}
		
	}
		
	

	public static void main(String args[]){
		Hospitality ob=new Hospitality();
		ob.printDots();
		
	}


}