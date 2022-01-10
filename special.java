class special{
	int d,sum=0,fact=1,num=145;
	void find(){
		int n=num;
		while(n!=0){ 
			d=n%10;
			for(int i=1;i<=d;i++){
			
			fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
			fact=1;
		}
		
		if(sum==num){
			System.out.println("Entered number is special");
			System.out.println(sum);
		}
		else{
			System.out.println("Entered number is not special");
			System.out.println(sum);
		}

	}
	
	
	public static void main(String args[]){
		special s=new special();
		s.find();
	}
}