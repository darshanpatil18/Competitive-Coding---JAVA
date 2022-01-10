import java.util.*;
class Wonders{
	String place[]={"Chicken Itza","Christ the redeemer","Taj Mahal","Great Wall of China","Machu Picchu","Petra","Colosseum"};
	String Country[]={"Mexico","Brazil","India","China","Peru","Jordan","Italy"};
	int j,i=0;
	public void get(){
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Country's Name");
			String c=sc.next();
			
			for(i=0;i<7;i++){
				if(c.equalsIgnoreCase(Country[i])){
					j=1;
					break;
				}
				
			}
			if(j==1){
					System.out.println(Country[i]+"--"+place[i]);
					
				}
				else{
					System.out.println("Not Found");
					
				}

		}
		catch(Exception e){

		}

	}
	
	public static void main(String args[]){
		Wonders w=new Wonders();
		w.get();

	}
}