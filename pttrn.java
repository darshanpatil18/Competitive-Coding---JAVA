class pttrn{
	
	void print(){
		for(int i=1;i<=5;i++){
			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}
	public static void main(String args[]){
		pttrn p=new pttrn();
		p.print();
	}
}  