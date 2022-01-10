import java.util.*;
class NumDrivers{
	int age[]=new int[5];
	char sex[]=new char[5];
	String c;
	int c6,c4,ca,count;
	Scanner sc=new Scanner(System.in);
	public void find(){
		System.out.println("Enter Age of each");
		for(int i=0;i<5;i++){
			age[i]=sc.nextInt();
		}
		System.out.println("Enter Sex[f/m]");
		for(int j=0;j<5;j++){
			c=sc.next();
			sex[j]=c.charAt(0);
		}
		
	}
	public void fin(){
		for(int i=0;i<5;i++){
			if(age[i]>60){
				c6++;
			}
			else if(age[i]>40 && age[i]<=60){
				c4++;
			}
			else{
				ca++;
			}
		}
		System.out.println("Number above 60yrs=="+c6);
		System.out.println("Number between 40yrs and 60yrs=="+c4);
		System.out.println("Number below 40yrs=="+ca);
	}
	public void fi(){
		for(int i=0;i<5;i++){
			if(sex[i]=='F' || sex[i]=='f'){
				count++;
			}
		}
		System.out.println("Number of female drivers=="+count);

	
	}
	public static void main(String args[]){
		NumDrivers t=new NumDrivers();
		t.find();
		t.fin();
		t.fi();
	}
}