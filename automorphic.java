class automorphic{
	static int d=10;
	int num=25;
	void auto(){
		
		if(d>=num){
			if((num*num)%d==num){
				System.out.println("Entered number is Automorphic num.");
			}
			else{
				
				System.out.println("Entered number is not Automorphic num.");
			}
		}
		else{
			d=d*10;
			
			if((num*num)%d==num){
				System.out.println("Entered number is Automorphic num.");
			}
			else{
				
				System.out.println("Entered number is not Automorphic num.");
			}
			
		}
		

	}
	public static void main(String args[]){
		automorphic a=new automorphic();
		a.auto();
	}
}