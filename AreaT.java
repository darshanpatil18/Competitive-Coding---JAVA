class AreaT{

	public void find(){
		double a=2.5;
		double b=3.2;
		double c=4.5;
		double s=(a+b+c)/2;
		double area;
		area=s*(s-a)*(s-b)*(s-c);
		double sqr=Math.sqrt(area);
		
		System.out.println(sqr);

	}

	public static void main(String args[]){
		AreaT t=new AreaT();
		t.find();
	}
}