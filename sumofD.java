class sumofD{
	int d,sum,num=1475;
	public void find(){
		while(num>0){
			d=num%10;
			sum=sum+d;
			num=num/10;
		}
		System.out.println("Sum= "+sum);
	}
	public static void main(String args[]){
		sumofD s=new sumofD();
		s.find();
	}
}