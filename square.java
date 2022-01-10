class square{ 
		
	int d,num=15;
	double sq,sum;
	void find(){
		while(num>0){
		d=num%10;		
		sq=Math.pow(d,2);
		sum=sum+sq;
		num=num/10;
		}
		System.out.println("sum="+sum);
	}
	public static void main(String args[]){
		square s=new square();
		s.find();
	}
}