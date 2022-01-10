class Hierarchy{

	int a=15,b=14,c=14,d=14,sum;
	
	
}
class HierInh extends Hierarchy{

	void initialize(){
		a=10;
		b=30;
		c=47;
		d=23;
		sum=0;
		
	}
}
class HierInhe extends Hierarchy{

	void sum(){

		sum=a+b+c+d;
		System.out.println(sum);

	}
	public static void main(String args[]){
		HierInhe  sI=new HierInhe ();
		HierInh  s2=new HierInh ();
		s2.initialize();
		sI.sum();

	}
}