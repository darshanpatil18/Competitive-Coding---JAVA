import java.util.*;
class LeapYear{
	int y;
		public void findLeapYear(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the year: ");
			y=sc.nextInt();
			if(y%4==0){
				System.out.println("The year is leap year");
			}
		else{
			System.out.println("The year is not a leap year");
		}
	}
		public static void main(String args[]){
			LeapYear ob=new LeapYear();
			ob.findLeapYear();
		}
}