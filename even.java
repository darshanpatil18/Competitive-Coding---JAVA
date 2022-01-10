class even{
	int num=10;
	void find(){
		if(num%2==0){
			System.out.println("Entered number is even..");
		}
		else{
			System.out.println("Entered number is odd..");
		}
		
	}
	public static void main(String args[]){
		even n=new even();
		n.find();
	}
}