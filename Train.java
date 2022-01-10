import java.util.*;
class Train
{
	int tr_no;
 	String dest;
 	float dist,fuel;

 	void calfuel(){
 		if(dist<=500){
 			fuel=15000;
		}
		else if(dist>500 && dist<=2000){
 			fuel=35000;
		}
 		else{
 			fuel=60000;
		}
	}

 	void feedinfo(){
 		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Train Number: ");
 		tr_no=sc.nextInt();
		System.out.println("Enter the Destination: ");
 		dest=sc.next();
 		System.out.println("Enter the Distance: ");
 		dist=sc.nextFloat();
 		calfuel();
	}

	void showinfo(){
 		System.out.println("Train Number: "+tr_no);
 		System.out.println("Destination: "+dest);
 		System.out.println("Distance: "+dist);
 		System.out.println("Fuel: "+fuel);
 	}

	public static void main(String args[]){
 		Train ob=new Train();
 		ob.feedinfo();
 		ob.showinfo();
 	}
}