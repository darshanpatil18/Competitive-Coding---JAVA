class Fact{
	int a;
	int n=15;
	double fact;
	public void findfac(){
		for(int a=1;n<=15;n++){
			fact=fact*a;}
			System.out.println("Factorial="+fact);
		}
	public static void main(String args[]){
			Fact ob=new Fact();
			ob.findfac();
		}
	}