class pattern3{

	public void print(){
		for(int i=1;i<=5;i++){
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=5;j<=i;j--){
				System.out.print(j);
			}
			System.out.println();			
		}		
	}
	public static void main(String args[]){
		pattern3 p=new pattern3();
		p.print();
	}
}