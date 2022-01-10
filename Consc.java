class Consc{
	int x,y,z;
	Consc(){
		System.out.println("");
		System.out.println("In Default Consc");
		x=0;
		y=0;
		System.out.println(x);
		System.out.println(y);
		System.out.println("");
	}
	Consc(int a,int b){
		this();
		System.out.println("");
		System.out.println("In 2 Parameterized  Consc");
		x=a;
		y=b;
		System.out.println(x);
		System.out.println(y);
		System.out.println("");
	}
	Consc(int d,int e,int f){
		this(d,f);
		x=d;
		y=e;
		z=f;
		System.out.println("");
		System.out.println("In 3 Parameterized  Consc");	
		System.out.println(x);
		System.out.println(y);

	}


	public static void main(String args[]){
		Consc ct=new Consc(5,8);


	}



}