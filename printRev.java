class printRev{
	int a=173,d;
	void pr(){
		
		while(a>0){
		d=a%10;
		System.out.print(+d);
		a=a/10;
		}
		

	}
	public static void main(String args[]){
		printRev pR=new printRev();
		pR.pr();
	}
}