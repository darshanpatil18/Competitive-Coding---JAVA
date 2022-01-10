import java.util.*;
class adduptoexit{
	
	public static void main(String args[]){
		int num=0;
		int sum=0;
		int x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		num=sc.nextInt();
		sum=sum+num;
		for(int i=0;i<100000;i++){
			System.out.println("Enter 1 to Continue or 2 to exit");
			x=sc.nextInt();
			if(x==1){
				System.out.println("Enter the Number" + (i+2) + ": " );
				num=sc.nextInt();
				sum=sum+num;
			}
			else if(x==2){
				System.out.println("Sum= "+sum);
				System.exit(0);	
			}
			else{
				System.out.println("Invalid Input");
				System.exit(0);
			}
			
		}

	}
	


}