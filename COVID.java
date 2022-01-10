import java.util.*;
class COVID{
	
	Scanner sc=new Scanner(System.in);	
	int n=sc.nextInt();
	String[] name=new String[n];
	int age[]=new int[n];
	long mob[]=new long[n];
	int dt1[]=new int[n];
	int dt2[]=new int[n];
	long aadhar[]=new long[n];
	String[] sym=new String[n];
	String[] comp=new String[n];
	public void entr(){
		for(int i=0;i<n;i++){
			System.out.println("Enter the Name of" + (i+1) +"st person");
			name[i]=sc.next();
			System.out.println("Enter the age of" + (i+1) +"st person");
			age[i]=sc.nextInt();
			System.out.println("Enter the mob of" + (i+1) +"st person");
			mob[i]=sc.nextLong();
			System.out.println("Enter the dt1 of" + (i+1) +"st person");
			dt1[i]=sc.nextInt();
			System.out.println("Enter the dt2 of" + (i+1) +"st person");
			dt2[i]=sc.nextInt();
			System.out.println("Enter the aadhar number of" + (i+1) +"st person");
			aadhar[i]=sc.nextLong();
			System.out.println("Enter the Symptoms of" + (i+1) +"st person");
			sym[i]=sc.next();
			System.out.println("Enter whether completed or not of" + (i+1) +"st person");
			comp[i]=sc.next();
		}

	}
	public void details(){
		System.out.println("Persons Vaccinated: ");
		for(int i=0;i<n;i++){
			System.out.println(name[i]);
			System.out.println(age[i]);
			System.out.println(mob[i]);
			System.out.println(dt1[i]);
			System.out.println(dt2[i]);
			System.out.println(aadhar[i]);
			System.out.println(sym[i]);
		}
		
	}
	public void vacccompl(){
		for(int i=0;i<n;i++){
			if(comp[i]=="Completed"){
				System.out.println("Name :"+name[i]);
				System.out.println("Mobile Number :"+mob[i]);
			}
		}
	}
	public void symfever(){
		System.out.println("People with Fever are: ");
		for(int i=0;i<n;i++){
			if(sym[i]=="Fever"){
				System.out.println(name[i]);
			}
		}
	}
	public void exage(){
		System.out.println("Enter age: ");
		int ageex=sc.nextInt();
		for(int i=0;i<n;i++){
			if(ageex==age[i]){
				System.out.println("Name :"+name[i]);
				System.out.println("Mobile Number :"+mob[i]);
			}
		}
	}	
	public static void main(String args[]){
		COVID ob=new COVID();
		ob.entr();
		ob.details();	
		ob.vacccompl();
		ob.symfever();
		ob.exage();
	}
}