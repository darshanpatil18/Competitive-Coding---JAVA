class sumSr{
	int sum,x=4;
	void find(){
		for(int i=2;i<=20;i=i+3){
			sum=sum+(x/i);
		}
		System.out.println(sum);
	}
	public static void main(String args[]){
		sumSr s=new sumSr();
		s.find();
	}
}