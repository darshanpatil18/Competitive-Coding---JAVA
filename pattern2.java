class pattern2{

	public void print(){
		for(int i=5;i>=0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
				System.out.print("*");
				System.out.println();
		}

	}
	public static void main(String args[]){
		pattern2 p=new pattern2();
		p.print();
	}
}