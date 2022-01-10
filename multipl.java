class multipl{
	int m=1;
	int mul;
	void multiply(){

		for(int r=1;r<10;){
			mul=9*r;			
			++r;
			System.out.println(mul);
			
		}		

	}
	public static void main(String args[]){
		multipl m=new multipl();
		m.multiply();	
	}
}