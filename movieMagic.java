//pg 176
import java.util.*;
class movieMagic{
	int year;
	String title;
	float rating;
	
	movieMagic(){
		year=0;
		title="";
		rating=0.0f;
	}
	void accept(){
		try{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Year of Release");
			year=sc.nextInt();
			
			System.out.println("Enter title of Movie");
			title=sc.next();
			
			System.out.println("Enter rating of the movie");
			rating=sc.nextFloat();
				
		}
		catch(NumberFormatException nf){}
	
	}
	void display(){
		if(rating <0){

			System.out.println("Wrong input");
			accept();
		}
		else if(rating>0 && rating <=2.0){
			System.out.println("Flop movie");	
		
		}
		else if(rating>2 && rating <=3.4){
			System.out.println("Semi hit movie");
		}
		else if(rating>3.4 && rating <=4.5){
				System.out.println("Hit movie");
			}
		else{

			System.out.println("Super hit movie");
			
		}
		System.out.println("Year="+year);
		System.out.println("Title="+title);
		System.out.println("Rating="+rating);
		
		
	}
	public static void main(String args[]){
		movieMagic mm=new movieMagic();
		mm.accept();
		mm.display();
	}

}