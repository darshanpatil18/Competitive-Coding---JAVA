class Swapp{
	
	public void get(){
		int a=10;
		int b=15;
	
		if(a>b){
			a=a-b;
			b=a+b;
			a=b-a;
	
		}
		if(a<b){
			b=b-a;
			a=a+b;
			b=a-b;


		}
		System.out.println("Number after swapping a is::"+a);
		System.out.println("Number after swapping b is::"+b);


	}

	public static void main(String args[]){
		Swapp ob=new Swapp();
		ob.get();


	}

	}