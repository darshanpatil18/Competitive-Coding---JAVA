class Prime{
	int num=6;
	int i;
	int n=0;
	public void CalPrime(){
		for(i=2;i<5;i++){
		System.out.println(num+ " is not prime no.");
		n=1;
		break;
	}
	if(n==0)
		System.out.println(num+ " is a prime no.");
	}
	public static void main(String args[]){
		Prime ob=new Prime();
		ob.CalPrime();
	}
}
		