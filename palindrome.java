class palindrome{
	int d,sum,num=141;
	void find(){
		int n=num;
		while(num>0){
			d=num%10;
			sum=sum*10+d;
			num=num/10;
		}
		if(sum==n)
			System.out.println("Entered number is palindrome");
		else
			System.out.println("Entered number is not palindrome");
	}
	public static void main(String args[]){
		palindrome p=new palindrome();
		p.find();
	}
}