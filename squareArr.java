class squareArr{
	int num[]={2,4,5,3,6};
	double sqr[]=new double[5];
	public void print(){
		System.out.println("Elements of Array are:::");
		for(int i=0;i<num.length;i++){
			
			System.out.println(+num[i]);
		}
	}
	public void square(){
		System.out.println("Elements of Squared Array are:::");
		for(int i=0;i<num.length;i++){
			sqr[i]=Math.pow(num[i],2);
			System.out.println(sqr[i]);
			
		}
		
	}
	public static void main(String args[]){
		squareArr sq=new squareArr();
		sq.print();
		sq.square();
	}
}