import java.io.*;
class Quad{
	double a,b,c,x;
		public void findQua(){
			try{
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			System.out.println("Enter value of a");
			String a1=br.readLine();
			a=Double.parseDouble(a1);

			System.out.println("Enter value of b");
			String b1=br.readLine();
			b=Double.parseDouble(b1);
			
			System.out.println("Enter value of c");
			String c1=br.readLine();
			c=Double.parseDouble(c1);
			
			System.out.println("Enter value of x");
			String x1=br.readLine();
			x=Double.parseDouble(x1);
			
			
			if(x<4){
			double y=a*Math.pow(x,2)+b*x+c;
			System.out.println("value of y:::"+y);
			}
			else{
			double y1=-a*Math.pow(x,2)+b*x-c;
			System.out.println("value of y:::"+y1);
			}
			}
			catch(IOException io){
				System.out.println("Entered Value is Wrong");
			}
		}


		public static void main(String args[]){
			Quad ob=new Quad();
			ob.findQua();				

		}





}