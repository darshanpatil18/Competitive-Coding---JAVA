class special{
	int n=145;
	int a=1;
	int s=0,rem,fact,i;	
	void sp(){
	
		int num=n;
		while(n>0){
			rem=n%10;
			for(i=1;i<=n;i++){
			fact=fact*rem;
	
			}
			s=s+fact;
			n=n/10;

		}		
		if(s==num){
			System.out.println("Its special number");
		}
		else{
			System.out.println("Its not special number");
		}
	}

	public static void main(String args[]){
		special s=new special();
		s.sp();


	}

}