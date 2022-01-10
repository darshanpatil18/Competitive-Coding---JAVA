class AreaOfCircle {
	public void findArea(){
		double area;
		double r=7.04D;
		if(r<0)
		area=3.14D*Math.pow(r,2);
		System.out.println("Area Of Circle="+area);
		}
	public static void main(String args[]){
		AreaOfCircle ob=new AreaOfCircle();
		ob.findArea();
		}
	} 