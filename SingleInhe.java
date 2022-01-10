class Sing{

	int a=10;
	protected int b=15;
	int c=20;
	public int d=25;
	int sum;
	
}
class SingleInhe extends Sing{

	void sum(){
		sum=a+b+c+d;
		System.out.println("Sum::"+sum);


	}
	public static void main(String args[]){
		SingleInhe sI=new SingleInhe();
		sI.sum();

	}
}