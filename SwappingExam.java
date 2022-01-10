class SwappingExam{

	int x=10;
	int y=1;
	
	void swap(){
		if(x>y){
			x=x-y;
			y=x+y;
			x=y-x;
			
			
		}
		else{
			y=y-x;
			x=x+y;
			y=x-y;
			
		}
		System.out.println("Swapping of x::"+x);
		System.out.println("Swapping of y::"+y);


}
	public static void main(String args[]){

		SwappingExam s=new SwappingExam();
		s.swap();
	}
}