class b{
	public void bd(){
		int x=4;
		x+=x++ + ++x +x;         
		System.out.println(x);
	}
	public static void main(String args[]){
		b ob=new b();
		ob.bd();

	}
}