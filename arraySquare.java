class arraySquare{
	int a[]={1,5,15,6,9};
	int sq[]=new int[5];
	int i;
	void squa(){
		for(i=0;i<5;i++){
			sq[i]=(int)Math.pow(a[i],2);
			System.out.println("Square array="+sq[i]);
		
		}
			

	}
	public static void main(String args[]){
		arraySquare arraySquare1=new arraySquare();
		arraySquare1.squa();
		
	}
}