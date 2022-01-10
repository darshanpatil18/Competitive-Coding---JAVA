class darshanProg{
	int num=156;
	int prod=1,d;	
	public void find(){
		while(num!=0){
			d=num%10;
			prod=prod*d;
			num=num/10;
		}
		System.out.print(prod);

	}
	public static void main(String args[]){
		darshanProg d=new darshanProg();
		d.find();		
	}
}