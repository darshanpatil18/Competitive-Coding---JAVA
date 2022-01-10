class palin{
	int rem,r;
	int num=101;
	int p=num;
	void get(){
		while(num>0){
			rem=num%10;
			r=r*10+rem;
			num=num/10;
		

		}
		if(r==p)
			System.out.println("Its Palindrome nums");
		else
			System.out.println("Its not Palindrome nums");
	}
			


	public static void main(String args[]){
		palin o=new palin();
		o.get();
	}

}