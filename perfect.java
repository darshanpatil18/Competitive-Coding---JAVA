class perfect{
	int sum,n=28;
	void find(){
		int num=n;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==num)
		System.out.println("PERFECT");
		
	}
	public static void main(String args[]){
		perfect p=new perfect();
		p.find();
	}
}