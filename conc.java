class conc{
	int a;
	String b;
	conc(){
		a=0;
		b="HI";

	}
	public void print(){
		System.out.println("a"+a+"b"+b);
	}
	public static void main(String args[]){
		conc c=new conc();
		c.print();
	}
}