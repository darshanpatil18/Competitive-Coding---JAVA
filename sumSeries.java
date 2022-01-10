class sumSeries{
	int sum;
	void find(){
		int sign=-1;
		for(int i=2;i<=20;i=i+2){
			sign=sign*-1;
			sum=sum+i*sign;
		}	
		System.out.println(sum);

	}
	public static void main(String args[]){
		sumSeries s=new sumSeries();
		s.find();
	}
}