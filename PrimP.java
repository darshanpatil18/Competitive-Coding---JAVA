class PrimP{
	int count=0;
	int num=2;
	void m(){
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			count++;

		}
		if(count>0)
			System.out.println("Is not prime");
		else
			System.out.println("Is prime");
	
	}


	public static void main(String args[]){
		PrimP o=new PrimP();
		o.m();
	}

}