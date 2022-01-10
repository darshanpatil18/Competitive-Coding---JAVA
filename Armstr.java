interface arm{

	public void find();
}
class Armstr implements arm{
	int num=153;
	int d,sum,n=num;

	public void find(){
		while(num>0){
			d=num%10;
			sum=sum+(d*d*d);
			num=num/10;
		}
		if(sum==n)
		System.out.println("Number is armstrong..");

		
	
	}

	public static void main(String args[]){
		Armstr a=new Armstr();
		a.find();
	}
}