import java.util.*;
class CtctArr{
	String name[]={"Jyoti","Raj","Krupa","Darshan","Sachin"};
	long tel[]={8928,9595,0000,9595,12650};
	String s;
	public void get(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name::");
		s=sc.next();
		
		for(int i=0;i<name.length;i++){
			if(name[i]==s){
				System.out.println("Name found");
			}
		}	
	}
	public static void main(String args[]){
		CtctArr c=new CtctArr();
		c.get();
	}

}