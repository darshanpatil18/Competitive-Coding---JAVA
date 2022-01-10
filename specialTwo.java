class specialTwo{
		int d,sum,prod=1,num=59;
	void find(){
		int n=num;

		while(n>0){
		d=n%10;
		sum=sum+d;
		prod=prod*d;
		n=n/10;
		}
		if((sum+prod)==num)
			System.out.println("Entered numbered is special two digit no.");
		else
			System.out.println("Entered numbered is not special two digit no.");
	
		}
	public static void main(String args[]){
		specialTwo v=new specialTwo();
		v.find();		
	}
}