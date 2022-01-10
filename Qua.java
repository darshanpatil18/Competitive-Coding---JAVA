//Pg.70.
class Qua{

	public void ans(){
		double a=10.6,b=16.6,c=15.5,ans1,ans2;
	
		if((b*b-4*a*c)>0){
			ans1=(-b+Math.sqrt(b*b-4*a*c)/(2*a));
			ans2=(-b-Math.sqrt(b*b-4*a*c)/(2*a));
			System.out.println("One root is:::"+ans1);
			System.out.println("Another root is:::"+ans2);
		}
		else if((b*b-4*a*c)==0){
			ans1=-b/(2*a);
			ans2=-b/(2*a);
			System.out.println("One root is:::"+ans1);
			System.out.println("Another root is:::"+ans2);
		}
		else{
			ans1=(-b+Math.sqrt(b*b-4*a*c)/(2*a));
			ans2=(-b-Math.sqrt(b*b-4*a*c)/(2*a));
			System.out.println("Roots are imaginary");
			System.out.println(" "+2+3);
		}


	}

	public static void main(String args[]){
		Qua ob=new Qua();
		ob.ans();


	}
	}