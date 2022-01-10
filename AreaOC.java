class AreaOC {
	public void findArea(){
		float r=2.51521202211f;
		float pi=3.141251f;
		
		float Area=pi*r*r;
		double A=Math.round(Area*100)/100.0;
		System.out.println("Area of circle="+A);
		
	}
public static void main(String args[]){
	AreaOC oba=new AreaOC();
	oba.findArea();
	}
}