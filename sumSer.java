class sumSer{
	int sum;
	void find(){
		for(int i=1;i<=20;i++){
			sum=sum+(i/i+1);
		}
		System.out.println(sum);

	}
	public static void main(String args[]){
		sumSer v=new sumSer();
		v.find();
	}

}