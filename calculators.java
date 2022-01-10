//pg.71
import java.io.*;
class calculators{
	int b=10;
	int c=5;
	int result;
	public void get(){
	try{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Your Choice(+-/*%)");
		String a1=br.readLine();
		char a=a1.charAt(0);
		switch(a){
		
		case '+':
			result=b+c;
			System.out.println("Sum::"+result);
			break;
		case '-':
			result=b-c;
			System.out.println("Difference::"+result);
			break;

		case '*':
			result=b*c;
			System.out.println("Product::"+result);
			break;
		case '/':
			result=b/c;
			System.out.println("Quotient::"+result);
			break;

		case '%':
			result=b%c;
			System.out.println("Remainder::"+result);
			break;
		default:
			System.out.println("Entered Value is Wrong");
			break;
		}

	}
	catch(IOException nf){
	
	}


	}
	public static void main(String args[]){
		calculators ob=new calculators();
		ob.get();



	}


}