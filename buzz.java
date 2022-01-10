class buzz{
	int num=21;
	int div,rem;
	void find(){
		rem=num%10;
		div=num%7;
		if(rem==7 || div==0){
			System.out.println("Entered num is buzz number");
		}
		else{
			System.out.println("Entered num is not buzz number");
		}
	}
	public static void main(String args[]){
		buzz b=new buzz();
		b.find();
	}
}