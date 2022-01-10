//pg.182
class calculation{
	String name;
	double basicpay,hra,da;
		
	calculation(){
		basicpay=0.0;
		hra=0.0;
		da=0.0;
	}
	calculation(double x){
		this();
		basicpay=x;
		hra=(0.1)*basicpay;
		da=(0.4)*basicpay;
		
	}
	void compute(){
		double netsalary=basicpay+hra+da;
		System.out.println("Netsalary=="+netsalary);
		

	}
	public static void main(String args[]){
		calculation cc=new calculation(25000.00);
		cc.compute();
	}

}