class leap{
	int year=2016;
	void find(){
		if(year%4==0){
			System.out.println("Entered year is leap year");
		}
		else
			System.out.println("Entered year is not leap year");
	}	
	public static void main(String args[]){
		leap p=new leap();
		p.find();
	}
}