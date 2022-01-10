class sumArr{
	int num[]=new int[51];
	int sum=0;
	void find(){
		for(int i=0;i<num.length;i++){
			sum=sum+i;
		}
		System.out.println("Sum="+sum);
	}
	public static void main(String args[]){
		sumArr ob=new sumArr();
		ob.find();
	}
}