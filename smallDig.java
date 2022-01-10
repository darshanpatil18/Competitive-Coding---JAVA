class smallDig{
	int num=453;
	int sma,small;
	public void find(){
		sma=num%10;
		while(num>0){
			small=num%10;
			if(small<sma)
				sma=small;
				num=num/10;
		}
		System.out.println(sma);

	}
	public static void main(String args[]){
		smallDig s=new smallDig();
		s.find();
	}
}