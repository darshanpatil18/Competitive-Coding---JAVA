class fibo{
	
	public void find(int n){
		int a=1,c;
		int b=1;
		c=a+b;
		System.out.print("The series is");
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		
		for(int i=0;i<n-3;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.print(c);
		}
	}
	public static void main(String args[]){
		fibo f=new fibo();
		f.find(5);
	}

}