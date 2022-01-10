import java.util.*;
class swapping{

	void swapp(){
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int x=sc.nextInt();
		System.out.println("Enter number 2");
		int y=sc.nextInt();
		
		if(x>y){
			x=x-y;	
			y=x+y;
			x=y-x;
		
		}
		else{
			y=y-x;
			x=x+y;
			y=x-y;
		

		}
		System.out.println("Swapping of x="+x);
		System.out.println("Swapping of y="+y);
		}
		catch(NumberFormatException nf){}
	}		

		
	public static void main(String args[]){
		swapping swap=new swapping();
		swap.swapp();
	}
}