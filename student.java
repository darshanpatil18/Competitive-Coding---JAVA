//pg 175
import java.io.*;
class student{
	String name;
	int age,m1,m2,m3,maximum;
	double average;
	
	student(String n,int a,int m,int ma,int maa,int maaa,double avg){
		name=n;
		age=a;
		m1=m;
		m2=ma;
		m3=maa;
		maximum=maaa;
		average=avg;	
	}
	
	void input(){
		try{
			InputStreamReader irs=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(irs);
			System.out.println("Enter name");
			name=br.readLine();
			
			System.out.println("Enter age");
			String ag=br.readLine();
			age=Integer.parseInt(ag);
			
			System.out.println("Enter marks1");
			String mk=br.readLine();
			m1=Integer.parseInt(mk);
					
			System.out.println("Enter marks2");
			String mkk=br.readLine();
			m2=Integer.parseInt(mkk);
			
			System.out.println("Enter marks3");
			String mkkk=br.readLine();
			m3=Integer.parseInt(mkkk);
		
		}
		catch(IOException io){}
		
	}
	void compute(){
		average=(m1+m2+m3)/3.0;
		maximum=Math.max(m1,(Math.max(m2,m3)));

	}
	void display(){
		System.out.println("Name="+name);
		System.out.println("Average="+average);
		System.out.println("Maximum="+maximum);

	}
	public static void main(String args[]){
		student ob=new student("Darshan",51,98,99,94,99,97.0);
		ob.input();
		ob.compute();
		ob.display();
	}
}