class productArr{
	int num[]=new int[10];
	int pro=1;
	public void get(){
		for(int i=1;i<num.length;i++){
			num[i]=i;
		}
		for(int i=1;i<num.length;i++){
			pro=pro*num[i];
			
		}
		System.out.println("Product="+pro);
	}
	public static void main(String args[]){
		productArr pr=new productArr();
		pr.get();	
	}
}