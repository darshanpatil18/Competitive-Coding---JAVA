class average{
	int d,sum,i,num=1475;
	public void find(){
		while(num>0){
			d=num%10;
			sum=sum+d;
			num=num/10;
			i+=1;
		}
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+((double)sum/i));
	}
	public static void main(String args[]){
		average a=new average();
		a.find();
	}
}