class Mult{

	int a,b,c,d,sum;
	
	
}
class MultInh extends Mult{

	void initialize(){
		a=10;
		b=30;
		c=47;
		d=23;
		sum=0;
		
	}
}
class MultInhe extends MultInh{

	void sum(){

		sum=a+b+c+d;
		System.out.println(sum);

	}
	public static void main(String args[]){
		MultInhe  sI=new MultInhe ();
		sI.initialize();
		sI.sum();

	}
}