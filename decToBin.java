class decToBin{
	int num=2;
	void find(){
		int bin[]=new int[25];
		int in=0;
		while(num>0){
			bin[in++]=num%2;
			num=num/2;
	
		} 
		for(int i=in-1;i>=0;i--){
			System.out.print(bin[i]);
		} 
	}
	public static void main(String args[]){
		decToBin d=new decToBin();
		d.find();
	}
} 