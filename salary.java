import java.util.*;
class Salary{
	
	Scanner sc=new Scanner(System.in);
	String name,add,sub;
	double montsal,incmtx,annltx;
	long ctctno;
	
	public void accept(){
		System.out.println("Enter Name");
		name=sc.nextLine();
		System.out.println("Enter Address");
		add=sc.nextLine();
		System.out.println("Enter Subject specialization");
		sub=sc.nextLine();
		System.out.println("Enter Monthly Salary");
		montsal=sc.nextDouble();
		System.out.println("Enter Phone number");
		ctctno=sc.nextLong();
	}
	public void compute(){
		if(montsal>175000){
			incmtx=montsal*0.05;
			annltx=montsal-incmtx;
		}
		System.out.println("INCOME TAX=="+incmtx);
		System.out.println("Annual Salary After Income tax=="+annltx);
	}
	public static void main(String args[]){
		Salary s=new Salary();
		s.accept();
		s.compute();
		
	}
}