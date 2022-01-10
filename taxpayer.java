//pg.182
import java.util.*;
class taxpayer{
	
	int pan;
	char name[]=new char[20];
	float taxableinc;
	float tax;
	
	void inputdata() throws NumberFormatException {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter personal account no.:::");
			pan=sc.nextInt();
			System.out.println("Enter name of the person:::");
			String n=sc.next();
			name=n.charAt[20];
			System.out.println("Enter Annual taxable income:::");

	}
	public static void main(String args[]){
		taxpayer tp=new taxpayer();
		tp.inputdata();

	}


}