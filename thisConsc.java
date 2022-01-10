class thisConsc{
	
	thisConsc(){
		System.out.println("Hi");

	}
	thisConsc(int a){
		this();
		System.out.println(a);
	}
	thisConsc(int b,int c){
		this(14);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String args[]){
		thisConsc c=new thisConsc(1,2);
	}
}