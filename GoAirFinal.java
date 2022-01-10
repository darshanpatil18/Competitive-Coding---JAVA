import java.util.*;
class GoAir extends Thread{

	int age[]=new int[5];
	String gen[]=new String[5];
	int cat1=0,cat2=0,cat3=0;
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details of passenger");
		for(int i=0;i<100;i++){
			System.out.println("Enter Age of "+(i+1)+" passenger");
			age[i]=sc.nextInt();
			System.out.println("Enter Gender of "+(i+1)+" passenger");
			gen[i]=sc.nextLine();
			
			if(gen[i]=="Male" && age[i]>60){
				cat1++;
				
			}
			else if(gen[i]=="Female" && age[i]>55){
				cat1++;
			}
			else if(gen[i]=="Male" && age[i]>55){
				cat2++;
			}
			else if(gen[i]=="Female" && age[i]>50){
				cat2++;
			}
			else if(age[i]>50){
				cat3++;
			}
		}


	}
}
class GoAirCat extends GoAir, Thread{

		void run(){

			System.out.println("Category 20% Discount: "+cat1);
			System.out.println("Category 15% Discount: "+cat2);
			System.out.println("Category 10% Discount: "+cat3);

		}
}
class GoAirFinal{
		public static void main(String args[]){
			GoAir t1=new GoAir();
			GoAirCat t2=new GoAirCat();
			t1.start();
			t2.start();

		}



}