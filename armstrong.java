class armstrong{
	int n=153;
	int d,s;
	public void find(){
		int i=n;
		while(n!=0){
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		if(s==i){
			System.out.println("Number is Armstrong");
		}
		else{
			System.out.println("Number is not Armstrong");
			}
	}
	public static void main(String args[]){
		armstrong a=new armstrong();
		a.find();
	}
}