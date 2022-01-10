import java.util.*;
class Determine{
	public void get(){
		try{
			System.out.println("Enter Value...");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			for(int i=1;i<5;i++){
			if(num>0){
				System.out.println("Entered Number is Positive....");
				get();

			}
			else if(num<0){
				System.out.println("Entered Number is Negative....");
				get();
			}
			else{
				System.out.println("Entered Number is Zero");
				get();

			}
			}
		}
		catch(NumberFormatException nf){}
	}
	public static void main(String args[]){
		Determine ob=new Determine();
		ob.get();
	}

	}