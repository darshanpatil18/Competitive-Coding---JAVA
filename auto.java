class auto{
	
	int d=10;
	int num=25;
	void cal(){

		if(d>=num){
			if((num*num)%d==num){
				System.out.println("Its automorphic");

			}
			else
				System.out.println("Its automorphic");
		}
		else if(d<=num){

			d=d*10;
			if((num*num)%d==num){
				System.out.println("Its automorphic");

			}
			else
				System.out.println("Its automorphic");
		}
	}
	public static void main(String args[]){
		auto ob=new auto();
		ob.cal();
	}
}