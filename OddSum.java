class OddSum{
	
	int d,num=123;
	double sum;
	public void find(){
		while(num>0){
			d=num%10;
			if(d%2!=0){
				sum=sum+d;
			}
			num=num/10;
		}
		System.out.println(sum);
		
	}
	
	public static void main(String args[]){
		OddSum s=new OddSum();
		s.find();
	}


}