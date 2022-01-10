import java.io.*;
class Report{
	public void findGrade(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter % of Marks Obtained-");
		String mrk=br.readLine();
		int Mark=Integer.parseInt(mrk);
	
		if(Mark>=90){
		System.out.println("Your Grade is A+");
		}
		if(Mark>=80 && Mark<90){
		System.out.println("Your Grade is A");
		}
		if(Mark>=70 && Mark<80){
		System.out.println("Your Grade is B");
		}
		if(Mark>=60 && Mark<70){
		System.out.println("Your Grade is C");
		} 
		if(Mark>=40 && Mark<60){
		System.out.println("Your Grade is D");
		}
		if(Mark<40){
		System.out.println("Your Grade is F");
		}
		}
		catch(IOException io){
	
		}
	


	}
	public static void main(String args[]){
		Report ob=new Report();
		ob.findGrade();
	

	}



}