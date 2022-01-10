class SumAr{
	int a[]={15,20,10,36,14};
	int sum;
	public void find(){
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		System.out.println(sum);
	}
	public static void main(String args[]){
		SumAr a=new SumAr();
		a.find();
	}
}