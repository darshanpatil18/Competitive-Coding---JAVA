class factorial{
	double n=5;
	double fact=1;
	void find(){

		for(double i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("Factorial::"+fact);
	}
	public static void main(String args[]){
		factorial f=new factorial();
		f.find();
	}
}